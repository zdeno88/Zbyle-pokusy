package w3resource_91_120;
import java.util.Scanner;
public class Ex117 {
    public static void main(String[] args) {
        int num;
        Scanner Obj=new Scanner(System.in);
        System.out.println("Zadej cislo:");
        int n= Obj.nextInt();
        System.out.printf("Odmocnina cisla %d je:",n);
        System.out.println(sqrt(n));
    }
    public static int sqrt(int num){
        if (num == 0 || num == 1) {
            return num;
        }
        int a = 0;
        int b = num;
        while (a <= b) {
            int mid = (a + b) >> 1;
            if (num / mid < mid) {
                b = mid - 1;
            } else {
                if (num / (mid + 1) <= mid) {
                    return mid;
                }
                a = mid + 1;
            }
        }
        return a;
    }
}
