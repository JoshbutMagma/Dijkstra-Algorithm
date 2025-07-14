
/**
 * List of all the weights
 *
 * Josh Hunter
 * 14/07/25 - 
 */
public class WeightList
{
    private Bridge firstBridge;
    
    public WeightList(){
        
    }
    public WeightList(Bridge firstBridge){
        this.firstBridge = firstBridge;
    }
    
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
    
    public void setFirstBridge(){
        this.firstBridge = firstBridge;
    }
}