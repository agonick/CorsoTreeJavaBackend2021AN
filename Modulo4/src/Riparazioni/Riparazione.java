package Riparazioni;

public class Riparazione {

    private String indirizzoRip;
    private int priorità;
    private Tecnico tecnicoAssegnato;
    private boolean conclusa=false ;

    public Tecnico getTecnicoAssegnato() {
        return tecnicoAssegnato;
    }

    public void setTecnicoAssegnato(Tecnico tecnicoAssegnato) {
        this.tecnicoAssegnato = tecnicoAssegnato;
    }


    public boolean isConclusa() {
        return conclusa;
    }

    public void setConclusa(boolean conclusa) {
        this.conclusa = conclusa;
    }

    public String getIndirizzoRip() {
        return indirizzoRip;
    }

    public void setIndirizzoRip(String indirizzoRip) {
        this.indirizzoRip = indirizzoRip;
    }

    public int getPriorità() {
        return priorità;
    }

    public void setPriorità(int priorità) {
        this.priorità = priorità;
    }

    public Riparazione(String address,int priority){
        setIndirizzoRip(address);
        setPriorità(priority);
    }


}
