import java.util.*;

public class MenuItem extends Menu{
    public String itemName;
    public int category;
    public Boolean heartHealthy = false;
    public double price = 0;
    public int itemNumber;
    public ArrayList<Ingredient> ingredients;
    public Boolean available = true;
    
    public MenuItem(String itemName, int category, Boolean heartHealthy, 
            double price, int itemNumber) {
        this.itemName = itemName;
        this.category = category;
        this.heartHealthy = heartHealthy;
        this.price = price;
        this.itemNumber = itemNumber;
        ingredients = new ArrayList<Ingredient>();
    }
    
    public void addIngredient(Ingredient ingredient) {
    	ingredients.add(ingredient);
    }
    public void addIngredient(Ingredient ingredient, Ingredient ingredient2) {
    	ingredients.add(ingredient);
    	ingredients.add(ingredient2);
    }
    public void addIngredient(Ingredient ingredient, Ingredient ingredient2, Ingredient ingredient3) {
    	ingredients.add(ingredient);
    	ingredients.add(ingredient2);
    	ingredients.add(ingredient3);
    }
    public void addIngredient(Ingredient ingredient, Ingredient ingredient2, Ingredient ingredient3, Ingredient ingredient4) {
    	ingredients.add(ingredient);
    	ingredients.add(ingredient2);
    	ingredients.add(ingredient3);
    	ingredients.add(ingredient4);
    }
    public void addIngredient(Ingredient ingredient, Ingredient ingredient2, Ingredient ingredient3, Ingredient ingredient4, Ingredient ingredient5) {
    	ingredients.add(ingredient);
    	ingredients.add(ingredient2);
    	ingredients.add(ingredient3);
    	ingredients.add(ingredient4);
    	ingredients.add(ingredient5);
    }
    
    public String getName() {
    	return itemName;
    }
    
    public double getPrice() {
    	return price;
    }
    
    public int getItemNumber() {
        return itemNumber;
    }
    
    public boolean getAvailable() {
    	return available;
    }
    
    public void setUnavailable() {
    	available = false;
    }
    
    public ArrayList<Ingredient> getIngredients() {
    	return ingredients;
    }
}