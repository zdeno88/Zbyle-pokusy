package w3resource_91_120;

import java.util.Arrays;

public class Ex107 {
    public static void main(String[] args) {
//        int[] array_nums = {11, 12, 13, 14, 45, 20};
        int[] array_nums = {11, 12,58, 13, 14, 45, 20};
        System.out.println("Pole="+ Arrays.toString(array_nums));
        int res=0;
        for (int i=0;i< array_nums.length-1;i++){
            if (array_nums[i]+1==array_nums[i+1]&&array_nums[i+1]+1==array_nums[i+2])
                res++;

        }
        System.out.println(res>0);
    }
}
