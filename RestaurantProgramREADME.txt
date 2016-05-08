Binh Dang
December 7, 2015

New Classes added to the Restaurant Program:

CMDGetStockpile.java
CMDGetStockpileSubject.java

Ingredient.java
IngredientIterator.java

Stockpile.java

Observer.java
StockpileObserver.java

Subject.java
StockpileSubject.java

Updated classes:
Aggregator.java - holds the stockpile and subject data. Creates subject and adds observers.
Invoker.java - added new commands to use stockpile.
Menu.java - initialize menu method now adds ingredients to each menu item.
MenuItem.java - holds a list of ingredients.
SystemInterface.java - updated submitOrder method, added method to display current stockpile.
UserInterface.java - updated display to reflect new stockpile command.

Added a function that keeps track of the raw ingredients (tomatoes, beef, cheese etc.) used by each menu item. Each time a food item is ordered, the ingredient(s) used to make that item is subtracted from the Stockpile. Added a new command to print the current ingredients stock.

Using an Observer pattern, each time an item is ordered, the ingredient stockpile is updated and the current information is relayed to each observer. There is an observer for each menu item. When the stockpile is updated, each menu item observer compares their ingredients with the stockpile. If there is not enough ingredients in stock to make the menu item, then the menu item is flagged unavailable. Unavailable items are displayed as unavailable and can not be ordered.