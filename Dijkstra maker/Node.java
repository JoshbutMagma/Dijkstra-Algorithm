
/**
 * Object class for nodes
 *
 * Josh Hunter
 * 16/06/25 - 
 */
public class Node
{
    private int nodeNum;
    private Node previousNode;
    private int distance;
    private boolean completedStatus;
    private Node nextListNode;
    
    /**
     * Constructor for a node
     */
    public Node(int nodeNum){
        this.nodeNum = nodeNum;
        this.previousNode = null;
        this.distance = -1;
        this.completedStatus = false;
        this.nextListNode = null;
    }
    
    /**
     * Various getters for nodes
     */
    public int getNodeNum(){
        return(this.nodeNum);
    }
    public Node getPreviousNode(){
        return(this.previousNode);
    }
    public int getDistance(){
        return(this.distance);
    }
    public boolean getCompletedStatus(){
        return(this.completedStatus);
    }
    public Node getNextListNode(){
        return(this.nextListNode);
    }
    
    /**
     * Various setters for nodes
     */
    public void setPreviousNode(Node previousNode){
        this.previousNode = previousNode;
    }
    public void setDistance(int distance){
        this.distance = distance;
    }
    public void setCompletedStatus(boolean completedStatus){
        this.completedStatus = completedStatus;
    }
    public void setNextListNode(Node nextListNode){
        this.nextListNode = nextListNode;
    }
}
