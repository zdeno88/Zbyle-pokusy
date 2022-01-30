package w3resource_31_60;

public class Ex50 {
    public static void main(String[] args) {
        System.out.println("Cisla delitelna 3:");
        for (int i=1;i<=100;i++){
            if (i%3==0){
                System.out.print(i+", ");
            }

        }
        System.out.println("\nCisla delitelna 5:");
        for (int i=1;i<=100;i++){
            if (i%5==0){
                System.out.print(i+", ");
            }

        }
        System.out.println("\nCisla delitelna 3 a 5:");
        for (int i=1;i<=100;i++){
            if (i%3==0&&i%5==0){
                System.out.print(i+", ");
            }

        }
    }
}
