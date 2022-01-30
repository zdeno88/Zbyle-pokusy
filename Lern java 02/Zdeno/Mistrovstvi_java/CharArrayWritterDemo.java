package Mistrovstvi_java;

import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CharArrayWritterDemo {
    public static void main(String[] args) {
        CharArrayWriter f=new CharArrayWriter();
        String s="Toto by melo skoncit v poli";
        char buf[]=new char[s.length()];
        s.getChars(0,s.length(),buf,0);
        try{
            f.write(buf);
        }
        catch (IOException e){
            System.out.println("Chyba pri zapisu");
        }
        System.out.println("Buffer jako retezec");
        System.out.println(f.toString());
        System.out.println("Prevod na pole");
        char c[]=f.toCharArray();
        for (int i=0;i<c.length;i++){
            System.out.print(c[i]);
        }
        System.out.println("\nUlozit do souboru");
        try (FileWriter fw=new FileWriter("C:\\Users\\skaryd\\Desktop\\Mobil záloha\\JAVA\\soubor4.txt")){
            fw.write(s);
        }
        catch (IOException e){
            System.out.println("Chyba");
            return;
        }
        System.out.println("Reset");
        f.reset();
        for (int j=0;j<3;j++){
            f.write('X');

        }
        System.out.println(f.toString());


    }
}
