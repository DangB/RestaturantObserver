

public class CMDSubmitOrder implements Command{
    Aggregator agg;
    
    public CMDSubmitOrder (Aggregator agg) {
        this.agg = agg;
    }

    public Object execute() {
        
        return agg.getOrder();
    }

    
}
