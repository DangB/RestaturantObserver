//
//public class Main {
//
//	public static void main(String[] args) {
//		
//		Menu steakMenu = new Menu();
//        steakMenu.intializeMenu();
//        
//
//		//Displays all menu items
//        MenuIterator allIterator = steakMenu.getAllItemsIterator();
//        System.out.println("All Menu Items \n");
//        
//        while (allIterator.hasNext()){
//        	MenuItem item = allIterator.getItem();
//        	System.out.println(item.getName() + " $" + item.getPrice());
//        	allIterator.next();
//        }
//        
//        //Displays all appetizer items
//        MenuIterator appetizerIterator = steakMenu.getItemIterator(Menu.APPETIZERS);
//        System.out.println("\nAll Appetizer Items \n");
//        
//        while (appetizerIterator.hasNext()){
//        	MenuItem item = appetizerIterator.getItem();
//        	System.out.println(item.getName() + " $" + item.getPrice());
//        	appetizerIterator.next();
//        }
//        
//      //Displays all main dish items
//        MenuIterator mainDishesIterator = steakMenu.getItemIterator(Menu.MAIN_DISH);
//        System.out.println("\nAll Main Dish Items \n");
//        
//        while (mainDishesIterator.hasNext()){
//        	MenuItem item = mainDishesIterator.getItem();
//        	System.out.println(item.getName() + " $" + item.getPrice());
//        	mainDishesIterator.next();
//        }
//
//      //Displays all dessert items
//        MenuIterator dessertIterator = steakMenu.getItemIterator(Menu.DESSERT);
//        System.out.println("\nAll Dessert Items \n");
//        
//        while (dessertIterator.hasNext()){
//        	MenuItem item = dessertIterator.getItem();
//        	System.out.println(item.getName() + " $" + item.getPrice());
//        	dessertIterator.next();
//        }
//        
//      //Displays all heart healthy items
//        MenuIterator healthyIterator = steakMenu.getHeartHealthyIterator();
//        System.out.println("\nAll Healthy Items \n");
//        
//        while (healthyIterator.hasNext()){
//        	MenuItem item = healthyIterator.getItem();
//        	System.out.println(item.getName() + " $" + item.getPrice());
//        	healthyIterator.next();
//        }
//        
//      //Displays all Main Dish items under $12.00
//        double price = 12;	//price to compare
//        MenuIterator priceIterator = steakMenu.getPriceIterator(price);
//        System.out.println("\nAll items under " + "$" + price + "\n");
//        
//        while (priceIterator.hasNext()){
//        	MenuItem item = priceIterator.getItem();
//        	System.out.println(item.getName() + " $" + item.getPrice());
//        	priceIterator.next();
//        }
//        
//        //Add menu item
//        MenuItem chefSpecial = new MenuItem("Wine-Braised Beef Briskey ", 2, false, 14.95, 15);
//        steakMenu.addItem(chefSpecial);
//        
//        //Delete the first menu item
//        MenuIterator deleteIterator = new AllItemsIterator(steakMenu.menuList, 0);
//        steakMenu.delete(deleteIterator);
//        
//      //Updates all menu items
//        MenuIterator allIterator2 = steakMenu.getAllItemsIterator();
//        System.out.println("\nAll Menu Items \n");
//        
//        while (allIterator2.hasNext()){
//        	MenuItem item = allIterator2.getItem();
//        	System.out.println(item.getName() + " $" + item.getPrice());
//        	allIterator2.next();
//        }
//	}
//	
//}
