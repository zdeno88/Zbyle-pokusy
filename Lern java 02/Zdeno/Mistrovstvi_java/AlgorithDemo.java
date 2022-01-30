package Mistrovstvi_java;

import java.util.*;

public class AlgorithDemo {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<Integer>();
        ll.add(20);
        ll.add(-8);
        ll.add(-20);
        ll.add(8);
        Collections.sort(ll);
        System.out.println("Prirozene razeni:");
        for (Integer a:ll) {
            System.out.print(a+" ");
        }
        System.out.println();

        Comparator<Integer> cc=Collections.reverseOrder();
        Collections.sort(ll,cc);
        System.out.println("Zmena razeni:");
        for (Integer a:ll) {
            System.out.print(a+" ");
        }

        System.out.println();
        Collections.shuffle(ll);
        System.out.println("Nahodne razeni:");
        for (Integer a:ll) {
            System.out.print(a+" ");
        }
        System.out.println();
        System.out.println("Maximalni hodnota je: "+Collections.max(ll));
        System.out.println("Minimalni hodnota je: "+Collections.min(ll));

    }
}
