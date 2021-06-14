package veicoli;

public class AutoCarro extends Veicolo{

    private int kgCarico;

    public AutoCarro(String targa, String marca, String modello, int numPosti, int kgCarico) {
        super(targa, marca, modello, numPosti);
        this.kgCarico = kgCarico;
    }

    public int getKgCarico() {
        return kgCarico;
    }

    public void setKgCarico(int kgCarico) {
        this.kgCarico = kgCarico;
    }


    @Override
    public String toString() {
        return getTarga()+":"+getKgCarico();
    }
}

