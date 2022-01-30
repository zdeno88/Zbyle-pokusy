package Mistrovstvi_java;
class Test3{
    int a;
    public int b;
    private int c;
    void setC(int i){
        c=i;
    }
    int getC(){
        return c;
    }
}
public class AccessTest {
    public static void main(String[] args) {
        Test3 ob=new Test3();
        ob.a=10;
        ob.b=20;
        int d;
//        ob.c=100;
//        System.out.println(ob.a);
//        System.out.println(ob.b);
        ob.setC(100);
//        d=ob.getC();
//        System.out.println("Hodnoty a,b,c="+ob.a+","+ob.b+","+d);
        System.out.println("Hodnoty a,b,c="+ob.a+","+ob.b+","+ob.getC());
    }
}
