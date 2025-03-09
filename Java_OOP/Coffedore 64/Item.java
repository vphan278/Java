

public class Item {

    //create a class, when instantiated name and price properties are created for
    //that object
    private String name;
    private double price;
    private int index;

    //Constructor
    public Item(String name, double price){
        this.name = name;
        this.price = price;
        this.index =this.index + 1;
    }

    //Getters and Setters
    public String getName(){
        return name;
    }

    public void addName(String name){
        this.name = name;
    }

    //Getters and Setters
    public double getPrice(){
        return price;
    }

    public void addPrice(double price){
        this.price = price;
    }

    //Getters and Setters
    public int getIndex(){
        return index;
    }

    public void addIndex(){
        this.index = this.index + 1;
    }

    public void setIndex(int index){
        this.index = index;
    }

    
}
