import java.util.HashMap;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;


public class PetTest {
    
    public static void main(String[] args) {

        Scanner inputReader = new Scanner(System.in); //For reading user input
        boolean active = true;
        String response;
        int activePetId = 1;

        HashMap<String, String> types = new HashMap<String, String>(){{
            put("barbadook", "barbadook");
            put("Laroom", "Laroom");
            put("sizzlepass", "sizzlepass");
        }}; //dicitonary /associate array


        ArrayList<Pet> pets = new ArrayList<Pet>(Arrays.asList(
            new Pet(1, "Barb", "bqrbadook"),
            new Pet(2, "Larry", "Laroom"),
            new Pet(3, "Sally", "sizzlepass")
            
        ));

        while(active){
            //get student age"
            //System.out.println("Enter command a  command for " + pets.get(activePetId) + "list" + "or" +  '!' + "to quit: "); //some_key
            System.out.println("Enter command a  command:" + "list pets " + "or " +  "!" + " to quit: "); //some_key
            response = inputReader.nextLine();

            switch(response){
                case "!":
                    active = false;
                    continue;

                case "list pets":
                    for (Pet pet : pets){
                        System.out.println("Id: " + pet.getId() + ", Name: " + pet.getName() + ", Type: " + types.get(pet.getType()));
                    }
                    break;
                case "choose":
                default: 
                    System.out.println("Invalid command");
            }


        }
    }
}
