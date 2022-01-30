package w3resource_91_120;

import java.util.Arrays;

public class Ex92 {
    public static void main(String[] args) {
        int[] nums = {5, 7, 2, 4, 9};
        int liche=0,sude=0,pocetl=0,pocets=0;
        System.out.println("pole ="+ Arrays.toString(nums));
        for (int i=0;i< nums.length;i++){
            if (nums[i]%2==0) {
                sude += nums[i];
                pocets++;
            }
            else {
                liche += nums[i];
                pocetl++;
            }
        }
        System.out.println("pocet sudych:"+pocets+" soucet:"+sude);
        System.out.println("pocet lichych:"+pocetl+" soucet:"+liche);
    }
}
