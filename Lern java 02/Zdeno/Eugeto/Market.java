package Eugeto;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Scanner;

public class Market {

    public static void main(String[] args) throws Exception {

        final String FILE_NAME="C:\\Users\\skaryd\\IdeaProjects\\Lern java 02\\Zdeno\\Eugeto\\purchases.txt";
        final int Lenght_OF_ARRAY=4;
        int lineNumber=0;
        File file=new File(FILE_NAME);
        String nextLine;
//                spatne resene nacteni
//        String[][]item = new String[5][3];
        PurchaseSummary purchaseSummary=new PurchaseSummary();
        purchaseSummary.purchases.clear();

        try(Scanner scanner=new Scanner(file)){
            while (scanner.hasNextLine()){
//                spatne resene nacteni
//                for (int i=0;i<=4;i++){
//                    nextLine = scanner.nextLine();
//                    item[i] = nextLine.split(";");
//                }
                nextLine= scanner.nextLine();
                lineNumber++;
                String[]item1=nextLine.split(";");
                if (item1.length!=Lenght_OF_ARRAY)
                    throw new NullPointerException("Nespravna delka pole na radku: "+lineNumber);
                purchaseSummary.addToPurchaselist(new Purchase(item1[3], item1[2],item1[1],item1[0]));


            }
        }
        catch (FileNotFoundException ex){
            System.out.println("Slozka chybi pro cteni");
        }
//                spatne resene nacteni
//        LocalDate date1=LocalDate.parse(item[0][0]);
//        LocalDate date2=LocalDate.parse(item[1][0]);
//        LocalDate date3=LocalDate.parse(item[2][0]);
//        LocalDate date4=LocalDate.parse(item[3][0]);
//        LocalDate date5=LocalDate.parse(item[4][0]);
//
//        double cislo1=Double.parseDouble(item[0][1]);
//        double cislo2=Double.parseDouble(item[1][1]);
//        double cislo3=Double.parseDouble(item[2][1]);
//        double cislo4=Double.parseDouble(item[3][1]);
//        double cislo5=Double.parseDouble(item[4][1]);
//
//        Purchase nakup1=new Purchase(item[0][3],Category.valueOf(item[0][2]),cislo1,date1);
//        Purchase nakup2=new Purchase(item[1][3],Category.valueOf(item[1][2]),cislo2,date2);
//        Purchase nakup3=new Purchase(item[2][3],Category.valueOf(item[2][2]),cislo3,date3);
//        Purchase nakup4=new Purchase(item[3][3],Category.valueOf(item[3][2]),cislo4,date4);
//        Purchase nakup5=new Purchase(item[4][3],Category.valueOf(item[4][2]),cislo5,date5);
//
//        PurchaseSummary purchaseSummary=new PurchaseSummary();
//        purchaseSummary.addToPurchaselist(nakup1);
//        purchaseSummary.addToPurchaselist(nakup2);
//        purchaseSummary.addToPurchaselist(nakup3);
//        purchaseSummary.addToPurchaselist(nakup4);
//        purchaseSummary.addToPurchaselist(nakup5);

        System.out.println("1) Vsechny nakupy za srpen:"+purchaseSummary.getPurchaseAfterDate());
        System.out.println("2) Celkova cena vsech nakupu: "+purchaseSummary.getTotalAmount());
        System.out.println("3) Prumerna cena vsech nakupu: "+purchaseSummary.AvrPrice());

        purchaseSummary.removeFromPurchaselist(2);

        Purchase nakup6=new Purchase("Běžecké boty",Category.OTHERS, 1599.0,LocalDate.of(2021,8,9));
        purchaseSummary.addToPurchaselist(nakup6);

           final String FILE_NAME2="C:\\Users\\skaryd\\IdeaProjects\\Lern java 02\\Zdeno\\Eugeto\\purchases2.txt";
            File file2=new File(FILE_NAME2);
            try (PrintWriter pw=new PrintWriter(file2)){
                pw.println(purchaseSummary.getPurchaselist());
            }
            catch (FileNotFoundException ex){
                System.out.println("Slozka chybi pro zapsani");
            }

//        Purchase nakup1=new Purchase("pecivo",Category.FOOD.getTyp(),548.1, LocalDate.of(2021,8,9));
//        Purchase nakup2=new Purchase("benzin",Category.CONSUMABLES.getTyp(), 935, LocalDate.of(2021,8,8));
//        Purchase nakup3=new Purchase("kvetina", 129.2,LocalDate.now());
//
//        PurchaseSummary purchaseSummary=new PurchaseSummary();
//        purchaseSummary.addToPurchaselist(nakup1);
//        purchaseSummary.addToPurchaselist(nakup2);
//        purchaseSummary.addToPurchaselist(nakup3);
//        purchaseSummary.checkingRightPrice();
////        System.out.println(purchaseSummary.getPurchaselist());
//        System.out.println(purchaseSummary.getPurchaseAfterDate());
//        System.out.println("Celkovy pocet vsech nakupu: "+purchaseSummary.getSize());
//        System.out.println("Celkova cena: "+purchaseSummary.getTotalAmount());
//        System.out.println("Prumerna cena nakupu: "+purchaseSummary.AvrPrice());

    }
}
