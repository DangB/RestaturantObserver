
import java.util.*;

public class Menu {
    public ArrayList<MenuItem> menuList;
    
    public static final int APPETIZERS = 1;
    public static final int MAIN_DISH = 2;
    public static final int DESSERT = 3;
    
    public Menu () {
    	menuList = new ArrayList<MenuItem>();
    }
    
    public void addItem(MenuItem item) {
        menuList.add(item);
    }
    
    public void delete (MenuIterator itr) {
    	if (itr.hasNext()) {
    		menuList.remove(itr.getIndex());
    	}
    }
    
    //Factory Methods
    public MenuIterator getAllItemsIterator() {
    	return new AllItemsIterator(menuList);
    }
    
    public MenuIterator getItemIterator(int itemType) {
    	return new ItemIterator(menuList, itemType);
    }
    
    public MenuIterator getHeartHealthyIterator() {
    	return new HeartHealthyIterator(menuList);
    }
    
    public MenuIterator getPriceIterator(double price) {
    	return new PriceIterator(menuList, price);
    }
    
    public ItemNumberIterator getItemNumberIterator(int itemNumber) {
        return new ItemNumberIterator(menuList, itemNumber);
    }
    
    //Fills the array list with menu items.
    public void intializeMenu() {
 
    	//------------------------------APPETIZERS----------------------------------------------------------
    	MenuItem chickenStrips = new MenuItem("Chicken Strips", 1, false, 6.95, 0);
    	MenuItem onionRings = new MenuItem("Onion Rings", 1, false, 5.50, 1);
    	MenuItem bbqShrimp = new MenuItem("Barbecued Shrimp", 1, true, 6.95, 2);
    	MenuItem crabCakes = new MenuItem("Crab Cakes", 1, false, 6.50, 3);
    	//------------------------------MAIN DISH-----------------------------------------------------------
    	MenuItem caeserSalad = new MenuItem("Caeser Salad", 2, true, 8.95, 4);
    	MenuItem italianSalad = new MenuItem("Italian Salad", 2, true, 8.95, 5);
    	MenuItem ribeyeSteak = new MenuItem("Ribeye Steak", 2, false, 13.95, 6);
    	MenuItem countryFriedSteak = new MenuItem("Country Fried Steak", 2, false, 13.95, 7);
    	MenuItem sirloinSteak = new MenuItem("Sirloin Steak", 2, false, 14.95, 8);
    	MenuItem grilledChicken = new MenuItem("Grilled Chicken", 2, true, 11.99, 9);
    	MenuItem salmon = new MenuItem("Salmon", 2, true, 10.99, 10);
    	MenuItem doubleCheeseBurger = new MenuItem("Double Cheese Burger with Fries", 2, false, 12.50, 11);
    	MenuItem peytonManning = new MenuItem("Chicken Parm", 2, false, 10.99, 12);
    	//------------------------------DESSERT-------------------------------------------------------------
    	MenuItem bananaCreamPie = new MenuItem("Banana Cream Pie", 3, false, 6.95, 13);
    	MenuItem iceCream = new MenuItem("Ice Cream", 3, false, 5.99, 14);
    	MenuItem strawberryShortcake = new MenuItem("Strawberry Shortcake", 3, true, 6.99, 15);
    	
       	//------------------------------Ingredients--------------------------------------------------------
    	Ingredient fish = new Ingredient("Fish", 1);
    	Ingredient chicken = new Ingredient("Chicken", 1);
    	Ingredient beef = new Ingredient("Beef", 1);
    	Ingredient crab = new Ingredient("Crab", 1);
    	Ingredient shrimp = new Ingredient("Shrimp", 1);
    	Ingredient lettuce = new Ingredient("Lettuce", 1);
    	Ingredient tomatoes = new Ingredient("Tomatoes", 1);
    	Ingredient onions = new Ingredient("Onion", 1);
    	Ingredient cheese = new Ingredient("Cheese", 1);
    	Ingredient banana = new Ingredient("Banana", 1);
    	Ingredient icecream = new Ingredient("Ice Cream", 1);
    	Ingredient strawberry = new Ingredient("Strawberry",1);
    	
    	
    	chickenStrips.addIngredient(chicken);
    	onionRings.addIngredient(onions);
    	bbqShrimp.addIngredient(shrimp);
    	crabCakes.addIngredient(crab);
    	
    	caeserSalad.addIngredient(lettuce, tomatoes);
    	italianSalad.addIngredient(lettuce, tomatoes);
    	ribeyeSteak.addIngredient(beef);
    	countryFriedSteak.addIngredient(beef);
    	sirloinSteak.addIngredient(beef);
    	grilledChicken.addIngredient(chicken);
    	salmon.addIngredient(fish);
    	doubleCheeseBurger.addIngredient(beef, lettuce, cheese, tomatoes, onions);
    	peytonManning.addIngredient(chicken, cheese);
    	bananaCreamPie.addIngredient(banana);
    	iceCream.addIngredient(icecream);
    	strawberryShortcake.addIngredient(strawberry);
    	    	
    	
    	menuList.add(chickenStrips); menuList.add(onionRings);menuList.add(bbqShrimp);menuList.add(crabCakes);
    	menuList.add(caeserSalad);menuList.add(italianSalad);menuList.add(ribeyeSteak);menuList.add(countryFriedSteak);
    	menuList.add(sirloinSteak);menuList.add(grilledChicken);menuList.add(salmon);menuList.add(doubleCheeseBurger);
    	menuList.add(peytonManning);menuList.add(bananaCreamPie);menuList.add(iceCream);menuList.add(strawberryShortcake);
    	
    }
}