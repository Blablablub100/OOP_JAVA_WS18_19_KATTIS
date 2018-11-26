package W4.T4;

/**
 * Advanced Object Oriented Programming with Java, WS 2018
 * Problem: Exercise 4 Task 4
 * Link:
 * @author Clemens Tisch
 * @author Nikodemus Kochanek
 * @version 1.0, 11/15/2018
 *
 * Method : Ad-Hoc
 * Status : ???
 * Runtime: ???
 */

import java.io.*;

public class FileIO {

    public String readFile(String file) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String         line = null;
        StringBuilder  stringBuilder = new StringBuilder();
        String         ls = System.getProperty("line.separator");

        try {
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line);
                stringBuilder.append(ls);
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }

    public void writeFile(String filename, String content) {
        try (BufferedWriter custBuffer = new BufferedWriter(new FileWriter(filename))) {
            custBuffer.write(content);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
