package w3resource_91_120;

import java.util.Arrays;

public class Ex113 {
    public static void main(String[] args) {
        int []pole1= {1,2,3,4};
        int[] pole2 = {2,5,7,8};
        int[] vys_pole=new int[pole1.length+pole2.length];
        System.out.println("pole1 = "+ Arrays.toString(pole1));
        System.out.println("pole2 = "+ Arrays.toString(pole2));
        int i= pole1.length-1;
        int j= pole2.length-1;
        int b=0;
        for (;i>0;i--){
            for (;j>=0;j--){
                vys_pole[b]=pole1[j];
                b++;
            }
            vys_pole[b]=pole2[i];
            b++;
        }
        Arrays.sort(vys_pole);




//        while (i>=0&&j>=0){
//            if (pole1[i]>pole2[j])
//                vys_pole[index]=pole1[i];
//            else
//                vys_pole[index]=pole2[j];
//            index--;
//            i--;
//            j--;
//        }
        System.out.println(Arrays.toString(vys_pole));


    }
}
