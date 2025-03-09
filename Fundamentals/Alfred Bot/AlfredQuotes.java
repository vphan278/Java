import java.util.Date;

public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, nice to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        return "Hello, " + name + ", lovely to see you.";
        //return "placeholder for guest greeting return string";
    }
    
    public String dateAnnouncement() {
        Date date = new Date();
        return "It is currently: " + date;
    }
    
    public String respondBeforeAlexis(String conversation) {
        int hasAlexis = conversation.indexOf("Alexis");
        int hasAlfred = conversation.indexOf("Alfred");

        if(hasAlexis >= 0){
            return "Right away, sir. She is beautiful.";
        }
        else if(hasAlexis <=0 && hasAlfred>0){
            return "At your service";
        }
        else{
            return "I will return";
        }

    
    }
    
	// NINJA BONUS
	// See the specs to overload the guestGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

