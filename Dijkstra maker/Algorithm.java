
/**
 * Where the actual Dijkstra's algorithm will be done
 *
 * Josh Hunter
 * 17/06/25 - 
 */
import java.util.ArrayList;
import java.util.Random;
public class Algorithm
{
    public LinkedList nodeList = new LinkedList();
    public WeightList weightList = new WeightList();
    /**
     * Create a new node
     */
    private void newNode(int numOfNode){
        if(nodeList.getFinalNode()!=null){
            Node node = nodeList.getFinalNode();
            nodeList.setFinalNode(new Node(numOfNode));
            node.setNextListNode(nodeList.getFinalNode());
        }else{
            Node node = new Node(1);
            nodeList.setFirstNode(node);
            nodeList.setFinalNode(node);
            node.setDistance(0);
        }
    }
    /**
     * Remove a node while copying it's data
     */
    private Node popNode(){
        Node checkingNode = nodeList.getFirstNode();
        nodeList.setFirstNode(checkingNode.getNextListNode());
        return checkingNode;
    }
    /**
     * Create a new bridge
     */
    private void newBridge(int nodeNum){
        Random random = new Random();
        boolean bridgeLoop = true;
        int repeatLock;
        int secondRepeatLock;
        int firstNode = 0;
        int secondNode = 0;
        int bridgeWeight;
        Node firstBridgeNode = nodeList.getFirstNode();
        Node secondBridgeNode = nodeList.getFirstNode();
        Bridge thisBridge;
        Bridge thatBridge;
        Bridge checkingBridge;
        
        while(bridgeLoop){
            firstNode = random.nextInt(nodeNum);
            secondNode = random.nextInt(nodeNum);
            
            firstBridgeNode = nodeList.getFirstNode();
            for(int i=0; i<firstNode; i++){
                firstBridgeNode = firstBridgeNode.getNextListNode();
            }
            
            secondBridgeNode = nodeList.getFirstNode();
            for(int i=0; i<secondNode; i++){
                secondBridgeNode = secondBridgeNode.getNextListNode();
            }
            
            repeatLock = 0;
            secondRepeatLock = 0;
            checkingBridge = weightList.getFirstBridge();
            if(firstNode!=secondNode){
                if(weightList.getFirstBridge()!=null){
                    while(checkingBridge.getNextBridge()!=null){
                        if(!(firstBridgeNode==checkingBridge.getFirstNode()&&secondBridgeNode==checkingBridge.getSecondNode())&&!(firstBridgeNode==checkingBridge.getSecondNode()&&secondBridgeNode==checkingBridge.getFirstNode())){
                            repeatLock++;
                        }
                        secondRepeatLock++;
                    }
                    if(repeatLock==secondRepeatLock&&repeatLock!=0){
                        bridgeLoop = false;
                    }
                }else{bridgeLoop=false;}
            }
        }
        
        bridgeWeight = random.nextInt(15);
        bridgeWeight++;
        
        thisBridge = new Bridge(firstBridgeNode, secondBridgeNode, bridgeWeight);
        
        if(weightList.getFirstBridge()!=null){
            thatBridge = weightList.getFirstBridge();
            while(thatBridge.getNextBridge()!=null){
                thatBridge = thatBridge.getNextBridge();
            }
            thatBridge.setNextBridge(thisBridge);
        }else{
            weightList.setFirstBridge(thisBridge);
        }
    }
    
    public Algorithm(int nodeNum, int bridgeNum){
        //Initialising stuff
        boolean stillGoing = true;
        int thisCost;
        int currentNum;
        ArrayList<Bridge> connectingBridges = new ArrayList<Bridge>();
        Node currentNode;
        Node otherNode;
        Node goalNode;
        Bridge checkingBridge;
        
        System.out.println("Starting making nodes");
        //Creating nodes
        for(int i=0; i<nodeNum; i++){
            newNode(i+1);
            System.out.println("Made new node");
        }
        goalNode = nodeList.getFinalNode();
        
        System.out.println("Starting making bridges");
        //Creating bridges
        for(int i=0; i<bridgeNum; i++){
            newBridge(nodeNum);
            System.out.println("Made new bridge");
        }
        
        System.out.println("Started algorithm");
        //Dijkstra's Algorithm
        while(stillGoing==true){
            System.out.println("Checking if there is a valid node");
            //End the program if there are no more nodes
            if(goalNode.getCompletedStatus()==true){
                stillGoing = false;
            }
            
            System.out.println("Started working on a node");
            if(nodeList.getFirstNode().getNextListNode()==null){
                stillGoing = false;
            }
            currentNode = popNode(); //Remove a node from the list, and start to look at it
            //The workings that happen if the node hasn't been completed yet
            if(currentNode.getCompletedStatus()==false){
                //Remove all current entries from the ArrayList to make room for new entries
                while(connectingBridges.size()>0){
                    connectingBridges.remove(connectingBridges.size()-1);
                }
                
                System.out.println("Starting adding bridges to a list");
                //Add all valid bridges to the ArrayList
                checkingBridge = weightList.getFirstBridge();
                while(checkingBridge.getNextBridge()!=null){
                    if(checkingBridge.getFirstNode()==currentNode||checkingBridge.getSecondNode()==currentNode){
                        connectingBridges.add(checkingBridge);
                    }
                    checkingBridge = checkingBridge.getNextBridge();
                }
                
                System.out.println("Started updating nodes");
                //Updating all the nodes attached to bridges
                for(int i=0; i<connectingBridges.size(); i++){
                    otherNode = currentNode; //This part doesn't do anything in the grand scheme of things since otherNode's value is changed immediately afterwards, however the programming doesn't work without it
                    thisCost = currentNode.getDistance() + connectingBridges.get(i).getBridgeWeight();
                    
                    //Change otherNode to the other node
                    if(connectingBridges.get(i).getFirstNode()==currentNode){
                        otherNode = connectingBridges.get(i).getSecondNode();
                    }else if(connectingBridges.get(i).getSecondNode()==currentNode){
                        otherNode = connectingBridges.get(i).getFirstNode();
                    }
                    System.out.println("Updating nodes");
                    if(otherNode.getDistance()==-1){ //If the node doesn't have a set distance yet
                        otherNode.setDistance(thisCost);
                        otherNode.setPreviousNode(currentNode);
                    }else if(otherNode.getDistance()>thisCost){ //If the node has a set distance that's greater than thisCost
                        otherNode.setDistance(thisCost);
                        otherNode.setPreviousNode(currentNode);
                    }
                }
                currentNode.setCompletedStatus(true);
            }
        }
        System.out.println("Finished algorithm");
        
        Node finalNode = nodeList.getFinalNode();
        while(finalNode.getPreviousNode()!=null){
            System.out.println("Node " + finalNode.getNodeNum() + " with a distance of " + finalNode.getDistance());
            finalNode = finalNode.getPreviousNode();
        }
        System.out.println("Node " + finalNode.getNodeNum() + " with a distance of " + finalNode.getDistance());
    }
}
