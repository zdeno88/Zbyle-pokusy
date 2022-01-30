package Eugeto;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SviceniSet {
    public static void main(String[] args) {
        Set<String> mnozina=new HashSet<>();
        Collections.addAll(mnozina,new String[]{"Vít", "Jana", "Karel", "Klára", "Jana"});
        mnozina.forEach((jmeno)-> {System.out.print(jmeno+", ");});
        System.out.println();
        System.out.println(mnozina.size());
        System.out.println(mnozina.contains("Jana"));
        mnozina.remove("Jana");
        System.out.println(mnozina.contains("Jana"));
        System.out.println(mnozina.size());

    }
}
