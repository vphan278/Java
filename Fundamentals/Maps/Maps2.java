import java.util.HashMap;
import java.util.Set;

public class Maps2 {
    
    public static void main(String[] args) {
        
        HashMap<String, String> users = new HashMap<String, String>();
        users.put("ninja@codingdojo.com", "Nancy Ninja");
        users.put("samurai@codingdojo.com", "Sam Samurai");
        users.put("wizard@codingdojo.com", "Walter Wizard");

        String name = users.get("ninja@codingdojo.com");
        System.out.println("The full name is: "  + name);


        //get the keys by using the keySet method
        Set<String> keys = users.keySet();

        for(String key : keys){
            System.out.println(key); //ninja@codingdojo.com, samurai@codingdojo.com, wizard@codingdojo.com
            System.out.println(users.get(key));//Nancy Ninja, Sam Samurai, Walter Wizard
        }
        
        
        


    }
}

