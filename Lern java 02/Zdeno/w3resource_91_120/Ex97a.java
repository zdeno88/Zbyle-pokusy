package w3resource_91_120;

public class Ex97a {
    public static void main(String[] args) {
        boolean a=false;
//        int[] array_nums = {10, 20, 10, 50, 20, 13, 50};
        int[] array_nums = {10, 10, 50, 50, 20, 13, 50};
        for (int i=0;i< array_nums.length;i++){
            if(array_nums[i]==10 && array_nums[i+2]==10){
                a=true;
            }
        }
        System.out.println(a);
    }
}
