package w3resource_1_30;
import java.util.Scanner;
public class Ex13{
public static void main(String[]args) {
    Scanner Obj=new Scanner(System.in);
    System.out.println("Zadej stranu a:");
    int a= Obj.nextInt();
    System.out.println("Zadej stranu b:");
    int b= Obj.nextInt();
    double area =a*b;
    double perimetr=2*(a+b);
    System.out.println("Obsah="+area+"\nObvod="+perimetr);


} }