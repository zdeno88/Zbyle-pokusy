package Mistrovstvi_java;
import java.io.*;
public class BufferedReader1 {
    public static void main(String[] args) {
        String s;
        try {
//            BufferedWriter bw=new BufferedWriter(
//                    new FileWriter("C:\\Users\\skaryd\\Desktop\\Vstup.txt"));
            BufferedReader br=new BufferedReader(
                    new FileReader("C:\\Users\\skaryd\\Desktop\\Vstup-copy.txt"));

            while ((s=br.readLine())!=null){
                System.out.println(s);
//                bw.write(s+"\n");
            }
            br.close();
//            bw.close();
        }
        catch (Exception ex){
            System.out.println("Vyjimka");
        }

    }
}
