package exceptions;

import java.util.Scanner;

public class ErrorHandling {
    public static void main(String[] args)   {
//        Scanner sc = new Scanner(System.in);
        //WARM UP
        // TODO Given this string: `String str = "Oberon is the
        //  best cohort ever!"`, print out the character from that
        //  string using a random number generator, that generates
        //  a number between 0 and 50. Using a try/catch block, handle
        //  any errors (Exceptions) that may occur by printing out the
        //  message.
//        String str="Oberon is the best cohort ever!";
//        System.out.printf("string length: %s%n",str.length());;
//        int randomNum = (int)(Math.random()*50);
//        System.out.printf("random number: %s%n", randomNum);
//
//        try{
//            char c;
//            c = str.charAt(randomNum);
//            System.out.println(c);
//        }catch(StringIndexOutOfBoundsException e){
//            e.printStackTrace();
//            System.out.println("Oh no, you've got a problem");
//        }
        
        // CHECKED EXCEPTIONS -- without method signature
//        getIndentationPreference();
        String indentationPreference;
//
        try {
            indentationPreference = getIndentationPreference();
            System.out.println("Okay, " + indentationPreference + " is a great choice.");
        } catch (Exception e) {
            System.out.println("Uh oh, something went wrong: " + e.getMessage());
            System.out.println("Here is some more detail:");
            e.printStackTrace();
        }

//         CHECKED EXCEPTIONS -- using throws Exception
//        getIndentationPreference();
    }
    
    public static String getIndentationPreference() throws Exception {
//        //
//        Scanner sc = new Scanner(System.in);
//        System.out.print("What type of indentation do you prefer?");
//        String indentationPreference = sc.nextLine();
//
//        if (indentationPreference.equals("tabs")) {
//            throw new Exception("Spaces are superior!");
//        }
//
//        return indentationPreference;
//    }
        
        // CUSTOM EXCEPTION
        Scanner sc = new Scanner(System.in);
        System.out.print("What type of indentation do you prefer?");
        String indentationPreference = sc.nextLine();
        
        if (indentationPreference.equals("tabs")) {
            WrongIndentationTypeException e;
            e = new WrongIndentationTypeException("spaces are awesome");
            throw e;
        }
        return indentationPreference;
    }
    
    
}

