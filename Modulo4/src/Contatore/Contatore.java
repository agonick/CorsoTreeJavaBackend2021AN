package Contatore;

public class Contatore {

    public static void main(String[] args) {
        Contatore cont1=new Contatore(1);
        Contatore cont2=new Contatore();
        System.out.println(cont1.valore);
        System.out.println(cont2.valore);
        cont1.incrementa();
        System.out.println(cont1.valore);
        cont2.resetValore();
        System.out.println(cont2.valore);
        cont2.resetValoreAValore(2);
        System.out.println(cont2.valore);
    }


    public int valore;
    public Contatore(int valoreIniziale){
        valore =valoreIniziale;
    }

    public Contatore(){
        valore = 0;
    }

    public void incrementa(){
        valore++;
    }

    public void resetValore(){
        valore=0;
    }
    public void resetValoreAValore(int valorereset){
        valore=valorereset;
    }


}
