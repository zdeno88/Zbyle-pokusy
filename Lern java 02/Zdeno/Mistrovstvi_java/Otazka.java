package Mistrovstvi_java;

import java.util.Random;

public class Otazka {
    Random rand=new Random();
    Odpovedi ask(){
        int otz=(int)(100*rand.nextDouble());
        System.out.println(otz);
        if(otz<15){
            return Odpovedi.ano;
        }
        else if(otz<30){
            return Odpovedi.ne;
        }
        else if(otz<60){
            return Odpovedi.brzy;
        }
        else if(otz<75){
            return Odpovedi.mozna;
        }
        else if(otz<98){
            return Odpovedi.pozdeji;
        }
        else return Odpovedi.nikdy;
    }
}
class Zeptejse{
    static void odpoved(Odpovedi result){
        switch (result){
            case ne:
                System.out.println("ne");
                break;
            case ano:
                System.out.println("ano");
                break;
            case brzy:
                System.out.println("brzy");
                break;
            case mozna:
                System.out.println("mozna");
                break;
            case pozdeji:
                System.out.println("pozdeji");
                break;
            case nikdy:
                System.out.println("nikdy");
                break;
        }
    }

    public static void main(String[] args) {
        Otazka q=new Otazka();
        odpoved(q.ask());
        odpoved(q.ask());
        odpoved(q.ask());
        odpoved(q.ask());
    }
}
