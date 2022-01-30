package Mistrovstvi_java;
class Vnejsi{
    int outer_x=100;

    void Test4(){
        Vnitrni inner=new Vnitrni();
        inner.display();
    }

    class Vnitrni{
        void display(){
            System.out.println("Zobrazeni hodnoty x: "+outer_x);
        }
    }
}

public class InnerClassDemo {
    public static void main(String[] args) {
        Vnejsi outer=new Vnejsi();
        outer.Test4();
    }
}
