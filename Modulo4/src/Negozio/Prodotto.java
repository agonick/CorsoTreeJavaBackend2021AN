package Negozio;

public class Prodotto {

    private String Nome;
    private float Prezzo;
    private boolean Alimentare;
    private int qta;


    public Prodotto(String nome, float prezzo, boolean alimentare, int qta) {  //COSTRUTTORE
     setNome(nome);
     setPrezzo(prezzo);
     setAlimentare(alimentare);
     setQta(qta);
    }


    public String getNome() { //GETTER AND SETTER
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public float getPrezzo() {
        return Prezzo;
    }

    public void setPrezzo(float prezzo) {
        Prezzo = prezzo;
    }

    public boolean isAlimentare() {
        return Alimentare;
    }

    public void setAlimentare(boolean alimentare) {
        Alimentare = alimentare;
    }

    public int getQta() {
        return qta;
    }

    public void setQta(int qta) {
        this.qta = qta;
    }



}
