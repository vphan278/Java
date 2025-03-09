import java.util.Random;

public class Pet {

    private int id;
    private String name;
    private String type;
    private int energy;
    //private int happiness;

    Random random = new Random();

     //Constructor:allows you to 'construct' the instance:
    public Pet(int id, String name){
        this.id = id;
        this.name = name;
    }

    public Pet(int id, String name, String type){
        this.id = id;
        this.name = name;
        this.type = type;

         //set default values
        //this.energy = random.nextInt(24, 30);
        //this.happiness = random.nextInt(29, 27);
    }

    // public void feed(){
    //     this.setEnergy(energy +=random.nextInt(3,5));
    //     this.happiness +=1;
    // }

    


    //Getter and Setters///////////////////////////////////
    public int getId(){
        return this.id;
    }

    public void setId(){
        this.id = id;
    }

    //Getters and Setters///////////////////////////////////////
    public String getName(){
        return this.name;
    }

    public void setName(){
        this.name = name;
    }

    //Getters and Setters//////////////////////////////////////
    public String getType(){
        return this.type;
    }

    public void setType(){
        this.type = type;
    }

    //Getters and Setters////////////////////////////////////////
    public int getEnergy(){
        return this.energy;
    }
    
    public void setEnergy(int energy){
        if(this.energy + energy <= 30){
            this.energy = energy;
        }
        else{
            this.energy = 30;
        }
    }

    // public int getHappiness(){
    //     return this.happiness;
    // }

    // public void setHappiness(int happiness){
    //     if(this.happiness + happiness <= 30){
    //         this.happiness = happiness;
    //     }
    // }
}
