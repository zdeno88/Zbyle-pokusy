package Mistrovstvi_java;
import java.util.*;
public class InteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> als=new ArrayList<String>();
        als.add("A");
        als.add("C");
        als.add("G");
        als.add("D");
        als.add("Q");
        als.add("B");
        System.out.print("Puvodni seznam pole: ");
        Iterator<String> intr= als.iterator();
        while (intr.hasNext()){
            String element= intr.next();
            System.out.print(element+" ");
        }
        System.out.println();

        intr= als.iterator();
        System.out.print("Upraveny obsah pole: ");
        while (intr.hasNext()){
            String element= intr.next();
            System.out.print(element+"+ ");
        }
        System.out.println();

        ListIterator<String> litr= als.listIterator();
        while (litr.hasNext()){
            String element= litr.next();
            litr.set(element+"");
        }
        System.out.print("Upraveny seznam pozpatku: ");
        while (litr.hasPrevious()){
            String element= litr.previous();
            System.out.print(element+"+ ");
        }

    }
}
