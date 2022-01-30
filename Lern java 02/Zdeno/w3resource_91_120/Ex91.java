package w3resource_91_120;
import java.lang.*;
public class Ex91 {
    public static void main(String[] args) {
        long time=System.nanoTime();
        System.out.println("Prvnich 10 cisel:");
        for (int i=1;i<=10;i++){
            System.out.println(i);
        }
        long est_time=System.nanoTime()-time;
        System.out.println("Cas programu:"+est_time+"ns");
    }
}
