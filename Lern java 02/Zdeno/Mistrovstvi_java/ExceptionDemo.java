package Mistrovstvi_java;
class MyException extends Exception{
    private int detail;
    MyException(int a){
        detail=a;
    }
    public String toString(){
        return "My excepntion["+detail+"]";
    }
}

public class ExceptionDemo {
    static void compute(int a) throws MyException{
        System.out.println("Volana metoda "+a);
        if (a>10)
            throw new MyException(a);
        System.out.println("Normalni ukonceni");
    }

    public static void main(String[] args) {
        try {
            compute(1);
            compute(20);
        }
        catch (MyException e){
            System.out.println("Zachycena vyjimka: "+e);
        }
    }
}
