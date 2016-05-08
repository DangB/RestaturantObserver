
public class OrderItem {
    public MenuItem item;
    public String instructions; //special instruction eg. well-done, no cheese etc.
    
    
    public OrderItem(MenuItem item) {
        this.item = item;
    }
    
    public void addInstruction(String str) {
        instructions = str;
    }
    
    public MenuItem getMenuItem() {
    	return item;
    }
    
    public String toString() {
    	return item.getName();
    }
    
    public double getPrice() {
    	return item.getPrice();
    }
    
   }
