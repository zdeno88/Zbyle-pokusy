package w3resource_61_90;

import java.util.Arrays;

public class Ex80 {
    public static void main(String[] args) {
        int[] pole={50,30,50};
        System.out.println("pole ="+ Arrays.toString(pole));
        if (pole[0]> pole[pole.length-1])
            System.out.println(pole[0]);
        else if (pole[0] < pole[pole.length-1])
            System.out.println(pole[pole.length-1]);
        else
            System.out.println(pole[0]+"="+pole[pole.length-1]);
    }
}
