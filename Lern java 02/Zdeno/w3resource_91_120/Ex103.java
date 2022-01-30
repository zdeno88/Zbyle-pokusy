package w3resource_91_120;

import java.util.Arrays;

public class Ex103 {
    public static void main(String[] args) {
//        int[] array_nums = {11, 10, 13, 10, 45, 20, 33, 53};
        int[] array_nums = {10, 53, 68, 11, 10, 13, 10, 45, 20, 33, 53, 98, 53, 20};
        System.out.println("puvodni pole="+ Arrays.toString(array_nums));
        int a= array_nums.length-1;
        int b=0;
        //        System.out.println(a);
        while(array_nums[a] != 10) {
            a--;
        }
        int []array_nums1=new int[array_nums.length-a-1];
//        System.out.println(a);
        for (int i=a+1;i< array_nums.length;i++){
            array_nums1[b]=array_nums[i];
            b++;
        }
        System.out.println("nove pole="+Arrays.toString(array_nums1));


    }
}
