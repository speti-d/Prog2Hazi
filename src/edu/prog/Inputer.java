package edu.prog;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Inputer {
    public BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public int takeInput() throws IOException {
        Integer result = Integer.parseInt(this.reader.readLine());
        if (result < 1) {
            throw new IOException();
        }
        return result;
    }

}
