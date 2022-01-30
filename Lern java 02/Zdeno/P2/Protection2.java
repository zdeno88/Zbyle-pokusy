package P2;

import P1.Protection;

public class Protection2 extends Protection {
       public Protection2() {
        System.out.println("Odvozeny konstruktor z jineho balicku");
//        System.out.println("n="+n_Default);
        System.out.println("n_pub="+ n_Public);
//        System.out.println("n_pri="+n_Private);
        System.out.println("n_pro="+ n_Protected);
    }
}
class OtherPackage {
    OtherPackage(){
        Protection p=new Protection();
        System.out.println("Konstruktor tridy v jinem balicku");

//        System.out.println("n="+p.n_Default);

        System.out.println("n_pub="+p.n_Public);
//        System.out.println("n_pri="+n_Private);
//        System.out.println("n_pro="+p.n_Protected);
    }
}