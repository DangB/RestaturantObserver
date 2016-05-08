
public class Ingredient {
	public String name;
	public int amount;
	
	public Ingredient(String name, int amount) {
		this.name = name;
		this.amount = amount;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public void decAmount(int amount) {
		this.amount -= amount;
	}
	
	public String toString() {
		return name + " " + amount;
	}
}
