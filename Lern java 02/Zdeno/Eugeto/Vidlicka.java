package Eugeto;

import java.util.concurrent.Semaphore;

public class Vidlicka {
    int id;
    Semaphore vidlicka=new Semaphore(1);
    public Vidlicka(int id) {
        this.id = id;
    }
    boolean take(){
        return vidlicka.tryAcquire();
    }
    void release(){
        vidlicka.release();
    }
}
