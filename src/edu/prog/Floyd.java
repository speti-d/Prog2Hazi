package edu.prog;

public class Floyd {

    public static String[] generateTriangle(int N){
//        Visszatér egy sztring tömbbel, melyben az elemek a floyd 3szög egyes sorai
        int currentNum = 1;
        String[] result = new String[N];
        for (int line = 0; line < N; line++){
            String currentLine = "";
            for (int num = 0; num < line; num++) {
                currentLine = currentLine + " " + currentNum;
                currentNum++;
            }
            result[line] = currentLine;
        }
        return result ;
    }

    public static int rightSum(int N){
        int currentNum = 0;
        int result = 0;
        for (int line = 0; line < N; line++){
            for (int num = 0; num < line; num++) {
                currentNum++;
            }
            result += currentNum;
        }
        return result;
    }

}
