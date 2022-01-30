package Mistrovstvi_java;
import java.io.*;
public class BufferedWriter1 {
    public static void main(String[] args) {
        try {
            BufferedWriter br=new BufferedWriter(
                    new FileWriter("C:\\Users\\skaryd\\Desktop\\Vstup.txt"));
            br.write("Karel\n");
            br.write("Mirek\n");
            br.write("Matous");
            br.close();
        }
        catch (Exception ex){
            System.out.println("Vyjimka");
        }

    }
}
