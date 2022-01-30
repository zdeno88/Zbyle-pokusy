package Mistrovstvi_java;

public class Break {
    public static void main(String[] args) {
        boolean vid=true;
        first:{
            second:{
            third:{
                System.out.print("Pred prikazem break");
                break second;
//                System.out.print("toto se neprovede");
            }
//                System.out.println("toto se neprovede");
            }
            System.out.println("toto je prikaz po bloku second");
        }
    }
}
