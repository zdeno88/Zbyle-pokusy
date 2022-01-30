package Mistrovstvi_java;
class OverloadDemo{
    void test(){
        System.out.println("Bez parametru");
    }
    void test(int a, int b){
        System.out.println("int a="+a+" int b="+b);
    }
    void test(double a){
        System.out.println("Hodnota uvnitr metody test(double):"+a);
    }

}

public class Overload2 {
    public static void main(String[] args) {
        OverloadDemo ob=new OverloadDemo();
        int i=88;
        ob.test();
        ob.test(10,20);
        ob.test(i);
        ob.test(123.2);

    }
}
