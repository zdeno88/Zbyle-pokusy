package Eugeto;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RedingFromFile {
    List<Player> listOfPlayer=new ArrayList<>();
    void readingFromFile(){
        String fileName = "C:\\Users\\skaryd\\IdeaProjects\\Lern java 02\\Zdeno\\Eugeto\\File.txt";
        String output;
        try (Scanner scanner=new Scanner(new FileReader(new File(fileName)))){
            while (scanner.hasNext()){
                output=scanner.nextLine();
                String []result=output.split(",");
                listOfPlayer.add(new Player(result[0],result[1],result[2]));
            }
        }
        catch (FileNotFoundException e){
            System.out.println("Slozka nenalezena");
        }
    }
    public static void main(String[] args) {
        RedingFromFile redingFromFile=new RedingFromFile();
        redingFromFile.readingFromFile();
        redingFromFile.listOfPlayer.forEach((n)-> System.out.println(n));
    }
}
