package w3resource_91_120;

import java.util.Arrays;

public class Ex104 {
    public static void main(String[] args) {
        int[] array_nums = {11, 15, 13, 10, 45, 20, 33, 53};
        System.out.println("Puvodni pole="+ Arrays.toString(array_nums));
        int a= array_nums.length-1;

        while(array_nums[a]!=10){
            a--;
        }
//        System.out.println(a);
        int[] array_nums1=new int[a];
        for (int i=0;i<a;i++){
            array_nums1[i]=array_nums[i];
        }
        System.out.println("Nove pole="+Arrays.toString(array_nums1));
    }
}
