import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Lesson2 {
    public static void main(String[] args) {


        Scanner inputReader = new Scanner(System.in);
        //int age;
        String response;
        boolean active = true;
        int activePetId = -1;
        
        HashMap<Integer, String>  pets = new HashMap<Integer, String>(){{
            put(null, "Snowball 2");
            put(null, "Cujo");
            put(null, "Lassie");
        }}; //dictionary / associative array

        while(active){

            //get a student age
            System.out.println("Enter command or '!' to quit: ");
            response = inputReader.nextLine();

            switch(response){
                case "!":
                // active = false;
                // continue;

                case "list":
                for (Map.Entry< Integer, String> entry : pets.entrySet()){
                    Integer id = entry.getKey();
                    String name = entry.getValue();
                    System.out.println("Id: " + id + ", Name: " + name);
                }
                break;

                case "choose":

                    System.out.println("Select a pet by number: ");
                    int selectedPetId = Integer.parseInt(inputReader.nextLine());
                    

                    boolean isValid = false;
                    for(Map.Entry< Integer, String> entry : pets.entrySet()){
                            Integer id = entry.getKey();
                            isValid = id == selectedPetId;
                            
                            if(isValid) break;
                            //String name = entry.getValue();
                            //System.out.println("Id: " + id + ", Name: " + name);

                        if( !isValid){
                            System.out.println("Invalid choice");
                            continue;
                        }

                        activePetId = selectedPetId;
                        System.out.println("You have chosen " + pets.get(activePetId));
                        break;
                    }

                default: //not required
                    System.out.println("Invalid command!");
            }
            
            //System.out.println("Thank You for playing!");
        }
    }
}
