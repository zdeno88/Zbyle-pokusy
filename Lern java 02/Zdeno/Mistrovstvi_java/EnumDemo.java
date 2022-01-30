package Mistrovstvi_java;

public class EnumDemo {
    public static void main(String[] args) {
        Jablko jab=Jablko.Fuji;
        System.out.println("Hodnota promenne jab je "+jab);
        jab=Jablko.Golden;
        switch (jab){
            case Fuji:
                System.out.println("Jablko "+jab+" je cervenozlute");
                break;
            case Gala:
                System.out.println("Jablko "+jab+" je zlutocervene");
                break;
            case Rubín:
                System.out.println("Jablko "+jab+" je cervene");
                break;
            case Golden:
                System.out.println("Jablko "+jab+" je zlute");
                break;
            case Spartan:
                System.out.println("Jablko "+jab+" je rude");
                break;
        }
    }
}
