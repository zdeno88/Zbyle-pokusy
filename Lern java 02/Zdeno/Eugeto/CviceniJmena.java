package Eugeto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CviceniJmena {
    public static void main(String[] args) {
        List<String> jmena=new ArrayList<>();
        Collections.addAll(jmena,new String[]{"Vít", "Jana", "Karel", "Edita", "Jana"});
        System.out.println(jmena);
        System.out.println(jmena.size());
        System.out.println(jmena.get(2));
        jmena.remove(1);
        jmena.remove("Jana");
        System.out.println(jmena.contains("Ivan"));
        System.out.println(jmena.contains("Vít"));
        System.out.println(jmena.size());
        System.out.println(jmena.get(2));

    }
}
