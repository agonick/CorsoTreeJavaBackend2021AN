package Riparazioni;

/**
 * Classe Riparazione che gestisce le riparazioni
 * param: indirizzoRip -> indirizzo riparazione
 *       priorità -> priorità riparazione
 *       conclusa -> riparazione conclusa = true non conclusa =false
 *
 */

public class Riparazione {

    private String indirizzoRip;
    private int priorità;
    private Tecnico tecnicoAssegnato;
    private boolean conclusa=false ;

    /**
     *  Costruttore di una riparazione
     * @param address
     * @param priority
     */
    public Riparazione(String address,int priority){
        setIndirizzoRip(address);
        setPriorità(priority);
    }


    public Tecnico getTecnicoAssegnato() { // getter setter tecnico assegnato
        return tecnicoAssegnato;
    }

    public void setTecnicoAssegnato(Tecnico tecnicoAssegnato) {
        this.tecnicoAssegnato = tecnicoAssegnato;
    }


    public boolean isConclusa() { // getter  setter conclusa
        return conclusa;
    }

    public void setConclusa(boolean conclusa) {
        this.conclusa = conclusa;
    }

    public String getIndirizzoRip() { // getter setter indirizzo
        return indirizzoRip;
    }


    public void setIndirizzoRip(String indirizzoRip) {
        this.indirizzoRip = indirizzoRip;
    }

    public int getPriorità() { // getter setter priorità
        return priorità;
    }

    public void setPriorità(int priorità) {
        this.priorità = priorità;
    }

    @Override
    public String toString() { //stampa riparazione
        return "Riparazione{" +
                "indirizzoRip='" + indirizzoRip + '\'' +
                ", priorità=" + priorità +
                ", tecnicoAssegnato=" + tecnicoAssegnato +
                ", conclusa=" + conclusa +
                '}';
    }
}
