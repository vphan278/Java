public class CafeJava {
    public static void main(String [] args){

        String generalGreeting = "Welcome to Cafe Java,";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = ", Your total is $ ";

        //Menu variables (add yours below)
        double mochaPrice = 3.5;
        Integer dripcoffe = 4;
        double latte = 5;
        double cappuccino = 6;

        //Customer name variables ( add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

        //Order complettions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 =  false;

        //App INTERACTION SIMULATION (add your code for the challenges below)
        System.out.println(generalGreeting + customer1);
        System.out.println(mochaPrice +  " dollars, "+ customer1);
        System.out.println(customer4 + displayTotalMessage + cappuccino);
        System.out.println(customer2 + ", you just ordered 2 lattes. " + isReadyOrder2);
        
    }
}
