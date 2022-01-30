package Mistrovstvi_java;

import java.util.*;

public class ArraysDemo {
    public static void main(String[] args) {
        int array[]=new int[10];
        for (int i=0;i<10;i++){
            array[i]=i*-3;
        }
        System.out.println("Puvodni obsah pole je: "+Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Obsah pole po pouziti sort je: "+Arrays.toString(array));
        Arrays.fill(array,2,6,-1);
        System.out.println("Obsah pole po pouziti fill je: "+Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Obsah pole po opetovnem pouziti sort je: "+Arrays.toString(array));
        System.out.println("Hodnota -9 je na pozici: "+Arrays.binarySearch(array,-9));

    }
}
