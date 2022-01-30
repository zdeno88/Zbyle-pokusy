package w3resource_91_120;

import java.util.Arrays;

public class Ex113b {
    public static void main(String[] args) {
        int[]pole1=new int[8];
        pole1[0]=1;
        pole1[1]=2;
        pole1[2]=3;
        pole1[3]=4;
        int[]pole2={2,5,7,8};
        System.out.println("pole1="+ Arrays.toString(pole1));
        System.out.println("pole2="+ Arrays.toString(pole2));
        int n=4,m=4;
        int i=n-1,j=m-1,index=n+m+-1;
        while(i>=0&&j>=0){
            if(pole1[i]>pole2[j])
                    pole1[index--]=pole1[i--];
            else
                pole1[index--]=pole2[j--];
            }
        while(i>=0)
            pole1[index--]=pole1[i--];
        while(j>=0)
            pole1[index--]=pole2[j--];

        System.out.println("Srovnane pole="+Arrays.toString(pole1));
        }

    }

