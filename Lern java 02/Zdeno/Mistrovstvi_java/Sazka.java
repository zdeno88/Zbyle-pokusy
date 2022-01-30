package Mistrovstvi_java;
import java.util.*;
public class Sazka {
    public static void main(String[] args) {
        Random ram=new Random();
        ArrayList<Integer> list=new ArrayList<>();
        for (int i=1;i<50;i++){
            list.add(i);
        }
//        System.out.println(Arrays.toString(list.toArray()));
        for (int j=1;j<11;j++) {
            Collections.shuffle(list);
//        System.out.println(Arrays.toString(list.toArray()));
            StringBuilder st = new StringBuilder();
            st.append("[");
            list.stream().sorted();
            for (int i = 0; i < 6; i++) {
                st.append(list.get(i));
                if (i == 5)
                    st.append("]");
                else
                    st.append(", ");
            }
            System.out.println("Slopek cislo "+j+" = "+st);
        }
        System.out.print("Sance milion = [ ");
        for (int i=0;i<6;i++){
            int a= ram.nextInt(10);
            System.out.print(a+" ");
        }
        System.out.println("]");
    }
}
