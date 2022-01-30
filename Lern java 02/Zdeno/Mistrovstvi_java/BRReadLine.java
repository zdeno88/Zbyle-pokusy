package Mistrovstvi_java;
import java.io.*;
public class BRReadLine {
    public static void main(String[] args) throws IOException{
        String str;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Zadej radky textu");
        System.out.println("Program ukoncite slovem'stop'");
        do {
            str= br.readLine();
            System.out.println(str);
        }
        while (!str.equals("stop")) ;{
            System.out.println("Program ukoncen");
        }
    }
}
