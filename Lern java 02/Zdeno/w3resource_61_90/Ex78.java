package w3resource_61_90;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex78 {
    public static void main(String[] args) {
        int[] array={5,7};
        System.out.println("Array ="+ Arrays.toString(array));
        if (array[0]==4||array[0]==7){
            System.out.println("true");
        }
        else
            System.out.println((array[array.length-1]==4 || array[array.length-1]==7));
    }
}
