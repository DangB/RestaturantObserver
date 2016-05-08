

public class Tab {
    public int tableNumber;
    public Orders order;
    public boolean paid = false;
    
    public Tab (int tableNumber, Orders order) {
        this.tableNumber = tableNumber;
        this.order = order;
    }
    
    public int getTableNumber() {
    	return tableNumber;
    }
    
    public String toString() {
    	return order.toString();
    }
}
