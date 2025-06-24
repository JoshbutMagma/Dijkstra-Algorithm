
/**
 * Where the actual Dijkstra's algorithm will be done
 *
 * Josh Hunter
 * 17/06/25 - 
 */
public class Algorithm
{
    LinkedList demo;
    public Algorithm(){
        /**
         * Testing a linear version of the algorithm
         */
        demo = new LinkedList(new Node(1));
        Node node;
        for(int i=2; i<4; i++){
            node = demo.getFinalNode();
            demo.setFinalNode(new Node(i));
            demo.getFinalNode().setPreviousNode(node);
        }
    }
}
