
public class Casting {

    public static void main(String[] args) {
        int i = 120;
        byte b = (byte) i;

        System.out.println(b);


        double d = 35.25;
        double dd = 36.99;

        //casting the double d into a int
        int a =(int) d;
        int aa = (int) dd;

        System.out.println(a);
        System.out.println(aa);


        //Implicit
        int c = 15;
        float f = c;
        System.out.println("The number is: " + f);


        
    
        
    }
    
}
