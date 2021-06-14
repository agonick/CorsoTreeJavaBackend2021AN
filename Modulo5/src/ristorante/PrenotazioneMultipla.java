package ristorante;

public class PrenotazioneMultipla extends Prenotazione {
private int numPersone;

    public PrenotazioneMultipla(int codicePrenotazione, int numPersone) {
        super(codicePrenotazione);
        this.numPersone = numPersone;
    }



}
