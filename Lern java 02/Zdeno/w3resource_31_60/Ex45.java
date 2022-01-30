package w3resource_31_60;
import java.io.File;
public class Ex45 {
    public static void main(String[] args) {
        System.out.println("C:\\Users\\skaryd\\Downloads: " +new File("Poptavka_20200907_0828.xlsx").length() + "bytes");
        System.out.println("C:\\Users\\skaryd\\Downloads: " + new File("Stažené soubory").length()+ "bytes");
    }
}
