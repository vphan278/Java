
public class VehicleTest {

    public static void main(String[] args) {
        
        Vehicle bike = new Vehicle();
        Vehicle car = new Vehicle();

        bike.setNumberOfWheels(2);
        bike.setColor("red");

        int bikeWheels = bike.getNumberOfWheels();
        String bikeColor = bike.getColor();

        System.out.println("Bike Wheels: " + bikeWheels + " || " + "Color: " + bikeColor);

        //////////////////////////////////////////////////////////////
        car.setNumberOfWheels(4);
        car.setColor("green");

        int carWheels = car.getNumberOfWheels();
        String carColor = car.getColor();

        System.out.println("Car Wheels: " + carWheels + " || " + "Color: " + carColor);


    }

    
}
