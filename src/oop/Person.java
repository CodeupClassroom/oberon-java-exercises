package oop;

public class Person {

    // In this Person class, we define what are called 'class members'
    // They can be one of three things:
    // -> field
    //      These members represent a specific data structure of the class
    //      Often, the are not directly accessible to calling code
    // -> constructor
    //      Special methods which are used by calling code to create a new instance of
    //      your Person object
    // -> property
    //      These methods are used for getting/setting fields of the class,
    //      as well as perform special operations dealing with the instance data
    //      For example: a property called getFullName() which will return the full name of the person

    // Fields
    // Notice the 'private' modifier
    // This means that our fields with that modifier are not callable outside of this class
    private String firstName;
    private String lastName;
    private int age;

    // Constructor
    public Person(){}

    // Another constructor
    // This one will allow the calling code to populate the class' fields
    // whenever a new Person object is created
    // Otherwise you would have to write additional code to set the fields via properties
    // ie: setFirstName("Casey");
    //     setLastName("Edwards"); etc, etc...
    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // Properties
    // Notice the 'public' modifier.
    // We CAN access these properties outside of the Person class
    // once a new Person object is instantiated
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFullName(){
        // Notice the use of our old friend 'this'
        return this.firstName + " " + this.lastName;

        // We use 'this' to signify that we want data from THIS instance of Person, as opposed to any other instance.
        // (think like you have multiple Person objects in your calling code)
    }

    // We use the 'static' keyword to let the code know that we have class member which
    // is not dependent on anything within the instance in order to perform it's functionality
    public static void printGreeting(String greeting, String fullName){

        // You could pass in ANY strings from ANY Person object in order to perform this greeting
        System.out.printf("%s %s", greeting, fullName);
    }

    // Speaking of OOP, do we REALLY want something like printGreeting defined on the Person class?
    // Doesn't it sound like something which is not directly related to the Person itself?
}
