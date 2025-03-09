import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class PuzzleTest {
    
    public static void main(String[] args) {
        
        PuzzleJava appTest = new PuzzleJava();

        //return an array of size 10 values
        System.out.println("\n-----Get 10 Rolls from 1 to 20-----");
        for( int i= 0; i<10; i++){
            int [] arr = appTest.getTenRolls();
            int random = arr[i];
            System.out.println("10 Rolls array = " + random);
        }

        //return a random letter from a-z
        System.out.println("\n----Generate Random Letter-----");
        System.out.println("Random letter: " + appTest.getRandomLetter());

        //return password with 8 characters
        System.out.println("\n----Password Generator-----");
        System.out.println("Your password is: " + appTest.generatePassword());

        //return password array
        System.out.println("\n-----Password Array Times-----");
        String[] arr = appTest.getNewPasswordSet(4);
        for(int i =0; i<arr.length; i++){
            System.out.println("Your password is: " + arr[i]);
        }


    }

}
