package com.collection;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {
        PrintWriter printWriter = new PrintWriter ("random.txt");
        Random random = new Random();
        int[][] tab = new int [16][1000];
        for (int i=0; i<16 ; i++){
            for (int j=0; j<1000; j++){
                int drawNumber = random.nextInt(1000000);
                tab[i][j]=drawNumber;
                printWriter.print(String.format ("%d", tab[i][j])+ " ");
            }
            printWriter.println(" ");
        }
        printWriter.close ();
    }
}
