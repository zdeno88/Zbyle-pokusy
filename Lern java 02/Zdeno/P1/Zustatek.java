package P1;

public class Zustatek {
    String jmeno;
    double zust;
    public Zustatek(String jmeno, double zust){
        this.jmeno=jmeno;
        this.zust=zust;
    }
    public void show(){
        if (zust<0)
            System.out.println("-->");
        System.out.println(jmeno+": CZK "+zust);
    }
}
