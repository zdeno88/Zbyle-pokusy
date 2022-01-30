package Mistrovstvi_java;

import java.util.Comparator;
import java.util.TreeSet;

class Myomp implements Comparator<String> {
String a,b;
    @Override
    public int compare(String o1, String o2) {
        a=o1;
        b=o2;

        return o2.compareTo(o1);
    }
}
class CompDemo{
    public static void main(String[] args) {
        TreeSet<String> ts=new TreeSet<>(new Myomp());

        ts.add("C");
        ts.add("F");
        ts.add("E");
        ts.add("D");
        ts.add("B");
        ts.add("A");

        for (String a:ts) {
            System.out.print(a+" ");
        }


    }
}
