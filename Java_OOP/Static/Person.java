public class Person {
    
    private int age;
    private String name;
    public static int numberOfPeople = 0;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        numberOfPeople++;
    }



    /////////////Getters and Setters
    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public static void getNumberOfPeople(){
        System.out.println("The number of people is: " + numberOfPeople);
    }
    
}


