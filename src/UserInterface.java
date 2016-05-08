import java.util.*;

public class UserInterface {
    private static Scanner input;
    private static int option;
    private static int itemNumber;
    private static boolean flag = false;
    
    public static void display() {
        System.out.println("Enter option number\n");
        System.out.println("1 - Print Menu");
        System.out.println("2 - Print Heart Healthy Menu");
        System.out.println("3 - Add Order");
        System.out.println("4 - Print Tab");
        System.out.println("5 - Print Stock");
        System.out.println("6 - Quit");
        
        selection();
    }
    
    public static void getOrder() {
        System.out.println("Enter item number 1 - 16");
        itemNumber = input.nextInt();
        if (itemNumber < 0 || itemNumber > 16) {
        	System.out.println("That item is unavailable");
        	getOrder();
        }
        itemNumber--;
    }
    
    public static void selection() {
        option = input.nextInt();
        switch (option) {
            case 1:     System.out.println(SystemInterface.getMenu());
            			System.out.println();
                        break;
                        
            case 2:     System.out.println(SystemInterface.getHeartHealthyMenu());
            			break;
                        
            case 3:     getOrder();
                        SystemInterface.submitOrder(itemNumber);
                        break;
                        
            case 4:     System.out.println(SystemInterface.displayTab());
            			System.out.println();
                        break;
            case 5:		System.out.println(SystemInterface.displayStockpile());
            			System.out.println();
            			break;
                        
            case 6:     flag = true;
                        break;
                        
            default:    System.out.println("Invalid input");
                        display();
                        break;
        }
        
    }
    
    public static void main(String[] args) {
        input = new Scanner(System.in);
        while (!flag) {
            display();
        }
        System.out.println("GoodBye");
        
    }

    
}
