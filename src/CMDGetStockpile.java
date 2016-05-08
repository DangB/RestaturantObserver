
public class CMDGetStockpile implements Command{

	private Aggregator agg;
    
    public CMDGetStockpile(Aggregator agg) {
        this.agg = agg;
    }

	public Object execute() {
        return agg.getStockpile();
    }

}
