package sk.jaro.learnjava;

public class Testuj2 {
    public static void main(String[] args) {
        int k=4;

        for (int i = 1; i < 5; i++) {

//
            for (int j = 1; j < 5; j++) {
                System.out.print(j);
                if (j==k)
                    break ;
            }
            k--;

            System.out.println("");
        }
    }
}


