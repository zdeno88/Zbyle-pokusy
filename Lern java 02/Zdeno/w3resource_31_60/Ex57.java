package w3resource_31_60;
import java.util.Scanner;
public class Ex57 {
    public static void main(String[] args) {
        Scanner Obj=new Scanner(System.in);
        System.out.println("Zadej cislo");
        int num1= Obj.nextInt();
        System.out.println("Pocet delitelnych cisel je:"+vyp(num1));
    }
    public static int vyp(int a){
        int pocet=0;
        for (int i=1;i<=(int)Math.sqrt(a);i++){
            if (a%i==0&&i*i!=a) {
                pocet+=2;
            }
                else if (i*i==a){
                    pocet++;
                }
        }
        return pocet;
    }
}
