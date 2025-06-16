
/**
 * Object class for nodes
 *
 * Josh Hunter
 * 16/06/25 - 
 */
public class Node
{
    private int nodeNum;
    private Node lastNode;
    private int distance;
    
    /**
     * Constructor for a node
     */
    public Node(int nodeNum){
        this.nodeNum = nodeNum;
        this.lastNode = null;
        this.distance = -1;
    }
    
    /**
     * Various getters for nodes
     */
    public int getNodeNum(){
        return(this.nodeNum);
    }
    public Node getLastNode(){
        return(this.lastNode);
    }
    public int getDistance(){
        return(this.distance);
    }
    
    /**
     * Various setters for nodes
     */
    public void setLastNode(Node lastNode){
        this.lastNode = lastNode;
    }
    public void setDistance(int distance){
        this.distance = distance;
    }
}
