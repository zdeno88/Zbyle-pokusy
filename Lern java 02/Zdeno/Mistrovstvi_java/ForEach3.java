package Mistrovstvi_java;
//import java.util.Random;
public class ForEach3 {
    public static void main(String[] args) {
        int []pole=new int[10];
        int sum=0;
//        Random ob=new Random();
        for (int i=0;i<10;i++){
            pole[i]= (int)(Math.random()*100);
            }
        for (int x:pole) {
            sum+=x;
            System.out.println("Hodnota je: "+x);
        }
        System.out.println("Soucet pole je: "+sum);
    }
}
