public class BatTest {

    public static void main(String[] args) {
        
        Bat bat = new Bat();

        bat.fly(); //250

        bat.eatHumans();//275
        bat.eatHumans();//300

        bat.attackTown();//200
        bat.attackTown();//100
        bat.attackTown();//0
        
        System.out.println("The Energy Level for the Bat is: " + bat.displayEnenery());

    }
    
}
