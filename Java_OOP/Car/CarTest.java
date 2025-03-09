
public class CarTest {
    
    public static void main(String[] args) {
        
        Car client1Car = new Car();
        client1Car.year = 2001;
        client1Car.make = "Honda";
        client1Car.model = "Civic";
        client1Car.color = "white";

        //Another car
        Car client2Car = new Car();
        client2Car.year = 2025;
        client2Car.make = "Mazda";
        client2Car.model = "CX-3";
        client2Car.color = "navy";


        System.out.println(("Car 1 make: " + client1Car.make));
        System.out.println("Car 1 model: "+ client1Car.model);

        System.out.println("Car 2 year: " + client2Car.year);
        System.out.println("Car 2 color: " + client2Car.color);
    }
    
}
