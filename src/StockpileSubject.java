import java.util.*;

public class StockpileSubject implements Subject{
	
	private ArrayList<Observer> observers;
	private Stockpile stock;
	
	public StockpileSubject() {
		stock = Stockpile.getInstance();
		observers = new ArrayList<Observer>();
	}

	@Override
	public void attach(Observer o) {
		observers.add(o);
	}

	@Override
	public void detach(Observer o) {
		int index = observers.indexOf(o);
		observers.remove(index);
	}

	@Override
	public void notifyObserver() {
		for(Observer observer: observers) {
			observer.update(stock);
		}
		
	}
	
	public void useStock(MenuItem item) {
		ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>(item.getIngredients());
		IngredientIterator itr = new IngredientIterator(ingredients);
		while (itr.hasNext()) {
			Ingredient temp;
            Ingredient ingredient = itr.getIngredient();
            temp = stock.getIngredient(ingredient);
            temp.decAmount(ingredient.getAmount());
            itr.next();            
        }
		notifyObserver();
	}


}
