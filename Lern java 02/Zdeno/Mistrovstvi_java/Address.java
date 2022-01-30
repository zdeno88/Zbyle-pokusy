package Mistrovstvi_java;

import java.util.LinkedList;

public class Address {
    String jmeno;
    String ulice;
    String mesto;
    String PSC;
    String stat;

    public Address(String jmeno, String ulice, String mesto, String PSC, String stat) {
        this.jmeno = jmeno;
        this.ulice = ulice;
        this.mesto = mesto;
        this.PSC = PSC;
        this.stat = stat;
    }
    public String toString(){
        return jmeno+"\n"+ulice+"\n"+mesto+" "+PSC+"\n"+stat;
    }
}
class MailList{
    public static void main(String[] args) {
        LinkedList<Address> m1=new LinkedList<Address>();

        m1.add(new Address("Roman Maly","Nadrazni 35","Koci","53861","CR"));
        m1.add(new Address("Vit Cerny","Nadrazni 35","Koci","53861","CR"));
        m1.add(new Address("Jan winc","Nadrazni 35","Koci","53861","CR"));
        m1.add(new Address("Pavel Cely","Nadrazni 35","Koci","53861","CR"));

        for (Address element:m1) {
            System.out.println(element);
            System.out.println();

        }
    }
}
