package w3resource_91_120;

public class Ex96a {
    public static void main(String[] args) {
        int[] pole = {10, 70, 80, 50, 20, 13, 50};
//        int[] pole = {10, 70, 80, 50, 60, 13, 50};
        boolean a10=false;
        boolean a20=false;
        for (int i=0;i< pole.length;i++){
            if (pole[i]==10)
                a10=true;
        }
        for (int i=0;i< pole.length;i++){
            if (pole[i]==20)
                a20=true;
        }
        System.out.println("Vysledek je: "+String.valueOf(a10==a20));

    }
}
