package fileIO;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileIO {

    public static void main(String[] args) {
        init();
    }

    public static void init(){

        // Try to create the directory
        Path path = FileDirectoryUtil.getPath("src", "fileIO", "files");
        FileDirectoryUtil.tryCreateDirectory(path);

        // Try to create the file
        path = Paths.get(path.toString(), "test.txt");
        FileDirectoryUtil.tryCreateFile(path);

        // Print out the final location of the file
        System.out.println(path.toAbsolutePath());
        IOUtil.tryPrintContents(path);

    }




}
