package collections;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayLecture {

    public static void main(String[] args) {
        comparePersonArrays(5);
    }

//        public static String[] getStringArray(){
//
//        String[] stringArr; // We don't have to instantiate the array when we define it in memory
//
//        // Unlike JavaScript, we must define the length of the array when we instantiate it
//        stringArr = new String[5];
//
//        for (int i = 0; i < 5; i++){
//            stringArr[i] = String.format("Thing %s", i);
//        }
//        return stringArr;
//    }


    public static void printStringArray(){

        String[] stringArr = getStringArray();
        StringBuilder printableStringArr = new StringBuilder();
        printableStringArr.append("[");
        for (int i = 0; i < stringArr.length; i++){
            printableStringArr.append(stringArr[i]);

            if (i != stringArr.length - 1){
                printableStringArr.append(", ");
            }
        }
        printableStringArr.insert(printableStringArr.length(), "]");

        System.out.println(printableStringArr);
    }


    public static byte[] getByteArray(){
        return new byte[5];
    }

    public static String[] getStringArray(){
        return new String[5];
    }

    public static void fillArray(byte[] arr){
        System.out.println(Arrays.toString(arr));

        Arrays.fill(arr, (byte)1);

        System.out.println(Arrays.toString(arr));
    }

    public static void fillArray(){
        int[] intArr = {1, 2, 3, 4};
        System.out.println(Arrays.toString(intArr));
    }

    public static void printArray(String[] arr){
        System.out.println(Arrays.toString(arr));
    }


    public static String[] fillStringArray(String[] arr){
        Arrays.fill(arr, "thing");
        return arr;
    }

    public static void compareStringArrays(){
        String[] arr1 = fillStringArray(getStringArray());

        String[] arr2 = fillStringArray(getStringArray());

        arr1[0] = "not thing";
        printArray(arr1);
        printArray(arr2);
        System.out.println(Arrays.equals(arr1, arr2));
    }

    public static boolean comparePersonArrays(int numOfPeople){

        ArraysPerson[] people1 = PersonFactory.getPersonArray(numOfPeople);
        System.out.println(people1[2].getName());

        ArraysPerson[] people2 = Arrays.copyOf(people1, people1.length);
        //System.out.println(Arrays.toString(people2));

        people2[2].setName("Jim BOb");
        System.out.println(people1[2].getName());
//        System.out.println(Arrays.toString(people1));
//        System.out.println(Arrays.toString(people2));
        return Arrays.equals(people1, people2);
    }

    public static int[] getIntegerObjArray(){
        // Now, what if we want to both define and initialize an array at the same time?
        return new int[]{5, 4, 3, 2, 1}; // Curly braces with the values you pass in!
        // Keep in mind, you must still stick to the immutability of the array's size
    }

    public static void sortArray(){
        int[] intArray = getIntegerObjArray();
        Arrays.sort(intArray, 2, 4);
        System.out.println(Arrays.toString(intArray));
    }


}
