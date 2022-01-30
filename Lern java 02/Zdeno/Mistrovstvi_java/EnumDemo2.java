package Mistrovstvi_java;

public class EnumDemo2 {
    public static void main(String[] args) {
        Jablko a;
        a=Jablko.Gala;
        System.out.println("Jablko "+a+" stoji "+a.nactiCenu()+" Kc");
        System.out.println("Ceny vsech druhu jablek");
        for(Jablko b:Jablko.values()){
            System.out.println("Jablko "+b+" stoji "+b.nactiCenu()+" Kc");
        }

    }
    }
