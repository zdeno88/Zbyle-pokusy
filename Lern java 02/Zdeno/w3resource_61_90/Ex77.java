package w3resource_61_90;

import java.util.Arrays;

public class Ex77 {
    public static void main(String[] args) {
        int[] array1={50,-20,0};
        int[] array2={5,-50,10};
        int[] array3={array1[0],array2[array2.length-1]};
        System.out.println("array1="+ Arrays.toString(array1));
        System.out.println("array2="+ Arrays.toString(array2));
        System.out.println("array3=" + Arrays.toString(array3));
    }
}
