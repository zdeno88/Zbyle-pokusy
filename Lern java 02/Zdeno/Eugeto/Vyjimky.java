package Eugeto;
class First{
    int cislo;
    public First(int cislo) {
        this.cislo = cislo;
    }
    void run()throws Exception{
        if (cislo<0)
            System.out.println("First run");
            throw new Exception("Error");
    }
}
class Second{
    void run() {
        First first = new First(-1);
        try {
            first.run();
        }
        catch (Exception e){
            System.out.println("Second run");
            throw new RuntimeException("Runtime");
        }
        finally {
            System.out.println("Block finally");
        }

    }
}

public class Vyjimky {
    void vyjimky1(int cislo,int cislo2){
        try {
            int []pole=new int[cislo];
            for (int i=0;i< pole.length;i++)
                pole[i]=i;
            System.out.println("Cislo:"+pole[5]);
        }
        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("vyjimka pole");
        }
            try {
                System.out.println("Cislo2:"+cislo/cislo2);
            }
        catch (ArithmeticException ex){
            System.out.println("vyjimka deleni");
        }
            try {
                int []pole=new int[cislo];
                for (int i=0;i< pole.length;i++)
                    pole[i]=i;
                System.out.println("Cislo:"+pole[5]);
                System.out.println("Cislo2:"+cislo/cislo2);
            }
            catch (ArithmeticException|ArrayIndexOutOfBoundsException e){
                System.out.println("obe vyjimky");
            }
    }
    void vyjimky2 (int cislo,int cislo2)throws NullPointerException{
        if(cislo==0||cislo2==0)
            throw new NullPointerException("Neplatne cislo");
        else
            System.out.println("Vysledek je: "+cislo/cislo2);
    }
    int factorial(int cislo){
        int vysledek = 0;
        if(cislo==1)
            return 1;
            vysledek =factorial(cislo - 1) * cislo;
        return vysledek;
    }
    int relurze(int cislo){
        int vysledek=0;
        if (cislo==1)
            return 1;
        int[]pole=new int[cislo+1];
        pole[cislo]=cislo;
        vysledek=relurze(cislo+1)+cislo;

        return vysledek;
    }
    public static void main(String[] args) {
        Vyjimky vyjimky=new Vyjimky();
//        vyjimky.vyjimky1(6, 1);
//        vyjimky.vyjimky2(2,0);
        int number=5;
//        System.out.println("Factorial cisla "+number+" je:"+vyjimky.factorial(number));
//        System.out.println(vyjimky.relurze(5));
        Second second=new Second();
        second.run();


    }
}
