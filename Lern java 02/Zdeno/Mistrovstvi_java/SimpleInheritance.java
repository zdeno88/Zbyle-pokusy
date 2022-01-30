package Mistrovstvi_java;
class A{
    int i;
    int j;
    void showIJ(){
        System.out.println("Hodnota i a j je: "+i+" "+j);
    }
}
class B extends A{
    int k;
    void showK(){
        System.out.println("Hodnota k je: "+k);

    }
void sum(){
    System.out.println("Soucet i,j,k= "+(i+j+k));
    }
}

public class SimpleInheritance {
    public static void main(String[] args) {
        A ob1=new A();
        B ob2=new B();

        ob1.i=10;
        ob1.j=20;
        System.out.println("Obsah tridy nadtrida");
        ob1.showIJ();
        ob2.i=7;
        ob2.j=8;
        ob2.k=9;
        System.out.println("Obsah tridy podtrida");
        ob2.showIJ();
        ob2.showK();
        ob2.sum();

    }
}
