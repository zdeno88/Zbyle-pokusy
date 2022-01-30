package w3resource_61_90;

import java.util.Arrays;

public class Ex82 {
    public static void main(String[] args) {
        int[]pole={70,30,40,90,67};
        int x=pole[0];
        System.out.println("pole="+ Arrays.toString(pole));
        for (int i=0;i<pole.length;i++){
            if(x<pole[i]){
                x=pole[i];
            }
        }
        System.out.println("Nejvetsi prvek pole je:"+x);
    }

}
