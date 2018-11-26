package W4.T4;

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
