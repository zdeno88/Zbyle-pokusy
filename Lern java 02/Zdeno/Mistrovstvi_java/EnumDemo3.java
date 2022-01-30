package Mistrovstvi_java;

public class EnumDemo3 {
    public static void main(String[] args) {
        Jablko1 jab,jab1,jab2;
        jab=Jablko1.Golden;
        jab1=Jablko1.Golden;
        jab2=Jablko1.Rubín;
        System.out.println("Nize jsou vsechny konstanty vyctu jablko a jejich originalni hodnoty");
        for (Jablko1 a:Jablko1.values()) {
            System.out.println(a+" "+a.ordinal());
        }
        if (jab.compareTo(jab2)<0)
            System.out.println(jab+" se ve vyctu nachazi pred "+jab2);
        if (jab.compareTo(jab1)==0)
            System.out.println(jab+" je umisten schodne s "+jab1);
        if (jab.compareTo(jab2)>0)
            System.out.println(jab+" se ve vyctu nachazi za "+jab2);
        System.out.println();
        if (jab.equals(jab2))
            System.out.println("chyba");
        if (jab.equals(jab1))
            System.out.println(jab+" je schodne s "+jab1);
        if (jab==jab1)
            System.out.println(jab+" == "+jab1);


    }
}
