package Mistrovstvi_java;
 class Test2{
     int a;

     public Test2(int i) {
         a = i;
     }
     Test2 incrByten(){
         Test2 temp=new Test2(a+10);
         return temp;
     }
 }

public class RetOb {
    public static void main(String[] args) {
        Test2 ob1=new Test2(2);
        Test2 ob2;

        System.out.println("Hodnota ob1.a= "+ob1.a);
        ob2=ob1.incrByten();
        System.out.println("Hodnota ob2.a= "+ob2.a);
        ob2=ob2.incrByten();
        System.out.println("Hodnota ob2.a po druhem navyseni= "+ob2.a);

    }
}
