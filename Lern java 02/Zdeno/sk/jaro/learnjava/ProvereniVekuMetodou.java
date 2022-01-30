package sk.jaro.learnjava;

public class ProvereniVekuMetodou {
    static void myAge(int age){
        if(age<18){
            System.out.println("mladeznik");
        }
        else
            System.out.println("dospelak");
    }

    public static void main(String[] args) {
        myAge(15);
    }

}
