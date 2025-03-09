
public class Bat extends Mammal{
    
    public Bat(){
        this.energylevel  =300;
    }

    public void fly(){
        this.energylevel-=50;
        System.out.println("The Bat is flying, Energy Level -50 =  " + this.energylevel);
    }

    public void attackTown(){
        this.energylevel -=100;
        System.out.println("The Bat is attacking the town, Energy Level -100 = " + this.energylevel);
    }

    public void eatHumans(){
        this.energylevel +=35;
        System.out.println("The Bat is eating humans. Energy Level +25 = " + this.energylevel);
    }

}
