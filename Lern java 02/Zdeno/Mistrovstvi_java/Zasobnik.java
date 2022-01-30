package Mistrovstvi_java;

public class Zasobnik {
    int tos;
    int zasob[];
    public Zasobnik(int size) {
        zasob=new int[size];
        tos=5;
    }
    void push(int i){
        if(tos==zasob.length){
            System.out.println("zasobnik je plny");
        }
        else{
            zasob[++tos]=i;
            }
    }
    void print(int i){
        if (tos<0){
            System.out.println("Zasobnik je prazdny");
        }
        else {
            System.out.println("Obsah zasobniku je: "+zasob[tos--]);
        }
    }
}
class TestZas{
    public static void main(String[] args) {
        Zasobnik zas1=new Zasobnik(5);
        Zasobnik zas2=new Zasobnik(8);
        for (int i=0;i<5;i++){
            zas1.push(i);
        }
        for (int i=0;i<5;i++){
            zas1.print(i);
        }
    }
}