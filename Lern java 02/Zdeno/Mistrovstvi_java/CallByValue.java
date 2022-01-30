package Mistrovstvi_java;
class Test1{
    int a,b;

     Test1(int i, int j) {
         a=i;
         b=j;
    }

    void meth(Test1 o){
        o.a*=2;
        o.b/=2;
    }
}
public class CallByValue {
    public static void main(String[] args) {
        Test1 ob=new Test1(15,20);
        System.out.println("Hodnoty a a b pred volanim:"+ob.a+" "+ob.b);
        ob.meth(ob);
        System.out.println("Hodnoty a a b po volanim:"+ob.a+" "+ob.b);

    }
}
