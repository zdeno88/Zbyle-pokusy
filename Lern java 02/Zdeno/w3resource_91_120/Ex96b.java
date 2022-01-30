package w3resource_91_120;

public class Ex96b {
    public static void main(String[] args) {
        int[] pole = {10, 70, 80, 50, 20, 13, 50};
//        int[] pole = {10, 70, 80, 50, 60, 13, 50};

        boolean a=false;
        int res=0;
        for (int i=0;i< pole.length;i++){
            if(pole[i]==10){
                a=true;
            }
            if (a&&pole[i]==20){
                System.out.printf( String.valueOf(true));
                res=1;
            }
        }
        if (res==0)
            System.out.printf( String.valueOf(false));

    }
}
