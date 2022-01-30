package Mistrovstvi_java;
public class Gen <T>{
    T ob;
    public Gen(T o) {
        ob = o;
    }
    public T getOb() {
        return ob;
    }
    void showType(){
        System.out.println("T je typu "+ob.getClass().getName());
    }
}
class GetDemo{
    public static void main(String[] args) {
        Gen<Integer> iOb=new Gen<Integer>(88);
        iOb.showType();
        int v=iOb.getOb();
        System.out.println("Hodnota iOb je: "+v);

        Gen<String> strOb=new Gen<String>("Test prace s genetickou tridou");
        strOb.showType();
        String str= strOb.getOb();
        System.out.println("Hodnota strOb je: "+str);
    }
}
