package fundamentals;

import java.util.Scanner;

public class ConsoleIO {

    public static void main(String[] args) {

        // ================================== print() and println()

        // this:
//            System.out.println("here");
//            System.out.println("there");

        // is equivalent to this:
//            System.out.print("here\n");
//            System.out.print("there\n");

        // without the newline characters, print outputs this:
//            System.out.print("here");
//            System.out.print("there");

        // to concatenate, just like JS:
//            System.out.println("Hello" + " " + "World");

        // ================================== printf() / .format()

        // Print a formatted string using the following... printf(formatString, data)

        // same output as print():
//            System.out.printf("Hello");
//            System.out.printf("World!");

        // creating a string variable:
//            String bigBall = "World";
//            System.out.printf("Hello %s", bigBall);
//            String firstN = "Casey";
//            String lastN = "Edwards";
//            System.out.printf("%s %s", firstN, lastN);

//            System.out.printf("Hello %S", bigBall); // all caps


        // use printf to display your first name and last name from two variables (firstN and lastN)

        // multiple variables:
//            int three = 3;
//            String typeOfPetGroup = "cats";
//            System.out.printf("I have %d %s.", three, typeOfPetGroup);

         //currency:
//            int currencyPennies = 1000;
//            System.out.printf("I'll sell you swamp land for $%.2f an acre!", currencyPennies / 100.00);

//        int age = 23;
//        String name = "Fred";
//        String state = "Texas";

        // Fred is from Texas and is 23 years old.

        // ================================== USER INPUT

//          For Java applications, we can create interactive functionality easily
//          To do this, we need a few different tools in concert:
//              -> An input stream: we use the keyboard used on the command line
//                  -> System.in (or, your Operating System's default input stream)
//              -> A Java object which can accept that input stream (java.util.Scanner)
//                  -> We tell the Scanner object to check this input stream for changes
//                      -> Scanner(System.in)
//              -> As this is an instance object (more on that later), we must make a new instance of it before the Scanner is available
//                  -> Scanner scanner = new Scanner(System.in)


//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter your first name!");
//        String userFname = sc.next();
//        System.out.println("Please enter your last name!");
//        String userLname = sc.next();
//        System.out.printf("Hello, %s %s", userFname, userLname);

        /* TODO: use the scanner to take in the name of the month you were born and print it back out
            - remember to first prompt the user for the input
         */

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter month you were born");
//        String month = sc.next();
//        System.out.println("You were born in " + month);

//        System.out.println("Please enter your age:");
//        int age = sc.nextInt();
//        System.out.println("You are " + age + " years old");



        // .next() captures each input separated by a string:
//            System.out.print("Please enter your first, middle, and last name: ");
//            String firstName = sc.next();
//            String lastName = sc.next();
//            String what = sc.next();
////
//            System.out.println(firstName);
//            System.out.println(lastName);
//            System.out.println(what);

        // .nextInt() captures the first valid int value:
//            System.out.print("Please enter your age: ");
//            int age = sc.nextInt();
//            System.out.println(age);

        // .nextLine():
//            System.out.println("Favorite quote: ");
//            String quote = sc.nextLine();
//            System.out.println(quote);

        // Quirk of using next() then nextLine()...
        // https://stackoverflow.com/questions/13102045/scanner-is-skipping-nextline-after-using-next-or-nextfoo
        // https://coderanch.com/wiki/676482/Scanner-nextLine-gotcha
//            Scanner sc = new Scanner(System.in);
//            System.out.print("Please enter your favorite number: ");
//            int num = sc.nextInt();
//            System.out.println(num);
//            System.out.print("Please enter your favorite words: ");
//            String words = sc.nextLine();
//            System.out.println(words);


        /* TODO: use the scanner to take in your birthday as an integer and then name of the month you were born and print it back out
            - remember to first prompt the user for the birthday day of the month and store as an integer
            - next take in name of the month with .nextLine()
            - print out the result
            - use a fix to prevent the month name input from being skipped
         */

//        System.out.println("Please enter the day of the month you were born: ");
//        int day = sc.nextInt(); // 4\n
//        System.out.println("Please enter the month you were born: ");
//        sc.nextLine(); // clears out new line
//        String month = sc.nextLine();
//        System.out.println("You were born " + month + " " + day);

    }
}
