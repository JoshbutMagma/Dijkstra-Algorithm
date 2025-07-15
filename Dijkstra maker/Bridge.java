
/**
 * Object class for the bridges
 *
 * Josh Hunter
 * 14/07/25
 */
public class Bridge
{
    private Node firstNode;
    private Node secondNode;
    private int bridgeWeight;
    private Bridge nextBridge;
    
    /**
     * Constructor for a bridge
     */
    public Bridge(Node firstNode, Node secondNode, int bridgeweight){
        this.firstNode = firstNode;
        this.secondNode = secondNode;
        this.bridgeWeight = bridgeWeight;
        this.nextBridge = null;
    }
    
    /**
     * Various getters for bridges
     */
    public Node getFirstNode(){
        return(this.firstNode);
    }
    public Node getSecondNode(){
        return(this.secondNode);
    }
    public int getBridgeWeight(){
        return(this.bridgeWeight);
    }
    public Bridge getNextBridge(){
        return(this.nextBridge);
    }
    
    /**
     * Setting the next bridge for a bridge in the list
     * The other variables won't be changed
     */
    public void setNextBridge(Bridge nextBridge){
        this.nextBridge = nextBridge;
    }
}