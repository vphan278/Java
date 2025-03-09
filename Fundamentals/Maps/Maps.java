import java.util.HashMap;

public class Maps {

    public static void main(String[] args) {
        
        HashMap<String, Integer> employeeIds = new HashMap<>();

        employeeIds.put("John", 12345);
        employeeIds.put("Carl", 54321);
        employeeIds.put("Jerry", 86789);

        System.out.println(employeeIds); //{Carl=54321, John=12345, Jerry=86789}
        System.out.println(employeeIds.get("John")); //12345
        System.out.println(employeeIds.containsKey("Jerry")); //true
        System.out.println(employeeIds.containsValue(12345));//true
        
        employeeIds.replace("John", 13579);
        System.out.println(employeeIds);//{Carl=54321, John=13579, Jerry=86789}

        employeeIds.remove("Jerry");
        System.out.println(employeeIds);//{Carl=54321, John=13579}
    }
    
}
