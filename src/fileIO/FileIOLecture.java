package fileIO;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileIOLecture {

    public static void main(String[] args) {
        //TODO: call my file IO method(s) here
        init();
    }

    public static void init(){

//        System.out.println("\nAbsolute Path: ");
//        System.out.println(getFilePath("src","fileIO","test.txt").toAbsolutePath());
//        System.out.println("\nThe File Exists: ");
//        System.out.println(doesPathExist(getFilePath("src","fileIO","test.txt")));

//        System.out.println(doesPathNotExist(getFilePath("source","fileIO","test.txt")));
        System.out.println(tryCreateDirectory(Paths.get("src", "fileIO", "data")));

    }

    // TODO: Let's write a method, getFilePath(String filename) which will return the Path object of our test.txt file
    public static Path getFilePath(String filename){
        // java.nio.file.Paths is a class which gives us access to numerous static methods
        // for finding/setting file paths
        return Paths.get(filename);
    }

    // TODO: Let's write an override to getFilePath() which takes in more params
    public static Path getFilePath(String directory, String filename){
        // by passing a parentDirectory argument, we can get returned a path with the parent/filename
        return Paths.get(directory, filename);
    }

    // TODO: Another getFilePath override, this time with two directories and the filename
    public static Path getFilePath(String parentDirectory, String childDirectory, String filename){
        return Paths.get(parentDirectory, childDirectory, filename);
    }

    // A big thing to note: Paths.get() does NOT verify that the path actually exists.
    // It merely returns a Path object that contains the values you passed to get()

    // To verify we actually have that path-to-file, we nee to bring in the File class
    // TODO: We will write a method which returns true/false based on where the Path param's path exists
    public static boolean doesPathExist(Path path){
        return Files.exists(path);
    }

    // TODO: Now let's right a method which will tell us if the path does NOT exist
    public static boolean doesPathNotExist(Path path){
        return Files.notExists(path);
    }

    // We can create a directory with Files.createDirectory(Path path)
    public static String tryCreateDirectory(Path pathToCreate){
        //Notice the compilation warning about Files.createDirectory()
        //We need to handle this possible exception by either throwing, catching, or using a conditional
        if (Files.notExists(pathToCreate)){
            try {
                Files.createDirectory(pathToCreate);
            } catch (Exception e){
                return e.getCause().toString();
            }
        }else{
            return "The directory already exists";
        }

        return "The directory was created";
    }
}
