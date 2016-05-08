
public class CMDGetStockpileSubject {
	
	private Aggregator agg;
    
    public CMDGetStockpileSubject(Aggregator agg) {
        this.agg = agg;
    }

	public Object execute() {
        return agg.getStockpileSubject();
    }

}
