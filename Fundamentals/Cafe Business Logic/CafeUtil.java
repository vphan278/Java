import java.util.ArrayList;

public class CafeUtil {
    
    //sums of consecutive integer from 1 to 10
    public int getStreakGoal(){
        
        int sum = 0;
        for (int i = 0; i <=10; i++){
            sum = sum + i;
        }
        return sum;
    }

    //total price from an array of prices
    public double getOrderTotal(double[] prices){
        double total = 0;
        for(int i = 0; i < prices.length; i++){
            total = total + prices[i];
        }
        return total;
    }


    //display menu of items
    public void displayMenu(ArrayList<String> menuItems){

        int i = 0;
        for (String item: menuItems){
            System.out.println(i + "" + item);
            i++;
        }
    }

    //get all customer names
    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name: ");
        String username = System.console().readLine();
        customers.add(username);
        System.out.println("Hello " + username);
        System.out.println("There are " + customers.size() + " people in front of you.");
    }

}
