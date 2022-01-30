package w3resource_91_120;

import java.util.Arrays;

public class Ex95 {
    public static void main(String[] args) {
        int a=5;
        String[]pole=new String[a];
        for (int i=0;i< pole.length;i++){
            pole[i]=String.valueOf(i);
        }
        System.out.println("pole="+ Arrays.toString(pole));
    }
}
