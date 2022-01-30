package w3resource_91_120;

import java.util.Arrays;

public class Ex102 {
    public static void main(String[] args) {
        int a=0;
        int[] array_nums = {11, 10, 11, 13, 31, 45, 20, 33, 53};
        System.out.println("pole="+ Arrays.toString(array_nums));
        for (int i=0;i< array_nums.length;i++){
            if (array_nums[i]==10||array_nums[i]==30)
                a++;
        }
        System.out.println(a>0);

    }
}
