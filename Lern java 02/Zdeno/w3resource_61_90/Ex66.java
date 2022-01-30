package w3resource_61_90;
public class Ex66 {
    public static void main(String[] args) {
        int num1=0;
        int sum=1;
        int ctr=0;
        while (ctr<100){
            num1++;
            if(num1%2!=0)
                if (vypocet(num1)){
                sum+=num1;
            }
            ctr++;
        }
        System.out.println("Vysledek je:" +sum);
    }
    public static boolean vypocet(int x){
        for (int i=3;i*i<=x;i+=2){
            if (x%i==0){
                return false;
            }
        }
        return true;

    }
}
