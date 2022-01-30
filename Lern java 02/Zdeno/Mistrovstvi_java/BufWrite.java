package Mistrovstvi_java;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufWrite {
    public static void main(String[] args) {
        try {
            BufferedWriter bw=new BufferedWriter(
                    new FileWriter("C:\\Users\\skaryd\\Desktop\\Jmena.txt"));
            bw.write("Karel\n");
            bw.write("Mirek\n");
            bw.write("Jan");
            bw.close();
        }
        catch (Exception e){
            System.out.println("Vyjimka");
        }

    }
}
