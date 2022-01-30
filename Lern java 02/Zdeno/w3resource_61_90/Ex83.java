package w3resource_61_90;

import java.util.Arrays;

public class Ex83 {
    public static void main(String[] args) {
        int[] left_array = {1, 3, -5, 4};
        int[] right_array = {1, 4, -5, -2};
        String result="";
        System.out.println("prvni pole="+ Arrays.toString(left_array));
        System.out.println("druhe pole="+ Arrays.toString(right_array));
        for (int i=0;i<left_array.length;i++){
            int num1 = left_array[i];
            int num2 = right_array[i];
            result+=Integer.toString(num1*num2)+ " ";
        }
        System.out.println("Vysledek nasobeni:"+result);

    }
}
