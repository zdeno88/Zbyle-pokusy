package Mistrovstvi_java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.*;
public class TinyEdit {
    public static void main(String[] args) throws IOException {
        String str[]=new String[100];
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Zadej text:");
        System.out.println("Program se ukonci slovem'stop'");
        for (int i=0;i<100;i++){
            str[i]= br.readLine();
            if (str[i].equals("stop"))
                break;
        }
        for (int i=0;i<100;i++){

            if (str[i].equals("stop"))
                break;
            System.out.println(str[i]);
        }

    }
}
