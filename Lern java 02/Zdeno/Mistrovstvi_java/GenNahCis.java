package Mistrovstvi_java;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class GenNahCis {
    public static void main(String[] args) throws IOException {
        Random ram=new Random();
        try (BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Users\\skaryd\\Desktop\\nahodnacisla.txt"));){
            for (int i=0;i<1000;i++) {
                int cislo = ram.nextInt(100);
                bw.write(cislo+"");
            }
            System.out.println("Program ukoncen");
        }

    }

}
