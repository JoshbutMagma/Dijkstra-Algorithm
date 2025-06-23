
/**
 * Where the actual Dijkstra's algorithm will be done
 *
 * Josh Hunter
 * 17/06/25 - 
 */
public class Algorithm
{
    LinkedList demo;
    public void dijkstraAlgorithm(){
        /**
         * Testing a linear version of the algorithm
         */
        demo = new LinkedList();
        Node node;
        for(int i=2; i<4; i++){
            node = demo.getFinalNode();
            demo.setFinalNode(new Node(i));
            demo.getFinalNode().setPreviousNode(node);
        }
    }
}
