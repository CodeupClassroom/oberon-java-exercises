public class SyntaxTypesVariables {

    // Intellij Keyboard Shortcuts Cheatsheet - useful shortcuts!
    // https://www.jetbrains.com/help/idea/mastering-keyboard-shortcuts.html
    // https://www.shortcutfoo.com/app/dojos/intellij-idea-mac/cheatsheet


    public static void main(String[] args) {

        // =========== STATEMENTS ============

        // Because Java is compiled ahead of time, there can be no compilation errors

        // Every statement must end with a semicolon, or else you get an error!

        // Notice there is a red squiggly below?
        // Intellisense is trying to tell you it's an error
        System.out.println("Hi! My name is what?");

        // Try to compile this without a semicolon
//        System.out.println("My name is who?");


        // =========== COMMENTS ============

        // Single Line Comment

/*        this
            is
                a
                    multi-line
                        comment
*/

        // How to be selective about comment blocks
        // Somebody find the keybinding for comment blocks

//        var stuff = "stuff";
//
//        if (stuff == "stuph"){
//            System.out.println("oooooweeeee that's not right!");
//        }


        // =========== CODE BLOCKS ============

        // Although I don't often see it used by itself,
        // code blocks are a way Java let's us achieve a type of scoping

//        {
//            var stuph = "stuff";
//        }

        // In the above, you notice we cannot access var stuph - scoping magic!
        // stuph = "more stuff";

        // Here's perhaps a deep illustration of scoping... kind of:

//        var myName = "Shady";
//        var theReal = "Slim";
//
//        if (myName != "Shady"){
//
//            var shady = "Shady";
//
//            myName = theReal + " " + shady;
//
//        }else{
//            var shady = "But where's Dre??";
//
//            myName = shady;
//        }
//        System.out.println(myName);

        // Yes, the code block used by the if statement
        // is the same as the anon code block above this example

        // We can also extrapolate that to be the same for classes, methods, and many other
        // constructs in Java. Essentially, if you see {},
        // assume no scoped variables/objects are visible outside of that block


        // =========== DATA TYPES - Primitive ============

        // *** BYTE, SHORT, INT, LONG ***

        // These types deal only with positive and negative whole, real numbers
//        byte bite = 127;
//        System.out.println(((Object)bite).getClass().getName());
//
//        short shrt = 32000;
//        System.out.println(shrt);
//        System.out.println(((Object)shrt).getClass().getName());
//
//        int intgr = 2147483647;
//        System.out.println(intgr);
//        System.out.println(((Object)intgr).getClass().getName());

        // Compiler sees 'long' as an integer wrapper, so we have to add 'L' at the end
//        long lng = 9223372036854775807L;
//        System.out.println(((Object)lng).getClass().getName());


        // *** Arithmetics on Different Types ***

        // byte + byte = integer
        //System.out.println("Computed Data Type: " + ((Object)(bite+bite)).getClass().getName());

        // byte + short = integer
        //System.out.println("Computed Data Type: " + ((Object)(bite+shrt)).getClass().getName());

        // Adding 1 to integer's max value
        //System.out.println(intgr);

        // Going +1 beyond long's max value
        //System.out.println(lng+1);

        // In both instances above we see an interesting behavior.
        // When we exceed the max value, by 1 the value now becomes the min value
        // This is because Java sees all primitive number values as an array of sorts
        // When you try to point to the [max]+1, the JVM will wrap the pointer to the beginning
        // of the array
        // Likewise, if you try to point to [min]-1, it will wrap to the end of the array

        // The degree to which it wraps is determined by how much the computed value exceed the
        // min/max

        // If I add (max value + 3) to the integer's max value, I get 1
//        System.out.println(intgr + (intgr + 3));
//        System.out.println(intgr + intgr);

        // *** FLOAT ***

        // Key here is you can name a float variable and assign it a whole number
//        float flt = 1;
//        System.out.println("Float Number: " + flt); // it will convert on print

        // However, if I assign single precision decimal to the float I get a conversion issue
        // The compiler thinks I'm trying to pass it a decimal type
        //float flt2 = 1.1f; // To solve this, we put 'f' on the end of the value

        // Most often, you'll see float used in cases where some precision of the number's value
        // is needed, but not as acute as needed in scientific computation
//        float flt3 = 1873.2f;
//        float flt4 = 1873e3f;


        // *** DOUBLE ***
        // Like float, but with a much larger min/max range

        // Double, being double precision, allows also for more acute approximation of a number's
        // value. You see it often used where the greatest degree of precision is needed for
        // accurate representation of data (ie: science, theoretical mathematics)

        // *** BOOLEAN ***

        // Much like in JS, booleans are used to determine true or false
        // You may also use boolean expressions as an assignable type to variables & conditionals
//        Boolean isTrue = true;
//        Boolean alsoIsTrue = (1 > 2);
//        Boolean alsoAlsoIsTrue = (1 < 2 && 1 > 0);

        // *** CHAR and STRING ***

        // Chars are single unicode characters

        // You write them in a single quotes

        //char letter = 'a'; // good
//        char ltr = "a"; // bad


        // A String in Java is technically an array of characters

        // We wrap strings with double quotes in Java!
        //String strg = "Hi, my name is";

        // Also, notice I capitalized the type declaration
        // This is because a string is not a primitive type, but rather a class (or object)
        // Because it is a class, you there are many methods available
        // on the string to use for manipulation

        //int strLength = strg.length(); // <- right? a collection method!

        // In the early days of Java, the 'frontend' was actually just output to a terminal/console

        // People wanted a way to neatly format output to that console

        // Introducing, special characters!

        // \n => newline character
//        String aNiceSentence = "Hi, my name is Casey! \nI'm super glad to know you!";
//        System.out.println(aNiceSentence);

        // \t => tab character
//        String aNicerSentence = "\nThink bold.\n\n \tThink big.\n\n \t\tThink Different.\n";
//        System.out.println(aNicerSentence);


        // =========== VARIABLES ============

        // Simple stuff here:

        // Variables are a bit different in Java than JS

        // While you can declare a variable with the 'var' keyword, we MUST remember
        // that Java is strongly typed
        // This means that whatever data/object type we assign to the variable initially will
        // remain the same type for as long as it is in memory
        //var thing = "stuff"; // this is a string and will remain a string

        // thing = 1; //bad, can't assign an integer to a string!

        // Also, we can take advantage of our strongly-typed language by declaring what type our
        // variables will be as soon as we declare
        //String myName = "Casey";

        // This helps us, our fellow programmers, and the compiler know which data type will be
        // stored in memory before we even run the program!

        // Get in the habit now of declaring variables as a strong type - you'll thank yourself!

        // That's not all! Suppose you don't want to assign a value to variable until you are
        // ready to use it. We can do this:

//        String myOtherString;
//
//        if (myName.equals("Casey")){
//            myOtherString = "31";
//            // careful here, though! If the condition isn't true, then myNum will be null!
//        }/*else{
//            myOtherString = "21"; // so add a condition that meets the requirement
//        }*/

//        if (myOtherString != null){
//            System.out.println(myOtherString);
//        }

        // *** Constants ***

        // Constants are immutable and declared with the keyword 'final'

        // 'final' MUST be followed by the data type
        //final String url = "www.google.com";

        // Like with JS constants, be sure that you never intend on the variable to change!


        // =========== ARITHMETIC OPERATORS ============

        // + -> Add! Woo!
        // - -> Subtract! Woo!
        // * -> Multiply! Woo!
        // / -> Divide! Woo!
        // % -> Modulus! (get the remainder of the left # when divided by the right #) Woo?

        // ++ -> Increment

        // a++ or ++a

        //int i = 0;

        //System.out.println("First Combo: " + (++i + i++ + i++));

        //System.out.println("Second Combo: " + (i++ + ++i + ++i));

        // a-- or --a
        //System.out.println("First Dec Combo: " + (--i + i-- + i--));

        //System.out.println("Second Dec Combo: " + (i-- + --i + --i));


        // =========== CASTING ============

        // With casting, we can transform a type from one variable
        // to a different type in another variable

        // Implicit. You don't have to do anything beyond assigning because of the relationship
        // between integer and long
//        int anInteger = 345;
//        long aLong = anInteger;
//
//        double aDouble = anInteger;
//
//        float aFloat = anInteger;

//        short aShort = anInteger; // oops! This is called narrowing. EXPLICITLY cast this one

//        short aShort = (short)anInteger;
//        System.out.println(((Object)(aShort)).getClass().getName());

//        String castingString = "cast me!";
//        int castingInt = (Integer)castingString; // sometimes, even an explicit cast won't work

        // When we get to OOP, you'll see ways we can combine casting with
        // a concept you learned previously... Mapping!

    }
}
