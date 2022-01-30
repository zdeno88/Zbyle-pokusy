package Mistrovstvi_java;

import java.util.*;

public class ArrayListtoArray {
    public static void main(String[] args) {
        ArrayList<Integer> a1=new ArrayList<Integer>();
        int sum=0;
        a1.add(1);
        a1.add(2);
        a1.add(3);
        a1.add(4);
        System.out.println("Obsah pole= "+a1);
        Integer ai[]=new Integer[a1.size()];
        ai=a1.toArray(ai);
        for (int x:ai) {
            sum+=x;
            }
        System.out.println("Soucet pole je: "+sum);
    }
}
