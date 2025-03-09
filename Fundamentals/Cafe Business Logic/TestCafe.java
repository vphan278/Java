import java.util.ArrayList;
import java.util.Arrays;

public class TestCafe {

    public static void main(String[] args) {
        
        CafeUtil TestApp = new CafeUtil();
        /* ============ App Test Cases ============= */
        // int getStreakGoal()
        System.out.println("\n----- Streak Goal Test -----");
        System.out.println("Drinks purchase by week 10:" + TestApp.getStreakGoal()); //for now 



        //double getOrderTotal(double[] prices)
        System.out.println("-----Order Total Test: getOrderTotal(double[] prices-----");

        double[] items = {
            2, 1.5, 4.9, 6
        };

        System.out.println("Order Total: $" + TestApp.getOrderTotal(items));

        //Menu Item
        System.out.println("-----Display Menu Test----");
        
        ArrayList<String> menu = new ArrayList<String>();
        menu.add(" index: drip coffee");
        menu.add(" index: cappuccino");
        menu.add(" index: latte");
        menu.add(" index: mocha");

        TestApp.displayMenu(menu);

        //Customer numbers
        System.out.println("\n-----Add Customer-----");

        ArrayList<String> customers = new ArrayList<String>();
        for(int i = 0; i < 5; i++){
            TestApp.addCustomer(customers);

        }

    }

    
}
