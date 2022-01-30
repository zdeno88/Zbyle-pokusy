package Mistrovstvi_java;

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> a1=new ArrayList<String>();
        System.out.println("Pocatecni velikost pole A1 je:"+a1.size());
        a1.add("C");
        a1.add("A");
        a1.add("B");
        a1.add("F");
        a1.add("D");
        a1.add("D");
        a1.add(1,"A1");
        System.out.println("Pocet prvku po pridani v poli A1 je:"+a1.size());
        System.out.println("Obsah pole= "+a1);
        a1.remove("D");
        a1.remove(1);
        System.out.println("Pocet prvku po odebrani: "+a1.size());
        System.out.println("Obsah pole= "+a1);
    }
}
