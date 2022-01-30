package sk.jaro.learnjava;
import java.util.Scanner;
public class Priklad3 {
    public static void main(String[] args) {
        Scanner newObj= new Scanner(System.in);
        System.out.println("Input first number:");
        int num1 = newObj.nextInt();
        System.out.println("Input second number:");
        int num2 = newObj.nextInt();
        int multipl= num1*num2;
        System.out.println(num1+ "x" +num2+ "=" +multipl);

    }
}
