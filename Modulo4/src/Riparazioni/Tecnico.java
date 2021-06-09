package Riparazioni;

import java.util.Random;

public class Tecnico {
    Random rand=new Random();
    private String nome;
    private boolean occupato=false;

    public boolean isOccupato() {
        return occupato;
    }

    public void setOccupato(boolean occupato) {
        this.occupato = occupato;
    }


    public Tecnico(String nome) {
        this.nome = nome;
    }

    ;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void ripara(Riparazione r1){
        int numconclusione= rand.nextInt(4);
        while(numconclusione!=rand.nextInt(4)){
            System.out.println("in corso...");
        }
        System.out.println("riparazione conclusa");
        r1.setConclusa(true);
        this.setOccupato(false);
    }



}
