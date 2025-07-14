
/**
 * Where the actual Dijkstra's algorithm will be done
 *
 * Josh Hunter
 * 17/06/25 - 
 */
public class Algorithm
{
    public LinkedList nodeList;
    public WeightList weightList;
    private void newNode(int nodeNum){
        Node node = nodeList.getFinalNode();
        nodeList.setFinalNode(new Node(nodeNum));
        nodeList.getFinalNode().setPreviousNode(node);
    }
    private Node popNode(){
        Node node = nodeList.getFirstNode();
        Node checkingNode = nodeList.getFinalNode();
        Node backupNode = checkingNode;
        while(checkingNode.getPreviousNode()!=null){
            backupNode = checkingNode;
            checkingNode = checkingNode.getPreviousNode();
        }
        return backupNode;
    }
    private void newBridge(Node firstNode, Node secondNode, int bridgeWeight){
        Bridge bridge = weightList.getFirstBridge();
        while(bridge.getNextBridge()!=null){
            bridge = bridge.getNextBridge();
        }
        bridge.setNextBridge(new Bridge(firstNode, secondNode, bridgeWeight));
    }
    public Algorithm(){
        boolean stillGoing = true;
        Node currentNode;
        while(stillGoing==true){
            if(nodeList.getFirstNode()==null){
                stillGoing = false;
            }
            currentNode = popNode();
        }
    }
}
