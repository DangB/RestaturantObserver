
public class CMDGetMenu implements Command{
    private Aggregator agg;
    
    public CMDGetMenu(Aggregator agg) {
        this.agg = agg;
    }

    public Object execute() {
        return agg.getMenu();
    }
    
}
