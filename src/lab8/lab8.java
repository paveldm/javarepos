package lab8;

import java.io.*;
import java.util.Scanner;

public class lab8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        try(FileWriter writer = new FileWriter("lab8.txt", false)) {
            writer.write(text);
            writer.flush();
        }
        catch(IOException ex) {

            System.out.println(ex.getMessage());
        }
        try(FileReader reader = new FileReader("lab8.txt")) {
            int c;
            while((c=reader.read())!=-1){

                System.out.print((char)c);
            }
        }
        catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}