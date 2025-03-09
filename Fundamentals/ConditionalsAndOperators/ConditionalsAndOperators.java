public class ConditionalsAndOperators {
    public static void main(String[] args) {    
        // Predict the output and run the code to check your prediction

        int temperature = 85;
        boolean isCloudy = true;

        if(temperature < 40 && isCloudy){
            System.out.println("It might snow.");
        }else if(isCloudy){
            System.out.println("It might rain.");
        }else{
            System.out.println("We should have nice weather today.");
        }


        int day = 2;
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("There are only seven days in a week...");
        }

        


    }
}
