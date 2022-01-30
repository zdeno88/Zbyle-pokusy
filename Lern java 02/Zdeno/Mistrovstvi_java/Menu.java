package Mistrovstvi_java;
import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {
            int choice;
            do {
                System.out.println("Napoveda pro:");
                System.out.println("1 if");
                System.out.println("2 swicht");
                System.out.println("3 while");
                System.out.println("4 do-while");
                System.out.println("5 for");
                Scanner Obj=new Scanner(System.in);
                System.out.println("Vyber jednu moznost:");
                choice=Obj.nextInt();
            }
            while(choice<1||choice>5);
            {
//                System.out.println("\n");
                switch (choice) {
                    case 1:
                        System.out.println("Vybarana moznost je 1 if:");
                        break;
                    case 2:
                        System.out.println("Vybarana moznost je 2 switch:");
                        break;
                    case 3:
                        System.out.println("Vybarana moznost je 3 while:");
                        break;
                    case 4:
                        System.out.println("Vybarana moznost je 4 do-while:");
                        break;
                    case 5:
                        System.out.println("Vybarana moznost je 5 for:");
                        break;


                }
            }
        }
    }

