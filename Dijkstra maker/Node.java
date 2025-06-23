
/**
 * Object class for nodes
 *
 * Josh Hunter
 * 16/06/25 - 
 */
public class Node
{
    private int nodeNum;
    private Node prevNode;
    private int distance;
    
    /**
     * Constructor for a node
     */
    public Node(){
        this.nodeNum = 0;
        this.prevNode = null;
        this.distance = -1;
    }
    public Node(int nodeNum){
        this.nodeNum = nodeNum;
        this.prevNode = null;
        this.distance = -1;
    }
    
    /**
     * Various getters for nodes
     */
    public int getNodeNum(){
        return(this.nodeNum);
    }
    public Node getprevNode(){
        return(this.prevNode);
    }
    public int getDistance(){
        return(this.distance);
    }
    
    /**
     * Various setters for nodes
     */
    public void setPrevNode(Node prevNode){
        this.prevNode = prevNode;
    }
    public void setDistance(int distance){
        this.distance = distance;
    }
}
