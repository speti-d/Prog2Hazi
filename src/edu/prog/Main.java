package edu.prog;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            Inputer aha = new Inputer();
            int input = aha.takeInput();
            String[] myarr = Floyd.generateTriangle(input);
            Outputer.Write(myarr);

            System.out.println(Floyd.rightSum(input));
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
