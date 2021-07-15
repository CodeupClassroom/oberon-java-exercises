package oop;

public class PersonUtils {

    // By moving this method to a PersonUtils,
    // we don't need to make a new Person object in order to simply print a greeting!
    public static void printGreeting(String greeting, String fullName){
        System.out.printf("%s %s\n", greeting, fullName);
    }
}
