package oop;

import java.util.Arrays;
import java.util.Scanner;

public class ObjectOrientedProgramming {

    // Before talking about Object Oriented Programming in practice, we need to talk about why it exists and a little history:
    // Here's a great Medium post by Eric Elliot: https://medium.com/javascript-scene/the-forgotten-history-of-oop-88d71b9b2d9f

    /*

    “OOP to me means only messaging, local retention and protection and hiding of state-process, and extreme late-binding of all things.”
    ~ Alan Kay

    */

    // In short, the essence of OOP is to encapsulate the code you write into similar groupings so as to remove the execution logic from those who need your functionality

    // --> MyClassOne needs to be able to take text a user inputs and display it to the user.

    // --> However, the actual code for taking inputs and returning strings should be delegated to MyClassTwo

    // --> MyClassOne will call on methods from MyClassTwo when they need to start taking input from the user
    // and MyClassTwo's methods will return the strings MyClassOne needs

    // --> MyClassOne will then print the strings to the console.

    // On a larger scale, we can think of entire libraries which, let's say, abstract away the functionality of creating a MapBox (MapBox API) from the code which is needing to implement a MapBox (your code).
    // Also, we can abstract away the library which manages the DOM (jQuery) from the code which needs to make changes to the DOM for a specific use-case (your code).

    // What this allows is for code written for a specific purpose to be:
    // --> Reused in any use-case
    // --> Protected from changes outside of the scope of what it should do (MAKING a MapBox as opposed to USING a MapBox)
    // --> Extend and enhance functionality without breaking other parts of a program




    // =================== Making a Class ====================

    // First off, what is a CLASS?
    // Simply, a class is a definition of related data/code

    // When called upon by other parts of a program, we call it an OBJECT

    // Example: I define a Person class, with characteristics of a person

    // In another class, I call upon the Person object - the OBJECT being a representation of the class' definition

    // CLASS -> the definition

    // public class Person {
    //   private String name;
    //   private int age;
    // }

    // OBJECT -> an instance of that class

//     Person person = new Person(); // by using 'new' we create a NEW instance of the Person object



//     public String[] getUserInput(){
//
//          Scanner sc = new Scanner(System.in);
//
//          String inputString = sc.nextLine();
//
//          return inputString.split(" ");
//
//     }
//
//     public void printFact(int fact){
//          System.out.println(fact);
//     }
//
//     public void printFact(String fact){
//          System.out.println(fact);
//     }
//
//     public void printFact(boolean fact){
//          System.out.println(fact);
//     }
//
//     public void printUserFacts(){
//
//          String[] stringFacts = getUserInput();
//          String[] hasPetsValues = {"YES", "Y", "NO", "N"};
//          boolean printedAge = false;
//          boolean printedHasPets = false;
//
//
//
//     }
//
//     public void compareFacts(stringFacts){
//          for (String stringFact : stringFacts) {
//               if (tryParseInt(stringFact) != null){
//                    printFact(Integer.parseInt(stringFact));
//                    printedAge = true;
//               }
//               if (Arrays.asList(hasPetsValues).contains(stringFact)){
//                    printFact(parseBoolean(stringFact));
//                    printedHasPets = true;
//               }
//               if (printedAge && printedHasPets){
//                    printFact(stringFact);
//               }
//          }
//     }
//
//
//     public boolean parseBoolean(String value){
//          switch (value.toUpperCase()){
//               case "YES":
//               case "Y": {
//                    return true;
//               }
//               case "NO":
//               case "N":{
//                    break;
//               }
//
//          }
//          return false;
//     }
//
//
//
//     public Integer tryParseInt(String value){
//          try {
//               return Integer.parseInt(value);
//          }catch(Exception e){
//               return null;
//          }
//     }


//     public static void main(String[] args) {
//          String tryChangingMe = "hello hello!";
//
//          //get hashcode of the original string variable
//          System.out.println("Original Hashcode: " + tryChangingMe.hashCode());
//
//          changeString(tryChangingMe);
//
//          System.out.println(tryChangingMe);
//     }

//     public static void changeString(String randomString){
//
//          // print the hashcode of the referenced argument
//          System.out.println("Reference Hashcode: " + randomString.hashCode());
//
//          randomString = "something new";
//
//          System.out.println("CHANGED Reference Hashcode: " + randomString.hashCode());
//
//          System.out.println(randomString);
//
//
//
//
//
//
//
//
//
//
//
//     }

//     public static void main(String[] args) {
//          changingThings();
//     }
//
//     public static void changingThings(){
//          Object myObj = new Object(); // new object is created, and a pointer is created to let our system know where to find it in our memory.
//          // You can see that pointer by using .hashCode() or System.identityHashCode().
//
//          // Alternatively, you can simply print out the object itself.
//          System.out.println("\nOriginal object BEFORE myMethod runs: \n" + myObj);
//
//          Object myObj2 = myMethod(myObj);
//
//          System.out.println("\nOriginal object AFTER myMethod runs: \n" + myObj);
//          System.out.println("\nNEW object AFTER myMethod runs: \n" + myObj2);
//          // This will print out "Casey" because the OBJECT we pass in to myMethod only creates
//          // a 'shallow copy' of the original objects pointer (its place in your memory heap)
//     }
//
//     public static Object myMethod(Object obj){
//          System.out.println("\nParameter object id: \n" + obj);
//          obj = new Object(); // create a NEW Object. This Object type is immutable. Meaning, once it is created, the object itself cannot be altered.
//          // The properties and fields on the Object type can be changed, just not the whole object.
//          // Therefore when we assign new Object() to obj, we are actually creating a whole new object in memory, NOT changing the original.
//          System.out.println("\nNew object created and assigned to parameter: \n" + obj);
//          return obj;
//          // This will create a NEW object in memory and assign it to the parameter obj.
//          // However, it will not change the object sitting at the original memory address
//     }








}
