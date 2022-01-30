package Mistrovstvi_java;
class Factorial{
    int Fact(int a){
        int result;
        if (a==1){
            return 1;
        }
        System.out.println(a);
        result=Fact(a-1)*a;
        return result;
    }
}
public class Recursion {
    public static void main(String[] args) {
        Factorial ob=new Factorial();
//        System.out.println("Faktorial cisla 1 je: "+ob.Fact(1));
//        System.out.println("Faktorial cisla 3 je: "+ob.Fact(3));
//        System.out.println("Faktorial cisla 4 je: "+ob.Fact(4));
        System.out.println("Faktorial cisla 5 je: "+ob.Fact(5));
    }
}
