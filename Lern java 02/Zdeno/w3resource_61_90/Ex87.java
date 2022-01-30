package w3resource_61_90;
import java.io.*;
public class Ex87 {
    public static void main(String[] args) {
        System.out.println("Zadej cislo: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int sum=0;
            String str = br.readLine();
            char[] pole=str.toCharArray();
            for (int i=0;i< pole.length;i++){
                sum+=pole[i] - '0';
            }
            System.out.println("Soucet cisel je:"+sum);
//            System.out.println(str);
            number(sum);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void number(int n){
       int x,y,z;
       String[] cisla={"nula","jedna","dva","tri","ctyri","pet","sest","sedm","osm","devet"};
       if (n<10){
           System.out.println("Vysledek je:"+cisla[n]);
       }
       else if (n<100){
           x=n%10;
           y=n/10;
           System.out.println("Vysledek je:"+cisla[y]+", "+cisla[x]);
       }
       else{
           x=n%10;
           y=((n-x)/10)%10;
           z=n/100;
           System.out.println("Vysledek je:"+cisla[z]+", "+cisla[y]+", "+cisla[x]);

       }

    }
}
