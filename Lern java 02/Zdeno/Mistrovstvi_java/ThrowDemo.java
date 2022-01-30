package Mistrovstvi_java;

class ThrowDemo {
    static void trhowOne()throws IllegalAccessException{
        System.out.println("Uvnitr metody throwOne");
        throw new IllegalAccessException("demo");
    }

    public static void main(String[] args) {
        try {
            trhowOne();
        }
        catch (IllegalAccessException e){
            System.out.println("Zachycena vyjimka: " +e);
        }
    }
}

