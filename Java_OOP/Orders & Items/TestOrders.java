import java.util.ArrayList;


public class TestOrders {
    
    public static void main(String[] args) {
        
        //Create Item objects
        Item item1 = new Item("Coffee", 5);
        Item item2 = new Item("Lattee", 6.5);
        Item item3 = new Item("Drip Coffe", 7);
        Item item4 = new Item("Cappuccino", 9);

        //Order variables of Type Order and instantiate each as an Order Object
        Order order1 = new Order("Cindhuri");
		Order order2 = new Order("Jimmy"); 
		Order order3 = new Order("Noah");
		Order order4 = new Order("Sam");

        System.out.println(item1.name); // Coffee
        System.out.println(item1.price); //5.0
        System.out.println(order1.name);// Cindhuri
        System.out.println(order1.total); // 0.0

        
        System.out.println(order2.total); // 0.0
        order2.items.add(item1);
        order2.total = order2.total + item1.price;
        System.out.println(order2.name + ", Your total is: " + order2.total); // Jimmy your total is 5.0

        //Noah ordered Drip Coffee
        order3.items.add(item3);
        order3.total =  order3.total + item3.price;
        System.out.println("The total is " + order3.total + " " + order3.name);  // The total is 7.0 Noah

        //Noah ordered Cappuccino
        order3.items.add(item4);
        order3.total = order3.total + item4.price;
        System.out.println("The total is after adding the previous order: " + order3.total);
        
        //Sam ordered a Latte
        order4.items.add(item2);
        order4.total = order4.total + item2.price;
        System.out.println(order4.name + ", your total is: " + order4.total);//Sam, your total is: 6.5

        //Sam ordered 2 more lattes
        order4.items.add(item2);
        order4.total = order4.total + 2*item2.price;
        System.out.println(order4.name + ", your new total is: " + order4.total + " dollars");//Sam, your new total is: 19.5


        //Cindhuri's order is ready
        order1.ready = true;
        if(order1.ready){
            System.out.println(order1.name + ", your order is Ready!");
        }
        else{
            System.out.println("Sorry, your order is not ready");
        }

        //Jimmy's order is not ready
        order2.ready = false;
        if(order2.ready){
            System.out.println(order2.name + "your order is Ready");
        }
        else{
            System.out.println(order2.name + ": Sorry, your order is not ready!");
        }
        
    }

}
