package Eugeto;

class BatPlayer extends Hrac {
    public BatPlayer(String jmeno, int cislo) {
        super(jmeno, cislo);
    }
    @Override
    public void play() {
        System.out.println("Swing... HOMERUN!");
    }
}
class FieldPlayer extends Hrac {
    public FieldPlayer(String jmeno, int cislo) {
        super(jmeno, cislo);
    }
    @Override
    public void play() {
        System.out.println("Catch the ball!");
    }

    public static void main(String[] args) {
        BatPlayer batPlayer=new BatPlayer("Jan",10);
        FieldPlayer fieldPlayer=new FieldPlayer("Vit",5);
        batPlayer.play();
        fieldPlayer.play();
    }
}