package Mistrovstvi_java;

import java.lang.annotation.*;
import  java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MojeAnotace{
    String str();
    int val();
}
public class Meta {
    @MojeAnotace(str="Priklad anotace",val=100)
    public static void mojeMetoda(){
        Meta ob=new Meta();
        try {
            Class <?> c=ob.getClass();
            Method m=c.getMethod("mojeMetoda");
            MojeAnotace anno=m.getAnnotation(MojeAnotace.class);
            System.out.println(anno.str()+" "+anno.val());
        }
        catch (NoSuchMethodException e){
            System.out.println("Zachyceni vyjimky");
        }

    }

    public static void main(String[] args) {
        mojeMetoda();
    }
}
