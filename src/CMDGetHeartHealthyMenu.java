
class CMDGetHeartHealthyMenu implements Command {
    
private Aggregator agg;

    public CMDGetHeartHealthyMenu(Aggregator agg) {
        this.agg = agg;
    }
    
    public Object execute() {
        return agg.getMenu();
    }

    
}
