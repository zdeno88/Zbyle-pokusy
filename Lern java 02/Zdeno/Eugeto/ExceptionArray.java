package Eugeto;

public class ExceptionArray {
    public static void main(String[] args) throws ExceptionMy {
        int [] array=new int[3];
        int a=5,b=0,c,d=0;
        try {
            System.out.println(array[4]);
        }
        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Mimo rozsah pole");
        }
        try {
            c=a/b;
            System.out.println(c);
        }
        catch (ArithmeticException ex){
            System.out.println("Deleni nulou");
        }

        if (a==0||d==0){
            throw new ExceptionMy("Deleni nulou");
        }
        else
            System.out.println(c=a/d);


        System.out.println("konec");
    }

}
