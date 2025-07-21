
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
        nodeList.getFinalNode().setPreviousNode(node);
    }
    /**
     * Remove a node while copying it's data
     */
    private Node popNode(){
        Node checkingNode = nodeList.getFinalNode();
        Node backupNode = checkingNode;
        while(checkingNode.getPreviousNode()!=null){
            backupNode = checkingNode;
            checkingNode = checkingNode.getPreviousNode();
        }
        nodeList.setFirstNode(backupNode);
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
        boolean stillGoing = true;
        int thisCost;
        ArrayList<Bridge> connectingBridges = new ArrayList<Bridge>();
        Node currentNode;
        Bridge checkingBridge;
        while(stillGoing==true){
            if(nodeList.getFirstNode()==null){
                stillGoing = false; //End the program if there are no more nodes
            }
            currentNode = popNode();
            if(currentNode.getCompletedStatus()==false){
                while(connectingBridges.size()>0){
                    connectingBridges.remove(connectingBridges.size()-1);
                }
                checkingBridge = weightList.getFirstBridge();
                while(checkingBridge.getNextBridge()!=null){
                    if(checkingBridge.getFirstNode()==currentNode||checkingBridge.getSecondNode()==currentNode){
                        connectingBridges.add(checkingBridge);
                    }
                    checkingBridge = checkingBridge.getNextBridge();
                }
                
            }
        }
    }
}
