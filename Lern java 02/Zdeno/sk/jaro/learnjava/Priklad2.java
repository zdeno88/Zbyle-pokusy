package sk.jaro.learnjava;

import java.util.Scanner;
public class Priklad2{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("zadej 1:");
        int num1= input.nextInt();
        System.out.println("zadej 2:");
        int num2= input.nextInt();
        int sum=num1+num2;
        System.out.println("vysledek je:" + sum);
    }
}

