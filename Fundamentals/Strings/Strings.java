public class Strings{
    public static void main(String[] args) {
        String ninja = "Coding Dojo is Awesome!";
        int length = ninja.length();
        System.out.println( "String Length is: " + length );

        //Concatenate
        String string1 = "My name is, ";
        String string2 = "Michael";
        String string3 = string1.concat(string2);
        System.out.println(string3);

        //Format
        String ninja2 = String.format("Hi %s, you owe me $%.4f !", "Jack", 25.0);
        System.out.println(ninja2);
        // Will print out Hi Jack, you owe me $25.0000 !
        // Where %s is expecting a string
        // And %.2f is expecting a float data type. The value 2 will just place two values to right of the decimal point.
        
        //IndexOf
        String ninja3 = "Welcome to coding dojo";
        int a = ninja3.indexOf("Coding");
        int b = ninja3.indexOf("co");
        int c = ninja3.indexOf("pizza");

        System.out.println(c);
        System.out.println(a);

        String sentence = "   spaces everywhere!   ";
        System.out.println(sentence.trim());

        //uppercase and lowercase
        String d = "Hello";
        String e = "world";
        System.out.println(d.toLowerCase());
        System.out.println(e.toUpperCase());

        //Equality
        String f ="same string";
        String g = "same string";
        System.out.println(f==g);

        String h = new String( "Dojo" );
        System.out.println( h.equals("Dojo") );
        // this actually will print out `true`

         // Predict the output
        String message;
        String output;
        message = "Hello there!";
        output = String.format("Message %d: %s", 1, message.concat(" How are you doing today?"));
        System.out.println(output);


    }
}


