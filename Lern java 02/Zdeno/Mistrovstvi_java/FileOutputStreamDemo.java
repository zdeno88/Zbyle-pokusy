package Mistrovstvi_java;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        String zdroj = "Nyni nastal cas, aby vsichni dobri muzi\n"+
                "prisli pomoci sve zemi\n"+"a zaplatili svoje dane";
        byte buf[]=zdroj.getBytes();
        try (FileOutputStream f1=new FileOutputStream("C:\\Users\\skaryd\\Desktop\\Mobil záloha\\JAVA\\soubor1.txt");
             FileOutputStream f2=new FileOutputStream("C:\\Users\\skaryd\\Desktop\\Mobil záloha\\JAVA\\soubor2.txt");
             FileOutputStream f3=new FileOutputStream("C:\\Users\\skaryd\\Desktop\\Mobil záloha\\JAVA\\soubor3.txt"))
        {
            for (int i=0;i< buf.length;i+=2)
                f2.write(buf[i]);
            f1.write(buf);
            f3.write(buf, buf.length-buf.length/4, buf.length/4 );
        }

    }
}
