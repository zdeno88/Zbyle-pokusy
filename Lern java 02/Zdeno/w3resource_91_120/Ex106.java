package w3resource_91_120;

import java.util.Arrays;

public class Ex106 {
    public static void main(String[] args) {
        int[] array_nums = {11, 15, 13, 10, 45, 20};
        int num=array_nums[0];
        System.out.println("Original pole="+ Arrays.toString(array_nums));
        if (array_nums.length>1){

            for (int i=1;i< array_nums.length;i++){
                array_nums[i-1]=array_nums[i];
            }
            array_nums[array_nums.length-1]=num;
        }
        System.out.println("Pole="+Arrays.toString(array_nums));
    }
}
