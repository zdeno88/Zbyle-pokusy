package Mistrovstvi_java;
public class TwoDe {
    int  x,y;
    public TwoDe(int x, int y) {
        this.x = x;
        this.y = y;
    }
    static class TreeDe extends TwoDe{
        int z;
        public TreeDe(int x, int y, int z) {
            super(x, y);
            this.z = z;
        }
    }
    static class FourDe extends TreeDe{
        int t;
        public FourDe(int x, int y, int z, int t) {
            super(x, y, z);
            this.t = t;
        }
    }
}
class Record<T extends TwoDe>{
    T a[];
    public Record(T[] a) {
        this.a = a;
    }

    void show(){
        System.out.println("Hodnota pole je:");
        for (int i=0;i<a.length;i++){
            System.out.println(a[i].x+" "+a[i].y);
        }
    }
}

class Vision{
    static void ukazAll(Record<? extends TwoDe.FourDe> c){
        System.out.println("Hodnota pole je:");
        for (int i=0;i<c.a.length;i++){
            System.out.println(c.a[i].x+" "+c.a[i].y+" "+c.a[i].z+" "+c.a[i].t);
        }

    }
   public static void main(String[] args) {
        TwoDe [] pole= {
                new TwoDe(10,20),
                new TwoDe(-5,38),
                new TwoDe(40,-69)
        };
       Record<TwoDe> rec1=new Record<TwoDe>(pole);
       rec1.show();
        TwoDe.FourDe [] pole4= {
                new TwoDe.FourDe(10,20,-15,32),
                new TwoDe.FourDe(-5,38,50,-47),
                new TwoDe.FourDe(40,-69,8,-76)
        };
        Record<TwoDe.FourDe> rec=new Record<TwoDe.FourDe>(pole4);
       ukazAll(rec);


       rec.show();

    }


}
