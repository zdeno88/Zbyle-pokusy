package Mistrovstvi_java;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String,Double> hm=new HashMap<String,Double>();
        hm.put("Frantisek Kremile", 33.55);
        hm.put("Josef Vochomurka", 864.56);
        hm.put("Motyl Emanuel", 87925.15);
        hm.put("Feeda Mravenec", -257.15);
        hm.put("Brouk Pytlik", 100025.00);

        Set<Map.Entry<String,Double>> set=hm.entrySet();

        for (Map.Entry<String,Double> me:set) {
            System.out.println(me.getKey()+": "+me.getValue());
        }
        double hodnota=hm.get("Feeda Mravenec");
        hm.put("Feeda Mravenec",hodnota+1000);
        System.out.println("Nova hodnota Feeda Mravenec: "+hm.get("Feeda Mravenec"));

    }
}
