import java.util.ArrayList;


public class Order {
    
    private String name;
    private double total;
    private boolean ready;
    private ArrayList<Item> items;

    //Constructor
    public Order(){
        this.name = name;
        this.total = 0.0;
        this.ready = false;
        this.items = new ArrayList<Item>();
    }

    //Overloaded Constructor
    public Order(String guest){
        this.name = guest;
        this.total = 0.0;
        this.ready = false;
        this.items = new ArrayList<Item>();
    }

    //Add items
    public void addItem(Item... items){
        for(Item item : items){
            this.items.add(item);
            this.total = this.total + item.getPrice();
        }
    }

    //getStatusMessage
    public String getStatusMessage(){
        return ready == true ? "Hello " + name + ". Your order is ready":"Thank you for waiting.";
    }

    //getOrderTotal
    public double getOrderTotal(){
        return this.total;
    }

    //Change ready status
    public boolean isReady(){
        return ready = true;
    }

    public boolean notReady(){
        return ready = false;
    }

    //display order details
    public void display(){
        System.out.println("Your order details");
        System.out.println("Customer name: " + name);


    }

    

}
