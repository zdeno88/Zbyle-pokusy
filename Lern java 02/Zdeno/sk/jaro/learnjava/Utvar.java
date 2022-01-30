package sk.jaro.learnjava;

public class Utvar {
    String nazev;
    double stranaA;
    double obsah;
    double obvod;

    public Utvar(double stranaA, String nazev) {
        this.stranaA = stranaA;
        this.nazev=nazev;

    }
    public double obsah(){
        return obsah;
    }
    public double obvod(){
        return obvod;
    }
    void blesk(){
        System.out.println(nazev+" ma obsah "+(double)Math.round(obsah()*100)/100+" a obvod  "+obvod());
    }
}
class Ctverec extends Utvar{
    public Ctverec(int stranaA, String nazev) {
        super(stranaA,nazev);
    }
    @Override
    public double obsah() {
        obsah=stranaA*stranaA;
        return super.obsah();
    }
    @Override
    public double obvod() {
        obvod=stranaA*4;
        return super.obvod();
    }
    @Override
    void blesk() {
        super.blesk();
    }
}
class Obdelnik extends Utvar{
    int stranaB;
    public Obdelnik(int stranaA, String nazev,int stranaB) {
        super(stranaA, nazev);
        this.stranaB=stranaB;
    }
    @Override
    public double obsah() {
        obsah=stranaA*stranaB;
        return super.obsah();
    }
    @Override
    public double obvod() {
        obvod=2*(stranaA+stranaB);
        return super.obvod();
    }
    @Override
    void blesk() {
        super.blesk();
    }
}
class Trojuhelnik extends Utvar{
    int stranaB;
    int stranaC;
    double vyska;

    public Trojuhelnik(double stranaA, String nazev, int stranaB, int stranaC) {
        super(stranaA, nazev);
        this.stranaB = stranaB;
        this.stranaC = stranaC;
    }
    @Override
    public double obsah() {
        if (stranaA==stranaB&&stranaA==stranaC&&stranaB==stranaC){
            vyska=Math.sqrt((Math.pow(stranaA,2))-(Math.pow((stranaA/2),2)));
            obsah=stranaA*vyska/2;
            return super.obsah();}
        else if(stranaA==stranaB||stranaA==stranaC||stranaB==stranaC){
            if(stranaA==stranaB){
                vyska=Math.sqrt((Math.pow(stranaA,2))-(Math.pow((stranaC/2),2)));
                obsah=stranaC*vyska/2;
                return super.obsah();
            }
            else if(stranaA==stranaC){
                vyska=Math.sqrt((Math.pow(stranaA,2))-(Math.pow((stranaB/2),2)));
                obsah=stranaB*vyska/2;
                return super.obsah();
            }
            else{
                vyska=Math.sqrt((Math.pow(stranaB,2))-(Math.pow((stranaA/2),2)));
                obsah=stranaC*vyska/2;
                return super.obsah();
            }
        }
        else{
            if(stranaA>stranaB&&stranaA>stranaC){
            obsah=stranaB*stranaC/2;
            return super.obsah();}
            if(stranaB>stranaA&&stranaB>stranaC){
                obsah=stranaA*stranaC/2;
                return super.obsah();}
            if(stranaC>stranaB&&stranaC>stranaA){
                obsah=stranaA*stranaB/2;
                return super.obsah();}
        }
        return 0;
    }
    @Override
    public double obvod() {
        obvod=stranaA+stranaB+stranaC;
        return super.obvod();
    }

    @Override
    void blesk() {
        super.blesk();
    }
}


