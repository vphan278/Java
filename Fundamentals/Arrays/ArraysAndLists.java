import java.util.ArrayList;



public class ArraysAndLists {

    public static void main(String[] args) {
        
        int [] myArray = new int[5];

        myArray[0] = 4;
        myArray[1] = 8;
        myArray[2] = 5;
        myArray[3] = 9;
        myArray[4] = 2;

        for(int i = 0; i< myArray.length; i++){
            System.out.println(myArray[i]);
        } 

        int [] myArray2 = {4,6,8,9,3};

        for(int i = 0; i< myArray2.length; i++){
            System.out.println(myArray2[i]);
        }

        //////////////////////////////////////////////
        String[] fruits = {"banana", "pear", "papaya", "kiwi"};
        String temp = fruits[0];
        fruits[0] = fruits[fruits.length -1];
        fruits[fruits.length - 1] = temp;

        for(int i = 0; i <fruits.length; i++){
            System.out.println(fruits[i]);
        }

        String[] fruit = {"apple", "strawberry", "grapes", "melons"};
        
        System.out.println(fruit.length); // 4
        // Array is currently { "kiwi", "pear", "papaya", "banana" }
        System.out.println(fruit[fruit.length - 1]); // "melons"

         // To swap the value at index 0 and index 3
        String temp2 = fruit[0]; // assigns temp to "apple"
        fruit[0] = fruit[3]; //  {"melons", "strawberry", "grapes", "melons"}
        fruit[3] = temp2; // {"melons", "strawberry", "grapes", "apple"}

        for(int i = 0; i <fruit.length; i++){
            System.out.println(fruit[i]); //{"melons", "strawberry", "grapes", "apple"}
        }

        ///////////Dynamic Arrays/////////////////////////////////import java.util.ArrayList
        ArrayList<Integer> myList = new ArrayList<Integer>();
        System.out.println(myList);

        myList.add(10);
        myList.add(11);
        myList.add(12);
        System.out.println(myList);

        myList.set(0,9);
        System.out.println(myList);
        
        ///////////////////////////////////////////////////////////////////////////////
        ArrayList<Object> things = new ArrayList<Object>();
        things.add(10);
        things.add("Hello");
        things.add(new ArrayList<Integer>());
        things.add(12.5);
                
        System.out.println(things); // { 10, "Hello", [], 12.5 }

        /////////////////////////////////////////////////////////////////////////////////
        String[] words = {"it", "is", "this", "we", "do", "how"};
        ArrayList<String> phrase = new ArrayList<String>();
        // Pull words from the 'words' array to populate the 'phrase' array list
        // Print the 'phrase' array list
        // Expected output: [this, is, how, we, do, it]
        System.out.println(phrase);




    }
    
}
