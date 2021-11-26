package edu.prog;


import java.io.FileWriter;
import java.io.IOException;

public class Outputer {

    public static void Write(String[] myarr){
        try {
            FileWriter outfile = new FileWriter("Floyd.txt");
            for (String line :
                    myarr) {
                System.out.println(line);
                outfile.write(line + "\n");
            }
            outfile.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}
