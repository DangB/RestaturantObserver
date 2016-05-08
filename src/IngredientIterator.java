import java.util.ArrayList;
import java.util.NoSuchElementException;

public class IngredientIterator {
	private int index;
	private ArrayList<Ingredient> ingredients;
	private String str;
	
	public IngredientIterator(ArrayList<Ingredient> ingredients) {
		index = 0;
		this.ingredients = ingredients;
	}
	
	public IngredientIterator(ArrayList<Ingredient> ingredients, String str) {
		index = 0;
		this.ingredients = ingredients;
		this.str = str;
	}
	

	public boolean hasNext() {
		return index < ingredients.size();
	}

	public Ingredient getIngredient() {
		return ingredients.get(index);
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
