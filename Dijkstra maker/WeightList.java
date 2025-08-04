
/**
 * List of all the weights
 *
 * Josh Hunter
 * 14/07/25 - 
 */
public class WeightList
{
    private Bridge firstBridge;
    
    /**
     * Constructors for the bridge list
     */
    public WeightList(){
        
    }
    public WeightList(Bridge firstBridge){
        this.firstBridge = firstBridge;
    }
    
    /**
     * Getter and finder for bridges
     */
    public Bridge getFirstBridge(){
        return(this.firstBridge);
    }
    public Bridge findBridge(int bridgeNum){
        Bridge bridge = this.getFirstBridge();
        for(int i=1; i<bridgeNum; i++){
            bridge = bridge.getNextBridge();
        }
        return(bridge);
    }
    
    /**
     * Setter for the bridge list
     */
    public void setFirstBridge(Bridge firstBridge){
        this.firstBridge = firstBridge;
    }
}