package Mistrovstvi_java;

public class ForEach {
    public static void main(String[] args) {
        int num []={1,2,3,4,5,6,7,8,9,10};
        int sum=0;
        for (int x:num){
            sum+=x;
            System.out.println("Hodnota x je: "+x);
        }
        System.out.println("Hodnota sum je: "+sum);
    }
}
