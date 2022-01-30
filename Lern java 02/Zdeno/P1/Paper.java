package P1;

class Printer {
    void print(Paper p){
        p.setP("Get lost");
    }

}
class Paper{
    String p;
    public String getP() {
        return p;
    }
    public void setP(String p) {
        this.p = p;
    }
}
class PrintPaper{
    public static void main(String[] args) {
        Paper p=new Paper();
        p.setP("Hello World");
        System.out.println(p.getP());
        Printer pr=new Printer();
        pr.print(p);
        System.out.println(p.getP());
    }

}
