package w3resource_91_120;

import java.util.Arrays;

public class Ex94a {
    public static void main(String[] args) {
        int j = 0;
        int[] pole = {1, 7, 8, 5, 7, 13, 0, 2, 4, 9};
        int[] pole1 = new int[10];
        System.out.println("pole=" + Arrays.toString(pole));

        for (int i = 0; i < pole.length; i++) {
            if (pole[i] % 2 != 0) {
                pole1[j] = pole[i];
                j++;
            }
        }
        for (int a = 0; a < pole.length; a++) {
                if (pole[a] % 2 == 0) {
                    pole1[j] = pole[a];
                    j++;
                }

            }
            System.out.println("pole1=" + Arrays.toString(pole1));

        }
    }

