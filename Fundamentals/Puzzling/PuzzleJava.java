import java.util.Random;

public class PuzzleJava {
    
    public int[] getTenRolls() {
        int[] arr = new int[10];
        Random randMachine = new Random();
        for (int i = 0; i < arr.length; i++) {
            int result = randMachine.nextInt(21);
            arr[i] = result;
        }
        return arr;
    }

    //getRandomLetter
    public Character getRandomLetter(){
        //array to get all alphabets
        char[] alphabet ="abcdefghijklmenoqrstuvwxyz".toCharArray();
        Random randMachine = new Random();
        int result = randMachine.nextInt(26);
        return alphabet[result];
    }
    
    //generate Password
    public String generatePassword(){
        char[] alphabet = "abcdefghijklmenoqrstuvwxyz".toCharArray();
        Random randMachine = new Random();

        String password = "";
        for(int i = 0; i <8; i++){
            int result = randMachine.nextInt(26);
            password += alphabet[result];
        }
        return password;
    }

    //Generate an array of passwords, where each element is supposed to have 8 characters
    public String[] getNewPasswordSet(int length){
        String [] passwords = new String[length];

        for(int j = 0; j<length; j++){
            String password = generatePassword();
            passwords[j] = password;
        }
        return passwords;
    }

}
