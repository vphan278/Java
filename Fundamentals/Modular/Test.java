public class Test {

    public static void main(String[] args) {
        
        Capitals city = new Capitals();
        city.getCapital("Brazil");
        city.getCapital("Cyprus");
        

        String country = city.getCountry("Cairo");
        System.out.println(country);

        String country2 = city.getCountry("Vienna");
        System.out.println(country2);

        String country3 = city.getCountry("Accra");
        System.out.println(country3);
    }
    
}
