
public class SystemInterface {
    private static final Invoker INVOKER = new Invoker();
    
    public static String getMenu() {
        Menu menu = INVOKER.getMenu();
        MenuIterator itr = menu.getAllItemsIterator();
        int num = 1;
        String str = "Menu Items";
        while (itr.hasNext()) {
            MenuItem item = itr.getItem();
            if(item.getAvailable()) {
            	str += ("\n" + num + " " + item.getName()) + "\t" + item.getPrice();
                num++;
            }
            else {
            	str += ("\n" + num + " " + item.getName()) + "\t" + "Out of Stock";
                num++;
            }
            itr.next();            
        }
        return str;
    }
    
    public static String getHeartHealthyMenu() {
        Menu menu = INVOKER.getHeartHealthyMenu();
        MenuIterator itr = menu.getHeartHealthyIterator();
        String str = "Heart Healthy Menu Items";
        while (itr.hasNext()) {
            MenuItem item = itr.getItem();
            str += "\n" + item.getName();
            itr.next(); 
        }
        return str;
    }
    
    public static void submitOrder(int itemNumber) {
        Menu menu = INVOKER.getMenu();
        if(menu.menuList.get(itemNumber).getAvailable()) {
        	ItemNumberIterator itr = new ItemNumberIterator(menu.menuList, itemNumber);
            Orders order = INVOKER.getOrders();
            MenuItem item;
            itr.hasNext();
            item = itr.getItem();
            order.addOrder(item);
            StockpileSubject stockSubject = INVOKER.getSubject();
            stockSubject.useStock(item);
            System.out.println(item.getName() + " order added\n");
        }
        else {
        	System.out.println("Item " + itemNumber + 1 + " unavailable");
        }
    }
    
    public static String displayTab() {
        Tab tab = INVOKER.getTab();
        String str = "Tab " + tab.getTableNumber() + ":\n";
        str += tab.toString();
        return str;
    }
    
    public static String displayStockpile() {
    	System.out.println("STockpile");
    	Stockpile stock = INVOKER.getStockpile();
    	return stock.toString();
    	
    }
    
}