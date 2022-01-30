package w3resource_91_120;

public class Ex99 {
    public static void main(String[] args) {
        boolean a=true;
        int[] array_nums = {10, 20, 10, 20, 40, 20, 50};
//        int[] array_nums = {10, 20, 10, 20, 40, 20, 50, 10};
//        int[] array_nums = {10, 10, 20, 10, 20, 40, 20, 50};
        for (int i=0;i<array_nums.length-1;i++){
            if (array_nums[i]!=20 && array_nums[i+1]!=20)
                a=false;
        }
        System.out.println("Vysledek je: "+a);

    }
}
