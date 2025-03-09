class PersonTest {

    public static void main(String[] args) {
        Person person1 = new Person(10, "John");
        Person person2 = new Person(5, "Mike");
        person1.objectMethods(person2);


            System.out.println("Person1 name is: " + person1.name);
    }

}

