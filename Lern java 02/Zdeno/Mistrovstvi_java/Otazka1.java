package Mistrovstvi_java;
import java.util.Random;
public class Otazka1 {
        Random rand = new Random();
        Odpovedi zkus(){
            int a = (int)(100 * (rand.nextDouble()));
            if (a < 15) {
                return Odpovedi.ano;
            }
            else if(a<30){
                return Odpovedi.mozna;
            }
            else if(a<60){
                return Odpovedi.brzy;
            }
            else if(a<90){
                return Odpovedi.pozdeji;
            }
            else
                return Odpovedi.nikdy;

    }
}
class vok{
   static void odpoved1(Odpovedi result){
       switch(result){
           case ano:
               System.out.println("ano");
               break;
           case mozna:
               System.out.println("mozna");
               break;
           case brzy:
               System.out.println("brzy");
               break;
           case pozdeji:
               System.out.println("pozdeji");
               break;
           case nikdy:
               System.out.println("nikdy");
               break;
           case ne:
               System.out.println("ne");
               break;
       }
   }


    public static void main(String[] args) {
        Otazka1 ot=new Otazka1();
        odpoved1(ot.zkus());
        odpoved1(ot.zkus());
        odpoved1(ot.zkus());
        odpoved1(ot.zkus());

    }
}
