package Mistrovstvi_java;
import java.util.*;
public class TreeMapDemo2 {
    public static void main(String[] args) {
        TreeMap<String,Double> tm=new TreeMap<>(new TComp());
        tm.put("Makova panenka",-1000.00);
        tm.put("Frantisek Kremile", 33.55);
        tm.put("Zdenek Vochomurka", -2.00);
        tm.put("Josef Vochomurka", 864.56);
        tm.put("Motyl Emanuel", 87925.15);
        tm.put("Feeda Mravenec", -257.15);
        tm.put("Brouk Pytlik", 100025.00);
        Set<Map.Entry<String,Double>> set=tm.entrySet();
        for (Map.Entry<String, Double> element:set) {
            System.out.println("Zustatek "+element.getKey()+" je "+element.getValue());
        }
        System.out.println("Navyseni Makova panenka o 2000");
        Double hodnota=tm.get("Makova panenka");
        tm.put("Makova panenka",hodnota+2000);
        System.out.println("Zustatek Makova panenka je "+tm.get("Makova panenka"));
    }
}
class TComp implements Comparator<String>{
    String a,b;
    int i,j,k;
    @Override
    public int compare(String o1, String o2) {
        a=o1;
        b=o2;
        i=a.indexOf(" ");
        j=b.indexOf(" ");
        k=a.substring(i).compareTo(b.substring(j));
        if (k==0){
            return a.compareTo(b);
        }
        return k;
    }
}
