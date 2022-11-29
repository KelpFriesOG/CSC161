package basics;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class August_9_2022 {

    /* Chapter 12: File I/O */

    /*
     * A file object encapsulates the properties of a file or its path
     * but it does not contain the methods for reading/writing data from and
     * to a file. You need to use Scanner and PrintWriter to read and write
     * to files respectively.
     * 
     * remember to close your damn files with file.close()
     * 
     */

    public static void main(String[] args) {
        System.out.println("Hello world");
        File file = new File("src/basics/test.txt");
        replaceEntry(file, "file", "kelp");
        System.out.println(readFile(file));
    }

    // #region Methods

    public static ArrayList<String> readFile(File file) {
        ArrayList<String> result = new ArrayList<String>();
        try {
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                result.add(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return result;
    }

    public static void writeFile(File file, ArrayList<String> contents) {
        try (PrintWriter writer = new PrintWriter(file)) {
            for (int i = 0; i < contents.size(); i++) {
                writer.println(contents.get(i));
            }
            writer.close();
        }

        catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void writeFile(File file, String[] contents) {
        try (PrintWriter writer = new PrintWriter(file)) {
            for (int i = 0; i <= contents.length; i++) {
                writer.println(contents[i]);
            }
            writer.close();
        }

        catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void replaceEntry(File file, String target, String replacement) {
        ArrayList<String> contents = readFile(file);
        for (int i = 0; i < contents.size(); i++) {
            contents.set(i, contents.get(i).replaceAll(target, replacement));
        }
        // We use arraylist .set() functionality to replace a each line,
        // with a regex filtered version of the same line via replaceAll!

        File result = new File(
                "src/basics/" + file.getName().substring(0, file.getName().length() - 4) + "Replaced.txt");
        // If filename is test.txt, this code makes a new file labeled testReplaced.txt

        writeFile(result, contents);
        // This method is custom-made and available above,
        // the overloaded one with an ArrayList parameter is used!
    }

    // #endregion
}
