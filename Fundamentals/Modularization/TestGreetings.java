

public class TestGreetings {
    
    public static void main(String[] args) {
        
        Greetings greeterAppp = new Greetings();

        String dateMessage = greeterAppp.getCurrentDate();
        System.out.println(dateMessage);

        Greetings englishApp = new Greetings();
        String greetMessage = englishApp.greetEnglish("Vinh");
        System.out.println(greetMessage);

        Greetings greeterSpanish = new Greetings();
        String spanishMessage = greeterSpanish.greetSpanish("Vinh");
        System.out.println(spanishMessage);


        

    }

}
