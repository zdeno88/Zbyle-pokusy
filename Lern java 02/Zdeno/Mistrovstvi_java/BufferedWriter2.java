package Mistrovstvi_java;
import java.io.*;
public class BufferedWriter2 {
    public static void main(String[] args) {
        try {
            BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Users\\skaryd\\Desktop\\Test.txt"));
            bw.write("Karel\n");
            bw.write("Jan\n");
            bw.write("Vit\n");
            bw.write("Josef");
            bw.close();

        }
        catch (Exception e){
            System.out.println("Vyjimka");
        }

    }
}
