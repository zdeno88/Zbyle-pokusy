package Eugeto;

public class Filozov extends Thread{
    int number;
    int food=1000;
    int counter=0;
    Vidlicka levaVidlicka;
    Vidlicka pravaVidlicka;

    public Filozov(int number, Vidlicka levaVidlicka, Vidlicka pravaVidlicka) {
        this.number = number;
        this.levaVidlicka = levaVidlicka;
        this.pravaVidlicka = pravaVidlicka;
    }

    @Override
    public void run() {
        for (int i=0;i<food;i++) {
            try {
                eat();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            counter++;
        }
        System.out.println("Filozov "+Thread.currentThread().getName()+" snedl porci: "+counter);

    }
    void eat() throws InterruptedException {
        if (levaVidlicka.take()){
            if (pravaVidlicka.take()){
               sleep(0,10);
            }
        }
        levaVidlicka.release();
        pravaVidlicka.release();

    }

    public static void main(String[] args) {
        Vidlicka[]vidlicka=new Vidlicka[10];
        for (int i=0;i< vidlicka.length;i++) {
            vidlicka[i] = new Vidlicka(i);
        }
        Filozov[]filozov=new Filozov[10];
        for (int i=0;i< filozov.length;i++){
            if(i<filozov.length-1){
                filozov[i]=new Filozov(i,vidlicka[i],vidlicka[i+1]);
                Thread.currentThread().setName(String.valueOf(i));
                filozov[i].start();
            }
            else {
                filozov[i]=new Filozov(i,vidlicka[0],vidlicka[i]);
                Thread.currentThread().setName(String.valueOf(i));
                filozov[i].start();

            }
        }



    }
}
