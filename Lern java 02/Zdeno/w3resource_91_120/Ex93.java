package w3resource_91_120;

import java.util.Arrays;

public class Ex93 {
    public static void main(String[] args) {
//        int[] nums = {10, 10, 2, 4, 9};
        int[] nums = {10, 10, 2, 4, 20, 20};
        boolean c1010=false;
        boolean c2020=false;
        System.out.println("pole = "+ Arrays.toString(nums));
        for (int i=0;i< nums.length-1;i++){
            if (nums[i]==10&&nums[i+1]==10)
                c1010=true;
            if (nums[i]==20&&nums[i+1]==20)
                c2020=true;
        }
        System.out.println(String.valueOf(c1010!=c2020));
    }
}
