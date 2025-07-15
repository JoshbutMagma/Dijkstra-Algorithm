
/**
 * Where the linked list object will be started
 *
 * Josh Hunter
 * 17/06/25 - 
 */
public class LinkedList
{
    private Node firstNode;
    private Node finalNode;
    
    /**
     * Constructors for the list of nodes
     */
    public LinkedList(){
        
    }
    public LinkedList(Node firstNode){
        this.firstNode = firstNode;
        getFirstNode().setDistance(0);
        this.finalNode = firstNode;
    }
    
    /**
     * Getters for the node list
     */
    public Node getFirstNode(){
        return(this.firstNode);
    }
    public Node getFinalNode(){
        return(this.finalNode);
    }
    
    /**
     * Setters for the node list
     */
    public void setFirstNode(Node firstNode){
        this.firstNode = firstNode;
    }
    public void setFinalNode(Node finalNode){
        this.finalNode = finalNode;
    }
}
