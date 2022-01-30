package Mistrovstvi_java;
public class Stats <T extends Number>{
    T nums[];
    public Stats(T[] nums) {

        this.nums = nums;
    }
    double average(){
        double sum=0;
        for (int i=0;i< nums.length;i++){
            sum+=nums[i].doubleValue();
        }
        return sum/ nums.length;
    }
    boolean sameAve(Stats<?> ob){
        if (average()==ob.average())
            return true;
        else
            return false;
    }
}
class BoundsDemo{
    public static void main(String[] args) {
        Integer inums[]={1,2,3,4,5};
        Stats<Integer> iob=new Stats<Integer>(inums);
        double v= iob.average();
        System.out.println("Prumer ipole je: "+v);

        Double dnums[]={1.1,2.2,3.3,4.4,5.5};
        Stats<Double> dob=new Stats<Double>(dnums);
        double u= dob.average();
        System.out.println("Prumer ipole je: "+u);

        Float fnums[]={1.0f,2.0f,3.0f,4.0f,5.0f};
        Stats<Float> fob=new Stats<Float>(fnums);
        double f= fob.average();
        System.out.println("Prumer ipole je: "+f);

        System.out.print("Prumery iob a dob jsou - ");
        if (iob.sameAve(dob))
            System.out.println("stejne");
        else
            System.out.println("odlisne");

        System.out.print("Prumery iob a fob jsou - ");
        if (iob.sameAve(fob))
            System.out.println("stejne");
        else
            System.out.println("odlisne");

    }
}