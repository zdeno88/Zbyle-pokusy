package Mistrovstvi_java;

import java.io.*;
import java.util.Scanner;

public class FilAnal {
    public static void main(String[] args) throws IOException {
//        BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Users\\skaryd\\Desktop\\soub.txt"));
        FileWriter fw=new FileWriter("C:\\Users\\skaryd\\Desktop\\soub.txt");
        fw.write("Testovani trid scanner 1 2 3,2 true false jedna dve");
        fw.close();
//        BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\skaryd\\Desktop\\soub.txt"));
        FileReader fr=new FileReader("C:\\Users\\skaryd\\Desktop\\soub.txt");
        Scanner sc=new Scanner(fr);
        while (sc.hasNext()){
            if(sc.hasNextInt()) {
                System.out.println("Int: " + sc.nextInt());
            }
            else if(sc.hasNextDouble()) {
                System.out.println("Double: " + sc.nextDouble());
            }
                else if(sc.hasNextBoolean()) {
                    System.out.println("Boolean: "+sc.nextBoolean());
                } else {
                    System.out.println("String: "+sc.next());
                }
        }
        fr.close();

    }
}
