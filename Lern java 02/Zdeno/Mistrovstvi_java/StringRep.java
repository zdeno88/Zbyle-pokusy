package Mistrovstvi_java;

public class StringRep {
    public static void main(String[] args) {
        String veta= "Toto jest test, toto byl jeste test.";
        String search="est";
        String nahrada="byl";
        String resul="";
        int i=0;
        do {
            System.out.println(veta);
            i=veta.indexOf(search);
            if (i!=-1){
                resul=veta.substring(0,i);
                veta=resul + nahrada + veta.substring(i+3,veta.length());
            }

        }while (i!=-1);
    }
}
