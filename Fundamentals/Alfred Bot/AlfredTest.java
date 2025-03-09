public class AlfredTest {

    public static void main(String[] args) {
        
        AlfredQuotes alfredBot = new AlfredQuotes();

        //Greetings
        String testGreeting = alfredBot.basicGreeting();
        String testGuestGreeting = alfredBot.guestGreeting("Beth Kane");
        String testDateAnnouncement = alfredBot.dateAnnouncement();


        String alexisTest = alfredBot.respondBeforeAlexis("Alexis! Play some low-fi beats.");
        String alfredTest = alfredBot.respondBeforeAlexis("I can't find my toys. Maybe Alfred know where it is.");
        String notReleventTest = alfredBot.respondBeforeAlexis("It is not there.");




        //////////////Print the Greetings///////////////////////////////////////////////
        System.out.println(testGreeting);
        System.out.println(testGuestGreeting);
        System.out.println(testDateAnnouncement);
        
        System.out.println(alexisTest); //Right away, sir. She is beautiful.
        System.out.println(alfredTest); // At your service
        System.out.println(notReleventTest);// I will return
    } 




}
