import java.util.*;
public class Orders {
    public ArrayList<OrderItem> orderList;
    
    public Orders() {
        orderList = new ArrayList<OrderItem>();
    }
    
    public void addOrder(MenuItem order) {
    	OrderItem item = new OrderItem(order);
        orderList.add(item);
    }
    
    public String toString() {
    	String str = "";
    	OrderIterator itr = new OrderIterator(orderList);
    	while(itr.hasNext()) {
    		OrderItem item = itr.getItem();
    		str += "\n" + item.toString() + " " + item.getPrice();
    		itr.next();
    	}
    	return str;
    }
    
}
