package Mistrovstvi_java;
public class TwoD {
    int x,y;
    public TwoD(int x, int y) {
        this.x = x;
        this.y = y;
    }
    static class TreeD extends TwoD{
        int z;
        public TreeD(int x, int y, int z) {
            super(x, y);
            this.z = z;
        }
    }
    static class FourD extends TreeD{
        int t;
        public FourD(int x, int y, int z, int t) {
            super(x, y, z);
            this.t = t;
        }
    }
}
class Cords<T extends TwoD>{
    T []num;
    public Cords(T[] num) {
        this.num = num;
    }
}
class BoundedWildCard{
    static void showXY(Cords<?> c){
        System.out.println("Souradnice XY jsou:");
        for (int i=0;i<c.num.length;i++){
            System.out.println(c.num[i].x+"; "+c.num[i].y);
        }
    }
    static void showAll(Cords<? extends TwoD.FourD> c){
        System.out.println("Souradnice XYZT jsou:");
        for (int i=0;i<c.num.length;i++){
            System.out.println(c.num[i].x+"; "+c.num[i].y+"; "+c.num[i].z+"; "+c.num[i].t);
        }
    }
    public static void main(String[] args) {
        TwoD tdnum[] = {
                new TwoD(15, 10),
                new TwoD(24, -6),
                new TwoD(35, 100),
                new TwoD(-86, -69)
        };
        Cords<TwoD> tdcor = new Cords<TwoD>(tdnum);
        showXY(tdcor);

        TwoD.FourD[] pole4 = {
                new TwoD.FourD(10, 20, -15, 32),
                new TwoD.FourD(-5, 38, 50, -47),
                new TwoD.FourD(40, -69, 8, -76)
        };
        Cords<TwoD> fdcor = new Cords<TwoD>(pole4);
//        showAll(pole4);

    }

}
