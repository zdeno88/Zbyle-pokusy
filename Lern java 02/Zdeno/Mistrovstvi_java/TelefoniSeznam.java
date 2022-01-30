package Mistrovstvi_java;

import java.io.*;
import java.util.*;

public class TelefoniSeznam {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        String a,b="quit",c;
        double d;
        TreeMap<String,Double> tm=new TreeMap<>();
//        FileWriter bw=new FileWriter("C:\\Users\\skaryd\\Desktop\\TelSeznam.txt");
////        do {
////            System.out.println("Zadej jmena do seznamu a ukonci quit");
////            a=sc.nextLine();
////            if (!b.equals(a))
////            bw.write(a+"\n");
////        }
////        while (!b.equals(a));
////            bw.close();
        BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\skaryd\\Desktop\\TelSeznam.txt"));

        while ((c=br.readLine())!=null){
            System.out.println("Zadej zustatek pro "+c);
            d= sc.nextDouble();
            tm.put(c,d);
        }
        br.close();
        Set<Map.Entry<String,Double>>set=tm.entrySet();
        for (Map.Entry<String,Double> element:set) {
            if ("jan".equals(element.getKey())) {
                System.out.println("Zustatek osoby " + element.getKey() + " je " + element.getValue());
            }

        }

    }
}
