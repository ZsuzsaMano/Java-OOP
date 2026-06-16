package Steams;

import java.io.FileNotFoundException;
import java.io.IOException;

public class FileAccessTest {
    public static void main(String[] args) {
        String fileName = "test.txt";
        try {
            String text = "Lorem ipsum dolor sit amet, "
                    + "consectetur adipisici elit, sed "
                    + "eiusmod tempor incidunt ut labore "
                    + "et dolore magna aliqua.\nUt enim ad "
                    + "minim veniam, quis nostrud exercitation "
                    + "ullamco laboris nisi ut aliquid ex ea "
                    + "commodi consequat.\nQuis aute iure "
                    + "reprehenderit in voluptate velit esse "
                    + "cillum dolore eu fugiat nulla pariatur.\n"
                    + "Excepteur sint obcaecat cupiditat non "
                    + "proident, sunt in culpa qui officia "
                    + "deserunt mollit anim id est laborum.";
            FileAccess.writeTextToFile(fileName, text);
        } catch (FileNotFoundException e) {
            System.out.println("Can't open " + fileName);
            return;
        } catch (IOException e) {
            System.out.println("IOException reading " + fileName);
            return;
        }
        try {
            FileAccess.readTextFromFile(fileName);
        } catch (IOException e) {
            System.out.println("Can't open " + fileName);
        }
    }
}
