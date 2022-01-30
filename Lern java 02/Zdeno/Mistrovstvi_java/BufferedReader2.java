package Mistrovstvi_java;
import java.io.*;
public class BufferedReader2 {
    public static void main(String[] args) {
        String s;
       try {
           BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Users\\skaryd\\Desktop\\Test-copy.txt"));
           BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\skaryd\\Desktop\\Test.txt"));
           while ((s=(br.readLine()))!=null){
               System.out.println(s);
               bw.write(s+"\n");
           }
           bw.close();
           br.close();
       }
       catch (Exception e){
           System.out.println("Vyjimka");
       }
    }
}
