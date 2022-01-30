package w3resource_31_60;

public class Ex39 {
    public static void main(String[] args) {
        int sum=0;
        for (int i=1;i<=4;i++){
            for (int j=1;j<=4;j++){
                for (int k=1;k<=4;k++){
                    if (i != j && i != k && k != j) {
                        sum++;
                        System.out.println(i + "" + j + "" + k);
                    }

                }
            }
        }
        System.out.println("pocet cisel:" + sum);
    }

}
