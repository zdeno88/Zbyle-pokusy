package w3resource_1_30;
import java.util.Scanner;
public class Ex23{
    public static void main(String[] args) {
        String hex_num="";
        char pole[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int hex;
        long mezi,dec=0,vysl=0,j=1;
        Scanner Obj=new Scanner(System.in);
        System.out.println("Zadej bin cislo:");
        long bin1= Obj.nextLong();
        while (bin1>0){
            mezi=bin1%10;
            dec=dec + mezi*j;
            j=j*2;
            bin1=bin1/10;
        }
//        System.out.println(dec);
        while(dec>0){
            hex=(int)dec%16;
            hex_num=pole[hex]+hex_num;
            dec=dec/16;
        }
        System.out.print("Vysledek je hex:\n"+hex_num);

    }
}