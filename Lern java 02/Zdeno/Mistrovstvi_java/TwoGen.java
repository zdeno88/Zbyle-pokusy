package Mistrovstvi_java;
public class TwoGen <U,V>{
    U ob1;
    V ob2;
    public TwoGen(U u, V v) {
        ob1 = u;
        ob2 = v;
    }
    public U getOb1() {
        return ob1;
    }
    public V getOb2() {
        return ob2;
    }
    void showTwoGen(){
        System.out.println("U je typu: "+ob1.getClass().getName());
        System.out.println("V je typu: "+ob2.getClass().getName());
    }
}
class SimpGen{
    public static void main(String[] args) {
        TwoGen<Integer,String> tgObj=new TwoGen<Integer,String>(88,"Geneticke typy");
        tgObj.showTwoGen();
        int i= tgObj.getOb1();
        System.out.println("Hodnota U je: "+i);
        String s= tgObj.getOb2();
        System.out.println("Hodnota V je: "+s);
    }
}
