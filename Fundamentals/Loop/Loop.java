import java.util.ArrayList;

public class Loop {
    
    public static void main(String[] args) {
        
        int i = 0;
        while (i < 3){
            System.out.println(("foo"));
            i++;
        }

        //For loop increase by 2
        for(int j = 0; j<5; j+=2){
            System.out.println(j);
        }

        for(int k = 6; k>0; k--){
            System.out.println(k);
        }

        //Enhanced for loop
        String [] fruits = {"banana", "orange", "apple", "kiwi"};
        for(String s : fruits){
            System.out.println(s);
        }

        for (int l = 0; l < 4; l++){
            System.out.println("bar");
        }
        

        ///////Enhanced for loop/////////////////////////////////////////////////////////
        ArrayList<String> dynamicArray = new ArrayList<String>();
        dynamicArray.add("hello");
        dynamicArray.add("world");
        dynamicArray.add("etc");
        for (int m = 0; m < dynamicArray.size(); m++){
            System.out.println(dynamicArray.get(m));
        }

    


        
        


    }

}
