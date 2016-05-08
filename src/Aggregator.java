
public class Aggregator {
    private Menu menu;
    private Tab tab;
    private Orders order;
    private Stockpile stock;
    private StockpileSubject subject;
    
    public Menu getMenu() {
        return menu;
    }
    
    public Tab getTab() {
        return tab;
    }
    
    public Orders getOrder() {
        return order;
    }
    
	public void initialize() {
        menu = new Menu();
        order = new Orders();
        tab = new Tab(1, order);
        stock = Stockpile.getInstance();
        subject = new StockpileSubject();
        menu.intializeMenu();
        StockpileObserver Observer0 = new StockpileObserver(subject, menu.menuList.get(0));
        StockpileObserver Observer1 = new StockpileObserver(subject, menu.menuList.get(1));
        StockpileObserver Observer2 = new StockpileObserver(subject, menu.menuList.get(2));
        StockpileObserver Observer3 = new StockpileObserver(subject, menu.menuList.get(3));
        StockpileObserver Observer4 = new StockpileObserver(subject, menu.menuList.get(4));
        StockpileObserver Observer5 = new StockpileObserver(subject, menu.menuList.get(5));
        StockpileObserver Observer6 = new StockpileObserver(subject, menu.menuList.get(6));
        StockpileObserver Observer7 = new StockpileObserver(subject, menu.menuList.get(7));
        StockpileObserver Observer8 = new StockpileObserver(subject, menu.menuList.get(8));
        StockpileObserver Observer9 = new StockpileObserver(subject, menu.menuList.get(9));
        StockpileObserver Observer10 = new StockpileObserver(subject, menu.menuList.get(10));
        StockpileObserver Observer11 = new StockpileObserver(subject, menu.menuList.get(11));
        StockpileObserver Observer12 = new StockpileObserver(subject, menu.menuList.get(12));
        StockpileObserver Observer13 = new StockpileObserver(subject, menu.menuList.get(13));
        StockpileObserver Observer14 = new StockpileObserver(subject, menu.menuList.get(14));
        StockpileObserver Observer15 = new StockpileObserver(subject, menu.menuList.get(15));
    }
    
    public void initTab() {
    	tab = new Tab(1, order);
    }
    
    public Stockpile getStockpile() {
    	return stock;
    }
    
    public StockpileSubject getStockpileSubject() {
    	return subject;
    }
    
}
