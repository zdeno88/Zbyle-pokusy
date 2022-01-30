package Mistrovstvi_java;
class RecTest{
    int pole[];

    public RecTest(int a) {
        pole = new int[a];
    }
    void printArray(int i){
        if (i==0)
            return;
        else printArray(i-1);
        System.out.println("Prvek["+(i-1)+"]="+pole[i-1]);
    }
}
public class Recursion2 {
    public static void main(String[] args) {
        RecTest ob=new RecTest(10);
        int i;
        for (i=0;i<10;i++)
            ob.pole[i]=i;
        ob.printArray(10);
    }
}
