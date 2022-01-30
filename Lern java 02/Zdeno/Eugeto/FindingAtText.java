package Eugeto;

import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindingAtText {
        void cviceni1 () {
            Scanner scanner = new Scanner(System.in);
            String text;
            System.out.println("Aplikace se zavre close");
            do {
                System.out.println("Zadej vstupni retezec");
                text = scanner.nextLine();
                if (!text.equalsIgnoreCase("close")) {
                    Pattern pattern = Pattern.compile("monday");
                    Matcher matcher = pattern.matcher(text.toLowerCase());
                    if (matcher.matches()) {
                        System.out.println("Today is monday.");
                    } else
                        System.out.println("Today is not Monday.");
                }
            }
            while (!text.equalsIgnoreCase("close"));

        }
        void cviceni2(String text){
            String []result=text.split(":");
            System.out.println(result[2]+" "+result[0]);

        }
        void cviceni3(String text){
            String result=text.replaceAll("\\^O\\^","");
            System.out.println(result);

        }
        void cviceni4(){
            Scanner scanner=new Scanner(System.in);
            System.out.println("Aplikace se ukonci close");
            String text;
            do {
                System.out.println("Textuj aplikaci");
                text=scanner.nextLine();
                if ((!text.equalsIgnoreCase("Close")))
                    if (Pattern.matches("...",text)){
                        System.out.println("Welcome '"+text+"' in three-chars Zoo!");
                    }
                else
                        System.out.println("I am sorry '"+text+"', but you cannot enter three-chars Zoo!");

            }
            while (!text.equalsIgnoreCase("Close"));
        }

    public static void main(String[] args) {
        FindingAtText findingAtText=new FindingAtText();
//        findingAtText.cviceni1();
//        findingAtText.cviceni2("Vykoupení z věznice Shawshank:(1994):95,3");
//        findingAtText.cviceni3("^O^This ^O^is ^O^very old ^O^cave!");
        findingAtText.cviceni4();
    }
}

