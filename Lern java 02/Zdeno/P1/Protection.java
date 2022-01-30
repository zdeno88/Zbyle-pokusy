package P1;

public class Protection {
    int n_Default =1;
    public int n_Public =2;
    private int n_Private =3;
    protected int n_Protected =4;

    

    public Protection() {
        System.out.println("Zakladni konstruktor");
        System.out.println("n="+ n_Default);
        System.out.println("n_pub="+ n_Public);
        System.out.println("n_pri="+ n_Private);
        System.out.println("n_pro="+ n_Protected);
    }
}
class Derived extends Protection{
    Derived(){
        System.out.println("Odvozeny konstruktor");
        System.out.println("n="+ n_Default);

        System.out.println("n_pub="+ n_Public);
//        System.out.println("n_pri="+n_pri);
        System.out.println("n_pro="+ n_Protected);
    }
        }
class SamePackage{
    SamePackage(){
        Protection p=new Protection();
        System.out.println("Konstruktor ve stejnem balicku");

        System.out.println("n="+p.n_Default);

        System.out.println("n_pub="+p.n_Public);
//        System.out.println("n_pri="+n_pri);
        System.out.println("n_pro="+p.n_Protected);

    }
}