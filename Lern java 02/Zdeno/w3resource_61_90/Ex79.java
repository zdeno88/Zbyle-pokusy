package w3resource_61_90;

import java.util.Arrays;

public class Ex79 {
    public static void main(String[] args) {
        int[] pole1={20,30,40};
        System.out.println("pole 1 ="+ Arrays.toString(pole1));
        int[] pole2={pole1[1],pole1[2],pole1[0]};
        System.out.println("pole 2 ="+ Arrays.toString(pole2));

    }
}
