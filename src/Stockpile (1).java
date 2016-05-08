import java.util.ArrayList;

public class Stockpile {
	private static Stockpile stockpile = new Stockpile();
	private ArrayList<Ingredient> stock;
	
	private Stockpile() {
		stock = new ArrayList<Ingredient>();
		
		stock.add(new Ingredient("Fish",10));
		stock.add(new Ingredient("Chicken",2));
		stock.add(new Ingredient("Beef",10));
		stock.add(new Ingredient("Crab",10));
		stock.add(new Ingredient("Shrimp",10));
		stock.add(new Ingredient("Lettuce",10));
		stock.add(new Ingredient("Tomatoes",10));
		stock.add(new Ingredient("Onion",10));
		stock.add(new Ingredient("Cheese",10));
		stock.add(new Ingredient("Banana",10));
		stock.add(new Ingredient("Ice Cream",10));
		stock.add(new Ingredient("Strawberry",10));
	}
	
	public static Stockpile getInstance() {
		return stockpile;
	}
	
	public Ingredient getIngredient(Ingredient ing) {
		int index;
		for (Ingredient ingredient:stock){
			if (ingredient.name == ing.name) {
				index = stock.indexOf(ingredient);
				return stock.get(index);
			}
		}
		return null;
	}
	
	public String toString() {
		String str = "";
		for (Ingredient ingredient:stock){
			str += ingredient.toString() + "\n";
		}
		return str;
	}
}
