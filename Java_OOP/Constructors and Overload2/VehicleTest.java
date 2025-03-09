
public class VehicleTest {

    public static void main(String[] args) {
        
        Vehicle vehicle = new Vehicle("red", 4);
        String color = vehicle.getColor();
        int numberOfWheels = vehicle.getNumberOfWheels();

        System.out.println("The Vehicle color is: " + color );
        System.out.println("The Vehicle number of wheels: " + numberOfWheels);
    
        
    }
    
}
