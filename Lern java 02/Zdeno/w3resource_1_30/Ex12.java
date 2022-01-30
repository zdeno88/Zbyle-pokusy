package w3resource_1_30;
import java.util.Scanner;
public class Ex12 {
    public static void main(String[] args) {
//        Scanner Obj = new Scanner(System.in);
//        System.out.println("Zadej prvni cislo: ");
//        int num1= Obj.nextInt();
//        System.out.println("Zadej druhe cislo: ");
//        int num2= Obj.nextInt();
//        System.out.println("Zadej treti cislo: ");
//        int num3= Obj.nextInt();
//        double prum=(num1+num2+num3)/3;
//        System.out.println("prumer je:"+prum);

        double num=0;
        double x=1;
        Scanner Obj=new Scanner(System.in);
        System.out.println("Vloz pocet cisel, ze kterych udelam prumer");
        int pocet= Obj.nextInt();
        while (pocet>=x){
            System.out.println("Vloz cislo" +x);
            num+= Obj.nextInt();
            x+=1;
        }
        double prum=num/pocet;
        System.out.println(prum);

    }
}