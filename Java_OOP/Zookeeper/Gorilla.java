

public class Gorilla extends Mammal{
    
    public void throwSomething(){
        this.energylevel -=5;
        System.out.println("The Gorilla has thrown something! Energy Level -5 = " + this.energylevel);
    }

    public void eatBananas(){
        this.energylevel +=10;

        System.out.println("The Gorilla is eating a banana, he is satisfied, Energy Level +10= " + this.energylevel);
    }

    public void climb(){
        this.energylevel -=10;

        System.out.println("The gorilla is climbing at tree, Energy Level -10 = " + this.energylevel);
    }


}
