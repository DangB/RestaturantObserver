import java.util.ArrayList;

public class Stockpile {
	private static Stockpile stockpile = new Stockpile();
	private ArrayList<Ingredient> stock;
	
	private Stockpile() {
		stock = new ArrayList<Ingredient>();
		
		stock.add(new Ingredient("Fish",5));
		stock.add(new Ingredient("Chicken",5));
		stock.add(new Ingredient("Beef",5));
		stock.add(new Ingredient("Crab",5));
		stock.add(new Ingredient("Shrimp",5));
		stock.add(new Ingredient("Lettuce",5));
		stock.add(new Ingredient("Tomatoes",5));
		stock.add(new Ingredient("Onion",5));
		stock.add(new Ingredient("Cheese",5));
		stock.add(new Ingredient("Banana",5));
		stock.add(new Ingredient("Ice Cream",5));
		stock.add(new Ingredient("Strawberry",5));
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
