package FileIO;

import java.io.*;
import java.util.Scanner;

public class FileIOTest {

    public static void main(String[] args) {

        File file = new File("testFile.txt");

        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("Hi! This is a test file");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileReader fileReader = new FileReader("testFile.txt");
            Scanner scanner = new Scanner(fileReader);
            while(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        File myFile = new File("testFile.txt");
        if(myFile.delete()){
            System.out.println("File : " + file.getName() + " is deleted.");
        }else{
            System.out.println("File : " + file.getName() + " is not deleted.");
        }
    }
}
