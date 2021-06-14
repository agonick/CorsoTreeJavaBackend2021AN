package ristorante;

public abstract class Prenotazione {

private int codicePrenotazione;

    public Prenotazione(int codicePrenotazione) {
        this.codicePrenotazione = codicePrenotazione;
    }

    public int getCodicePrenotazione() {
        return codicePrenotazione;
    }

    public void setCodicePrenotazione(int codicePrenotazione) {
        this.codicePrenotazione = codicePrenotazione;
    }
}
