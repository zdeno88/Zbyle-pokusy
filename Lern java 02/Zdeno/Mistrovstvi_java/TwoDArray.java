package Mistrovstvi_java;

public class TwoDArray {
    public static void main(String[] args) {
        int i,j,k=0;
        int pole[][]=new int[4][5];

        for (i=0;i<4;i++){
            for (j=0;j<5;j++){
                pole[i][j]=k;
                k++;
            }
        }
        for (i=0;i<4;i++){
            for (j=0;j<5;j++){
                System.out.print(pole[i][j]+" ");
            }
            System.out.println();
        }
    }
}
