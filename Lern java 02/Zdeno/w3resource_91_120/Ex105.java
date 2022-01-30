package w3resource_91_120;

import java.util.Arrays;

public class Ex105 {
    public static void main(String[] args) {
//        int[] array_nums = {11, 15, 13, 10, 45, 20, 11, 15};
        int[] array_nums = {11, 15, 13, 10, 10,24,365,57, 45, 20, 11, 15};
        System.out.println("Original pole="+ Arrays.toString(array_nums));
        int delka_testu=2;
        int start=0;
        int end= array_nums.length-delka_testu;
        int vys=0;
//        System.out.println(end);
        for (int i=0;i<delka_testu;i++) {
            if (array_nums[start] == array_nums[end]) {
                vys++;
            }
            start++;
            end++;
        }
        System.out.println(vys==2);

    }

}
