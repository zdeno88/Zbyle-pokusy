package Mistrovstvi_java;

import java.util.Arrays;
import java.util.Random;

public class SazkaDemo {
    public static void main(String[] args) {
        Random ram=new Random();
        int pole[]=new int[6];
        for (int i=0;i<6;) {
            int cislo = ram.nextInt(100);
            if (cislo>0&&cislo<50) {
                pole[i]=cislo;
                i++;
            }
        }
        System.out.println(Arrays.toString(pole));
        StringBuilder st=new StringBuilder();
        st.append("");
        for (int j=0;j< pole.length ;j++) {
            st.append(pole[j]);
            if(j==pole.length-1)
                st.append("");
            else
            st.append(", ");
            }
        System.out.println(st);

    }
}
