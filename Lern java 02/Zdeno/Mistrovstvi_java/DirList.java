package Mistrovstvi_java;

import java.io.*;

class Onlyexp implements FilenameFilter{
    String ext;
    public Onlyexp(String ext) {
        this.ext ="."+ext;
    }

    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(ext);
    }
}

public class DirList {
    public static void main(String[] args) {
        String dirname= "C:\\Users\\skaryd\\Desktop\\ZÁLOHA\\KIA";
        File f1=new File(dirname);
        FilenameFilter only=new Onlyexp("xlsx");
        if (f1.isDirectory()){
            System.out.println("Adresar "+ dirname);
            String s[]=f1.list(only);
            for (int i=0;i<s.length;i++){
                File f=new File(dirname);
                if (f.isDirectory()){
                    System.out.println(s[i]+" je adresar");
                }
                else
                    System.out.println(s[i]+" je soubor");
            }
        }
        else
            System.out.println(dirname+" neni adresar");
    }
}
