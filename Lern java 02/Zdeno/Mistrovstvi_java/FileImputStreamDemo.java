package Mistrovstvi_java;

import java.io.*;

public class FileImputStreamDemo {
    public static void main(String[] args) throws IOException {
        int size;
        try (FileInputStream f=new FileInputStream("C:\\Users\\skaryd\\Desktop\\nahodnacisla.txt")){

            System.out.println("Celkem bajtu ke stejni je: "+(size=f.available()));
            int n=40;
            System.out.println("Prvnich "+n+" bajtu souboru nacitano metodou read po jednom");
            for (int i=0;i<n;i++){
                System.out.print((char)f.read());
            }
            System.out.println("\nZbyva bajtu pro cteni: "+(size=f.available()));
            System.out.println("Cteni nasledujicich "+n+" bajtu zavolanim metody read(b[])");
            byte b[]=new byte[n];
            if (f.read(b)!=n){
                System.out.println("Nebylo mozne nacist "+n+" bajtu");
            }
            System.out.print(new String(b,0,n));
            System.out.println("\nZbyva bajtu pro cteni: "+(size=f.available()));
            System.out.println("Preskoceni poloviny bajtu metodou skip");
            f.skip(size/2);
            System.out.println("Zbyva bajtu pro cteni: "+(size=f.available()));
            if (f.read(b,n/2,n/2)!=n/2){
                System.out.println("Nebylo mozne nacist "+n/2+" bajtu");
            }
            System.out.println(new String(b,n/2,n/2));
            System.out.println("Zbyva bajtu pro cteni: "+(size=f.available()));

        }
    }
}
