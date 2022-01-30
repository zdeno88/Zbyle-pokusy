package w3resource_91_120;

import java.util.Arrays;

public class Ex114 {
    public static void main(String[] args) {
        String znak="abcde";
        char[] A= znak.toCharArray();
        System.out.println("pole="+Arrays.toString(A));
        int delka=znak.length();
        int rot=3;
        premena(0,delka-rot-1,A);
        premena(delka-rot,delka-1,A);
        premena(0,delka-1,A);
        System.out.println("pole="+Arrays.toString(A));


    }
    public static void premena(int start, int konec,char[]str){
        while (start<konec){
            char temp=str[start];
            str[start]=str[konec];
            str[konec]=temp;
            start++;
            konec--;

        }
    }
}
