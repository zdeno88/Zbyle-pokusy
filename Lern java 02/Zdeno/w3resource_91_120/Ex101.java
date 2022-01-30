package w3resource_91_120;

import java.util.Arrays;

public class Ex101 {
    public static void main(String[] args) {
        int[] array_nums = {10, 11, 10, 30, 45, 20, 33, 53};
        int a=0,b=0;
        System.out.println("pole="+ Arrays.toString(array_nums));
        for (int i=0;i< array_nums.length;i++){
            if (array_nums[i]==10)
                a++;
            if (array_nums[i]==20)
                b++;
        }
        System.out.println("Pocet 10>20: "+(a>b));

    }
}
