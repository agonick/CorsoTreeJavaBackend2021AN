package Riparazioni;

import java.util.Random;

public class Tecnico {
    Random rand=new Random();
    private int id;
    private String nome;
    private boolean available;
    private Riparazione riparazioneassegnata;

    public Riparazione getRiparazioneassegnata() {
        return riparazioneassegnata;
    }

    public void setRiparazioneassegnata(Riparazione riparazioneassegnata) {
        this.riparazioneassegnata = riparazioneassegnata;
    }



    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }


    public Tecnico(int id, String nome) {
        this.id = id;
        this.nome = nome;
        setAvailable(false);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Tecnico{" +
                "rand=" + rand +
                ", id=" + id +
                ", nome='" + nome + '\'' +
                ", available=" + available +
                ", riparazioneassegnata=" + riparazioneassegnata +
                '}';
    }

    public void ripara(){

        int numconclusione= rand.nextInt(4);
        while(numconclusione!=rand.nextInt(4)){
            System.out.println("in corso...");
        }

        System.out.println("riparazione conclusa");
        this.riparazioneassegnata.setConclusa(true);
        this.setAvailable(false);
    }




}
