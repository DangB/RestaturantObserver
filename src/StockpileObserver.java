import java.util.*;

public class StockpileObserver implements Observer{
	private MenuItem item;
	private Subject stockpileSubject;
	private Stockpile stock;
	
	public StockpileObserver(Subject stockpileSubject, MenuItem item) {
		stock = Stockpile.getInstance();
		this.stockpileSubject = stockpileSubject;
		this.item = item;
		stockpileSubject.attach(this);
	}

	@Override
	public void update(Stockpile stock) {
		this.stock = stock;
		ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>(item.getIngredients());
		IngredientIterator itr = new IngredientIterator(ingredients);
		while (itr.hasNext()) {
			Ingredient temp;
            Ingredient ingredient = itr.getIngredient();
            temp = stock.getIngredient(ingredient);
            if(ingredient.amount > temp.amount) {
            	item.setUnavailable();
            }
            itr.next();            
        }
	}

}
