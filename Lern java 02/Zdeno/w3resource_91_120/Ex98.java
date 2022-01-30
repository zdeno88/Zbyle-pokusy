package w3resource_91_120;

public class Ex98 {
    public static void main(String[] args) {
        int a=0,b=0;
//        int[] array_nums = {10, 20, 10, 20, 40, 13, 20};
//        int[] array_nums = {10, 20, 20, 40, 13, 20};
        int[] array_nums = {10, 10, 50, 50, 20, 13, 50};
        if (array_nums.length>=1&&array_nums[0]==20)
            a++;
        for (int i=1;i<array_nums.length;i++){
            if(array_nums[i]==20)
                a++;
            if (array_nums[i-1]==20&&array_nums[i]==20){
                b++;
            }
        }

//        System.out.println(a);
        if (a==3&&b==0)
            System.out.println("Vysledek je: "+true);
        else
        System.out.println("Vysledek je: "+false);
    }
}
