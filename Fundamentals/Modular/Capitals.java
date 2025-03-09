public class Capitals {
    public void getCapital(String country){

        System.out.println("What is the capital of " + country + "?");
        switch(country){
            case "Austria":
                System.out.println("The capital of " + country + " is Vienna.");
                break;
            case "Brazil":
                System.out.println("The capital of " + country + " is Brasilia.");
                break;
            case "Cyprus":
                System.out.println("The capital of " + country + " is Nicosia.");
                break;
            case "Egypt":
                System.out.println("The capital of " + country + " is Cairo.");
                break;
            case "Ghana":
                System.out.println("The capital of " + country + " is Accra.");
                break;
            default:
                System.out.println("I don't know the capital of " + country + ".");
                break;
        }
    }
    public String getCountry(String capital){

        System.out.println(capital + " is the capital of which country?");
        switch(capital){
            case "Vienna":
                return capital + " is the capital of Austria.";
                //System.out.println( capital + "is the capital of Austria");
            case "Brasilia":
                return capital + " is the capital of Brazil.";
            case "Nicosia":
                return capital + " is the capital of Cyprus.";
            case "Cairo":
                return capital + " is the capital of Egypt.";
            case "Accra":
                return capital + " is the capital of Ghana.";
            default:
                return "I don't know that city.";
        }
    }
}

