
/**
 * Where the actual Dijkstra's algorithm will be done
 *
 * Josh Hunter
 * 17/06/25 - 
 */
import java.util.ArrayList;
public class Algorithm
{
    public LinkedList nodeList;
    public WeightList weightList;
    /**
     * Create a new node
     */
    private void newNode(int nodeNum){
        Node node = nodeList.getFinalNode();
        nodeList.setFinalNode(new Node(nodeNum));
        node.setNextListNode(nodeList.getFinalNode());
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
    private void newBridge(Node firstNode, Node secondNode, int bridgeWeight){
        Bridge bridge = weightList.getFirstBridge();
        while(bridge.getNextBridge()!=null){
            bridge = bridge.getNextBridge();
        }
        bridge.setNextBridge(new Bridge(firstNode, secondNode, bridgeWeight));
    }
    
    public Algorithm(){
        //Initialising stuff
        boolean stillGoing = true;
        int thisCost;
        ArrayList<Bridge> connectingBridges = new ArrayList<Bridge>();
        Node currentNode;
        Node otherNode;
        Bridge checkingBridge;
        
        //Dijkstra's Algorithm
        while(stillGoing==true){
            //End the program if there are no more nodes
            if(nodeList.getFirstNode()==null){
                stillGoing = false;
            }
            
            currentNode = popNode(); //Remove a node from the list, and start to look at it
            //The workings that happen if the node hasn't been completed yet
            if(currentNode.getCompletedStatus()==false){
                //Remove all current entries from the ArrayList to make room for new entries
                while(connectingBridges.size()>0){
                    connectingBridges.remove(connectingBridges.size()-1);
                }
                
                //Add all valid bridges to the ArrayList
                checkingBridge = weightList.getFirstBridge();
                while(checkingBridge.getNextBridge()!=null){
                    if(checkingBridge.getFirstNode()==currentNode||checkingBridge.getSecondNode()==currentNode){
                        connectingBridges.add(checkingBridge);
                    }
                    checkingBridge = checkingBridge.getNextBridge();
                }
                
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
                    if(otherNode.getDistance()==-1){ //If the node doesn't have a set distance yet
                        otherNode.setDistance(thisCost);
                        otherNode.setPreviousNode(currentNode);
                    }else if(otherNode.getDistance()>thisCost){ //If the node has a set distance that's greater than thisCost
                        otherNode.setDistance(thisCost);
                        otherNode.setPreviousNode(currentNode);
                    }
                }
            }
            currentNode.setCompletedStatus(true);
        }
    }
}
