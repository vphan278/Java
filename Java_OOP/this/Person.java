class Person {


    int age;
    String name;

    //Constructor
    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void objectMethods(Person anotherObject) {
        System.out.println("Class name: " + this.getClass().getSimpleName());
        System.out.println("toString: " + this.toString());
        System.out.println("Equals: " + this.equals(anotherObject));
    }
}

