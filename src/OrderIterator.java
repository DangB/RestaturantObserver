import java.util.ArrayList;
import java.util.NoSuchElementException;

public class OrderIterator {
    private int index;
    private ArrayList<OrderItem> orderList;
    
    public OrderIterator (ArrayList<OrderItem> orderList) {
    	index = 0;
    	this.orderList = orderList;
    }
    
	public boolean hasNext() {
		return index < orderList.size();
	}

	public OrderItem getItem() {
		return orderList.get(index);
	}

	public void next() {
		if(!this.hasNext()) {
			throw new NoSuchElementException();
		}
		index++;
	}
	
	public int getIndex() {
		return index;
	}
    
}
