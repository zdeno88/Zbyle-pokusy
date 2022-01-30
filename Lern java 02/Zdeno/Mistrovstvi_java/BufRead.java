package Mistrovstvi_java;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufRead {
    public static void main(String[] args) {
        String s;
        try {
            BufferedReader br=new BufferedReader(
                    new FileReader("C:\\Users\\skaryd\\Desktop\\Jmena.txt"));

            while ((s=br.readLine())!=null) {
                System.out.println(s);
            }
            br.close();
        }
        catch (Exception e){
            System.out.println("Vyjimka");
        }
    }
}
