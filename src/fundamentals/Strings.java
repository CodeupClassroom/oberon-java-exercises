package fundamentals;

import java.util.Scanner;

public class Strings {
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

////        --------------- WARMUP ---------------
//          TODO: Creat a enw "Strings-Lecture-Notes" java class file
//           (or wherever you like to keep notes/lecture exercises. Copy
//           below code - this is your starting point. Using Scanner,
//           prompt a user (it's you. you're the user) to type in their
//           first name. Save the input into a STring variable. If your
//           name matches randomName, print "woah! how did you know that
//           randomName is: userInputName" If randomName doesn't match
//           the inputName exactly, print: "Way off my friend, My name
//           isn't randomName, it's inputName.".
//
//        WARM UP STARTING CODE:
//        String[] studentsArr =
//                {"Amado", "Christian", "Christopher", "Corey", "Demetrio",
//                        "Diamond", "Erik", "Grady", "Jesse", "Joshua",
//                        "Juan", "Mitchell", "Moses", "Nathan", "Prachi",
//                        "Raul", "Ricardo", "Richard", "Robert", "Sam",
//                        "Sean", "Stephen", "Tiffanny", "Wagner", "Laura",
//                        "Casey", "Dorian", "Tristan", "Jordy"};
//
//        int randomNum = (int) (Math.random() * 28);
//        String randomName = studentsArr[randomNum];

//        WARM UP CODE GOES HERE:
//        // SOLUTION:
//        System.out.println("enter your first name: ");
//        String myName = sc.next();
//        System.out.format("hello, replace this with %s%n", randomName);
//        System.out.printf("%n hi print a variable here: %s", randomName);
//
//
//        if (randomName.equals(myName)) {
////            System.out.println("Woah, you guessed: " + randomName +
////                                       "!!" + "How did you know my name is: " + myName);
//        } else {
////            System.out.println(
////                    "way off my friend! My name isn't " + randomName +
////                            ", it's " + myName);
//        }
//

// --------------- INTRO ---------------

//        Intro
//          String: a non-primitive data type, refer to an objects
//        String msg = "hello";
//        System.out.println(msg);
//        msg = msg + ", how are you?";
//        System.out.println(msg);


//        --------------- Immutability & Concatenation ---------------


//        example string concatenation:
//        String message = "Hello";
//        System.out.println(message); // prints "Hello"
//        message = message + " World!";
//        System.out.println(message); // prints "Hello, World!"
//
//

//        --------------- String Comparison ---------------
//          --> return true or false
//        syntax: couchYou'reComparingTo.stringComparison("pillow");

//        .equals()
//        System.out.println("do you like pizza? [y/n]? ");
//        String userInput = sc.next();
//        System.out.println(userInput);
//        if(userInput.equals("y")){
//            System.out.println("yes I like pizza");
//        } else {
//            System.out.println("no pizza for me. I'm crazy");
//        }

//        .equalsIgnoreCase()
//        comparingToThis.equalsIgnoreCase()("what you're comparing");

//        System.out.println("What's your name");
//        String userInput = sc.next();
//        System.out.println(userInput);
//        if(userInput.equals("Laura")){
//            System.out.println("yes that's my name exactly");
//        } else if (userInput.equalsIgnoreCase("Laura")){
//            System.out.println("That's my name but you forgot to " +
//                                       "capitalize a letter");
//        } else {
//            System.out.println("that's not my name!");
//        }

//        .startsWith() : compare the first word and see if it is a
//        match, case-sensitive
//        String myFaveBand = "The Lumineers";
////        String upper = myFaveBand.toUpperCase();
//        System.out.println((myFaveBand.toUpperCase()).startsWith("the".toUpperCase()));
        // false
//        System.out.println(myFaveBand.startsWith("The")); // true
//        System.out.println(myFaveBand.startsWith(" The")); // false
//        System.out.println(myFaveBand.startsWith("The ")); // true


////        .endsWith() - compare the last word in the orginal String,
////        case-sensitive
//        String myFaveBand = "The Lumineers";
//        System.out.println(myFaveBand.endsWith("Lumineers")); // false

//        --------------- MINI EXERCISE ---------------
//        TODO: create a String variable that holds this sentence: "Red
//         Orange Blue Yellow Green Purple". Prompt the user to type in
//         their favorite color, if their fave color is the same as the
//         first word in the String, then print out "my fave color:
//         userColor is the first one"
//


//        --------------- STRING MANIPULATION  METHODS ---------------

//        charAt(): return char that's living in the slot of the
//        index you provide. gotta save the returned value in a char
//        variable. pass in an int
//            String  myFaveWord = "hemoglobin";
//            char fourth = myFaveWord.charAt(4);
//        System.out.println(fourth);


//        indexOf(): return the index of the a substring that's being
//        passed in, if that substring(char) doesn't exist, you'll see a
//        -1;
        String earthFact =
                "Seventy percent of the oxygen on Earth comes from ocean algae. Without it, we couldn’t breathe.";
        // System.out.println(earthFact.indexOf("oxygen")); // looking for
//        // the indexOf a word will return the index of the first char of
//        // that word
//        System.out.println(earthFact.indexOf('o')); // look for the
//        // indexOf a single char it wil return the index of the first
//        // time it appears
//
//        explicit casting
//        byte indexOfX = (byte) earthFact.indexOf('x'); //
//        System.out.println(indexOfX);

//        lastIndexOf(): return the index (int) from the end of the
//        string,
//            String scuba = "self contained underwater breathing apparatus";
//            char letter = 'c';
////        System.out.println(scuba.lastIndexOf('s'));
//        System.out.println(scuba.indexOf('u'));
//        String word = "underwater";
//        System.out.println(scuba.lastIndexOf(word));


//        length():
//        String superCali = "Supercalifragilisticexpialidocious";
//        System.out.println(superCali.length());

////        replace(): return a copy of the string with the replacement
//        String before = "giggles";
//        String after = before.replace('i', 'o');
//        System.out.println("Typo alert! you can't swith with: " + before + " but you can swim with: " + after);

//        substring(): return a new substring from the original string
//        at the points in which you told it to extract from
//        String danceArms = "Where are you supposed to put your arms when" +
//                                   " you dance? It's like the universal " +
//                                   "question.";
//        int indexArms = danceArms.indexOf("arms"); //
//        int indexQuestion = danceArms.indexOf('I');
//        String newSentence = danceArms.substring(indexArms, indexQuestion);
//        System.out.println(newSentence);


//        toLowerCase(); AND toUpperCase();
//            String coders = "The Distance between looking like a genius " +
//                                    "and Looking like an idiot in " +
//                                    "programming? It’s one Character " +
//                                    "wide.";
//        System.out.println(coders);
//        System.out.println(coders.toLowerCase());
//        System.out.println(coders.toUpperCase());


//        trim():  will return a copy of the string without any spaces
//        before or after the string
        System.out.println("give me some space: ");
        String userInput = "hello world          ";
        String newString = userInput.trim();
        System.out.println(newString);
        
        
    }
}
