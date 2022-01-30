package Eugeto;

public class Replace {
    public static void main(String[] args) {
        String string="ahoj";
        String newstr="";

        for (int i=0; i<string.length();i++){
            if (string.charAt(i)=='j'){
                newstr=string.replace("j","k");
            }
        }
        System.out.println(newstr);
    }
}
