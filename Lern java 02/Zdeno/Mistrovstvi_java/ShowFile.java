package Mistrovstvi_java;

//java ShowFile Vstup.txt
import java.io.*;
public class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin;

        if (args.length!=1){
            System.out.println("Pouziti: ShowFile Vstup");
            return;
        }
        try {
            fin=new FileInputStream("C:\\Users\\skaryd\\Desktop\\Vstup.txt");
        }
        catch (FileNotFoundException e) {
            System.out.println("Soubor nelze najit");
            return;
        }
        try {
            do {
                i= fin.read();
                if (i!=-1)
                    System.out.println((char)i);
            }
            while (i!=-1);
        }
        catch (IOException e){
    System.out.println("Chyba pri cteni souboru");
}
        try {
            fin.close();
        }
        catch (IOException e){
            System.out.println("Chyba pri zavirani");
        }
    }

}
