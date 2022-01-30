package sk.jaro.learnjava;

import java.util.Scanner;

 class MyClass{
    public static void main(String[] args) {
        Scanner myObj= new Scanner(System.in);
        System.out.println("Enter name");

        String Username= myObj.next();
        System.out.println("Tvoje jmeno je:" + Username);
        System.out.println("Delka je:" + Username.length());

    }

}

