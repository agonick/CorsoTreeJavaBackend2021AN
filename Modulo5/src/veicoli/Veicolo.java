package veicoli;

public class Veicolo {
    private String targa;
    private String marca;
    private String modello;
    private int numPosti;

    public Veicolo(String targa, String marca, String modello, int numPosti) {
        this.targa = targa;
        this.marca = marca;
        this.modello = modello;
        this.numPosti = numPosti;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public int getNumPosti() {
        return numPosti;
    }

    public void setNumPosti(int numPosti) {
        this.numPosti = numPosti;
    }
}
