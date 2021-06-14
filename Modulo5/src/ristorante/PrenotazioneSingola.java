package ristorante;

public class PrenotazioneSingola extends Prenotazione{

    private Preferenza preferenzaPosto;


    public PrenotazioneSingola(int codicePrenotazione, Preferenza preferenzaPosto) {
        super(codicePrenotazione);
        this.preferenzaPosto = preferenzaPosto;
    }

    public Preferenza getPreferenzaPosto() {
        return preferenzaPosto;
    }

    public void setPreferenzaPosto(Preferenza preferenzaPosto) {
        this.preferenzaPosto = preferenzaPosto;
    }
}
enum Preferenza{
    Interno,Esterno
}