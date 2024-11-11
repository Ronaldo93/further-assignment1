package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileUtility {
  private String fileName;

  public FileUtility(String fileName) {
    this.fileName = fileName;
  }

  /**
   * Read the content of the file
   * 
   * @return the content of the file
   */
  public String readFile() {
    System.out.println("Reading file: " + fileName);

    // try opening the file
    File file = new File(fileName);
    if (!file.exists()) {
      System.out.println("\"File does not exist: \" + fileName");

      // create new file instead
      try {
        file.createNewFile();
      } catch (Exception e) {
        throw new RuntimeException(e);
      }
    }

    try (FileReader fr = new FileReader(fileName)) {
      // use buffered for increased performance
      // since this implements buffer, we don't need
      // to do this manually (e.g. using byte array to read)
      BufferedReader br = new BufferedReader(fr);

      // an string to store the content of the file
      String content = "";

      // a char array to store the read chunk and
      // string that represent the read chunk
      char[] read = new char[4096];
      int charsRead = 0;

      // read the file by chunk
      while ((charsRead = br.read(read)) != -1) {
        String chunk = new String(read, 0, charsRead); // create a string from the char array
        content += chunk;
      }

      // return the content of the file
      return content;
    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  /**
   * Write the content to the file
   * 
   * @param content the content to write to the file
   */
  public void writeFile(String content) {
    System.out.println("Writing file: " + fileName);

    try {
      // try opening the file
      File file = new File(fileName);
      if (!file.exists()) {
        System.out.println("File does not exist: " + fileName);

        // create new file instead
        file.createNewFile();
      }

      // write the content to the file
      // using try-with-resources to automatically close the file
      try (FileWriter fw = new FileWriter(fileName)) {
        fw.write(content);
      }
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
