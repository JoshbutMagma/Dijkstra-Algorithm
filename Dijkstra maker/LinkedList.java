
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
    
    public LinkedList(){
        this.firstNode = null;
        this.finalNode = null;
    }
    public LinkedList(Node firstNode){
        this.firstNode = firstNode;
        this.finalNode = null;
    }
    
    public Node getFirstNode(){
        return(this.firstNode);
    }
    public Node getFinalNode(){
        return(this.finalNode);
    }
    
    public void setFirstNode(Node firstNode){
        this.firstNode = firstNode;
    }
    public void setFinalNode(Node finalNode){
        this.finalNode = finalNode;
    }
}
