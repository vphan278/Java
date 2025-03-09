import java.util.Scanner;
import java.util.HashMap;

public class Lesson1 {
    public static void main(String[] args) {


        Scanner inputReader = new Scanner(System.in);
        int age;
        String response;
        boolean active = true;
        

        while(active){

            //get a student age
            System.out.println("Enter student age or '!' to quit: ");
            response = inputReader.nextLine();

            if(response.equals("!")){
                active = false;
                continue;
            }

            age = Integer.parseInt(response);

            if(age <= 12){
                System.out.println("The person is a child.");
                //message = "The person is a child.";
            }
            else if (age<=19){
                System.out.println("The person is a teenager.");
            }
            else if(age <=29){
                System.out.println("The person is a young adult.");
            }
            else{
                System.out.println("The person is a grump");
            }

            //System.out.println("Thank You for playing!");
        }
    }
}
