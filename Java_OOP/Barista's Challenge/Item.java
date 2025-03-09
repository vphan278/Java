public class Item {
    
    private String name;
    private double price;

    //Constructor
    public Item(String name){
        this.name = name;
    }

    public Item(String name, double price){
        this.name = name;
        this.price = price;
    }

    //Getters and Setters////////////////////////////////////////////////////
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    //Getters and Setters
    public double getPrice(){
        return price;
    }

    public void setPrice(){
        this.price = price;
    }
    


}
