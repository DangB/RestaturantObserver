
public class CMDGetOrders implements Command{
private Aggregator agg;
    
    public CMDGetOrders(Aggregator agg) {
        this.agg = agg;
    }

	public Object execute() {
		return agg.getOrder();
	}
	

}
