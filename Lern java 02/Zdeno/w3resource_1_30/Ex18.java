package w3resource_1_30;
import java.util.Scanner;
public class Ex18 {
    public static void main(String[] args) {

        long bin1,bin2,mez,factor=1;
        long nas=0;
        Scanner Obj=new Scanner(System.in);
        System.out.println("Zadej prvni bin cislo:");
        bin1=Obj.nextLong();
        System.out.println("Zadej druhe bin cislo:");
        bin2=Obj.nextLong();
        while (bin2>0){
            mez=bin2%10;
            if (mez==1){
                bin1=bin1*factor;
                nas=soucetbin((int) bin1,(int) nas);
            }
            else {
                bin1=bin1*factor;
            }
            factor=10;
            bin2=bin2/10;

        }
        System.out.println("Vysledek je:"+nas);



        }
        static int soucetbin(int bin1,int bin2)
        {
            int[]sum=new int[100];
            int i=0,rem=0,vysl_souc=0;
            while (bin1>0||bin2>0){

                sum[i++]=(bin1%10+bin2%10+rem)%2;
                rem=(bin1%10+bin2%10+rem)/2;
                bin1=bin1/10;
                bin2=bin2/10;

            }
            if (rem==1){
                sum[i++]=rem;
            }
            --i;
            while (i>=0){
                vysl_souc=vysl_souc*10+sum[i--];
            }
        return vysl_souc;


    }
    }
