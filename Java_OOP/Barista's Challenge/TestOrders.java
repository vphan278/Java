import java.util.ArrayList;

public class TestOrders {

    public static void main(String[] args) {

        //Creating Items to add to the order
        Item item1 = new Item("Coffee", 5);
        Item item2 = new Item("Cappuccino", 6);
        Item item3 = new Item("Espresso",7);
        Item item4 = new Item("Vanilla Sky", 9);
        Item item5 = new Item("Latte", 12);


        Order order1 = new Order();
        Order order2 = new Order();

        //Creating 3 orders using overload Constructor
        Order order3 = new Order("Vinh");
        Order order4 = new Order("Mike");
        Order order5 = new Order("John");


        //adding items to orders
        order1.addItem(item2, item2);
        order2.addItem(item2, item2);

        order3.addItem(item4, item5);
        order4.addItem(item2, item5);


        //order total
        System.out.println(order1.getOrderTotal());//20.0
        System.out.println(order3.getOrderTotal()); //21.0
        System.out.println(order4.getOrderTotal());


        //Changing status of order
        System.out.println(order2.isReady());//true
        System.out.println(order4.isReady()); //true
        System.out.println(order5.notReady());//false

        //Status Message
        System.out.println(order1.getStatusMessage()); //Thank you for waiting
        System.out.println(order2.getStatusMessage()); // Thank you for waiting
        System.out.println(order4.getStatusMessage()); // Hello Mike, Your order is ready
        System.out.println(order5.getStatusMessage()); // Hello John. Your order is ready

        //Display Method
        order1.display();//Your order details, Customer name = null
        order3.display(); //Your order details, Customer name = Vinh
        order4.display(); //Your order details, Customer name = Mike


    }
    
}
