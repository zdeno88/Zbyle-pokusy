package w3resource_31_60;
import java.util.Scanner;
public class Ex49 {
    public static void main(String[] args) {
        Scanner Obj=new Scanner(System.in);
        System.out.println("Zadej cislo:");
        int cislo= Obj.nextInt();
        if (cislo%2==0){
            System.out.println("Cislo je sude: 1");
        }
        else{
            System.out.println("Cislo je liche: 0");
        }
    }
}
