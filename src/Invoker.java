
public class Invoker {
    private Aggregator agg;
    
    public Invoker() {
        agg = new Aggregator();
        agg.initialize();
    }
    
    public Menu getMenu() {
        return (Menu) new CMDGetMenu(agg).execute();
    }
    
    public Menu getHeartHealthyMenu() {
        return (Menu) new CMDGetHeartHealthyMenu(agg).execute();
    }
    
    public Tab getTab() {
        return (Tab) new CMDGetTab(agg).execute();
    }
    
    public Orders getOrders() {
    	return (Orders) new CMDGetOrders(agg).execute();
    }
    
    public Stockpile getStockpile() {
    	return (Stockpile) new CMDGetStockpile(agg).execute();
    }
    
    public StockpileSubject getSubject() {
    	return (StockpileSubject) new CMDGetStockpileSubject(agg).execute();
    }
    
}
