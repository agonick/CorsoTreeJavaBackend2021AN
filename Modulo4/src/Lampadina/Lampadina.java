package Lampadina;

import java.util.Scanner;

public class Lampadina
{


    private int contclick;
    private Stato state;
    private static Corrente corrente=Corrente.No;

    public Corrente getCorrente() {
        return corrente;
    }

    public void switchCorrente() {
        if (corrente ==Corrente.No)
        corrente = Corrente.Sì;
        else corrente =Corrente.No;
    }

    public Stato stato() {
        return state;
    }

    public void setState(Stato state) {
        this.state = state;
    }


    public int getContclick() {
        return contclick;
    }

    public void setContclick(int contclick) {
        this.contclick = contclick;
    }

    public void incrementa(){
        setContclick(++contclick);
    }


    public Lampadina(){
        setState(Stato.spento);

    }

    public void click(){
        if(getCorrente()==corrente.No){
            System.out.println("Non c'è corrente");
            return;
        }

        if (getContclick()>500){
            setState(Stato.rotto);
            System.out.println("Lampadina rotta");
        }

        setContclick(++contclick);
        if(stato()!=Stato.rotto) {
            if (stato() == Stato.spento )
                setState(Stato.acceso);
            else if(stato()==Stato.acceso)
                setState(Stato.spento);
        }
    }

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        Lampadina l1=new Lampadina();
        Lampadina l2=new Lampadina();
        Interruttore int1=new Interruttore(l1);
        Interruttore int2=new Interruttore(l1);
        int selezione;
        String selImpianto;





        System.out.println(l1.getCorrente());





/*
        while(l1.stato()!=Stato.rotto){
            l1.click();
            System.out.println(l1.stato());
            */

        System.out.println("avvio lampadina " +l1.stato());
        System.out.println("avvio interruttore " +int1.getP());
        System.out.println("Inserisci 1 per interruttore 1, o 2 per interruttore 2, 3 per spegnere o accendere la corrente");

        while(l1.state!=Stato.rotto){
            selezione=input.nextInt();
        if(selezione==1) {
            int1.click();
            System.out.println("click ");
            System.out.println("stato lampadina " + l1.stato());
            System.out.println("stato interruttore " + int1.getP());
        }
        if (selezione==2){
            int2.click();
            System.out.println("click ");
            System.out.println("stato lampadina " + l1.stato());
            System.out.println("stato interruttore " + int2.getP());
        }
        if (selezione==3){
            l1.switchCorrente();
            System.out.println(l2.getCorrente());
        }
        }
        }
    }

    enum Corrente{
    Sì,No
    }

