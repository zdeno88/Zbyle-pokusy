package w3resource_61_90;

import java.util.Arrays;

public class Ex81 {
    public static void main(String[] args) {
        int[] pole={20,30,40};
        System.out.println("pole ="+ Arrays.toString(pole));
        int x=pole[0];
        pole[0]=pole[pole.length-1];
        pole[pole.length-1]=x;
        System.out.println("Prohozene pole="+Arrays.toString(pole));
    }
}
