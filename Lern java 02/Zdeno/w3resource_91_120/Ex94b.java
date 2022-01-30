package w3resource_91_120;

import java.util.Arrays;

public class Ex94b {
    public static void main(String[] args) {
        int[] pole = {1, 7, 8, 5, 7, 13, 0, 2, 4, 9};
        System.out.println("pole="+ Arrays.toString(pole));
        int i=0;
        while (i< pole.length&&pole[i]%2==0){
            i++;
        }
        for(int j = i + 1; j < pole.length; j++) {
            if(pole[j] % 2 != 0) {
                int temp = pole[i];
                pole[i] = pole[j];
                pole[j] = temp;
                i++;
            }
        }
        System.out.println("pole="+ Arrays.toString(pole));

    }
}
