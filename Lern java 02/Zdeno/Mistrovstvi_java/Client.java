package Mistrovstvi_java;

class Client implements Callback{

    public void callback(int p){
        System.out.println("Metoda call back volana s:" +p);
    }
    void nonIfaceMeth(){
        System.out.println("Tridy, implementujici rozhrani mohou"+"definovat s dalsi potrebne cleny.");
    }

    public static void main(String[] args) {
        Client ob=new Client();
        ob.callback(10);
        ob.nonIfaceMeth();

    }
}
