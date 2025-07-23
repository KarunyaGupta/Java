import java.io.*;
import java.util.*;

public class fileHandling {
    public static void main(String[] args) {
        String fileName = "test.txt"; // Change this to your file path
        
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);
            
            int characterCount = 0;
            int wordCount = 0;
            
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                characterCount += line.length();
                
                // Split line into words and count them
                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }
            }
            
            scanner.close();
            
            System.out.println("File: " + fileName);
            System.out.println("Character count: " + characterCount);
            System.out.println("Word count: " + wordCount);
            
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
            System.out.println("Please make sure the file exists in the current directory.");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
