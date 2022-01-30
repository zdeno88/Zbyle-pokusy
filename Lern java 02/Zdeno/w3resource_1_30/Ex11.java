package w3resource_1_30;

import java.util.Scanner;
public class Ex11 {
    public static void main(String[] args) {

    Scanner Obj=new Scanner(System.in);
    System.out.println("Zadej prumer");
    double dia= Obj.nextDouble();
    double obs= Math.PI * dia*dia;
    double obv= 2 * Math.PI * dia;
        System.out.println("obsah="+obs+"\nObvod="+obv);

}}
