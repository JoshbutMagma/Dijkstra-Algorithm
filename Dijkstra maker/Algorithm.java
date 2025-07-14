
/**
 * Where the actual Dijkstra's algorithm will be done
 *
 * Josh Hunter
 * 17/06/25 - 
 */
public class Algorithm
{
    public LinkedList list;
    private void newNode(int nodeNum){
        Node node = list.getFinalNode();
        list.setFinalNode(new Node(nodeNum));
        list.getFinalNode().setPreviousNode(node);
    }
    public Algorithm(){
        /**
         * Testing a linear version of the algorithm
         */
        list = new LinkedList(new Node(1));
        for(int i=0; i<2; i++){
            newNode(i+2);
        }
    }
}
