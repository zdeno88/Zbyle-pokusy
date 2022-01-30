package w3resource_91_120;

import java.util.Arrays;

public class Ex100 {
    public static void main(String[] args) {
        int[] array_nums1 = {10, 11, 10, 20, 43, 20, 50};
        int[] array_nums2 = {10, 13, 11, 20, 44, 30, 50};
        int a=0;
        System.out.println("pole1="+ Arrays.toString(array_nums1));
        System.out.println("pole2="+ Arrays.toString(array_nums2));
        for (int i=0;i< array_nums1.length;i++){
            if (Math.abs(array_nums1[i]-array_nums2[i])<=1&&array_nums1[i]!=array_nums2[i])
                a++;
        }
        System.out.println("Vysledek je:"+a);

    }
}
