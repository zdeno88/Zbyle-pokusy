package Eugeto;

import java.util.HashMap;
import java.util.Map;

public class CviceniMap {
    public static void main(String[] args) {
        Map<Integer,String> maps=new HashMap<>();
        maps.put(1, "Vít");
        maps.put(2, "Jana");
        maps.put(3, "Karel");
        maps.put(4, "Klára");
        maps.put(5, "Jana");
        maps.put(1989, "Václav");
        maps.put(6, "Ivan");

        maps.forEach((number,name)-> {System.out.println(name+" ("+number+")");});
        System.out.println(maps.size());
        System.out.println(maps.get(4));
        maps.remove(4);
        System.out.println(maps.get(4));
        maps.remove(maps.containsValue("Karel"));
        System.out.println(maps.get(3)+"\n"+maps.get(5));
        System.out.println(maps.containsValue("Ivan")+"\n"+maps.containsValue("Václav"));
        maps.forEach((number,name)->{
            System.out.println(name+" ("+number+")");
        });

    }
}
