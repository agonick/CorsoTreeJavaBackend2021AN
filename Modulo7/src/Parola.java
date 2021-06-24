import java.util.ArrayList;
import java.util.HashSet;

public class Parole {
    private String parola;
    private HashSet<String> significati;

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public HashSet<String> getSignificati() {
        return significati;
    }

    public void setSignificati(HashSet<String> significati) {
        this.significati = significati;
    }

    public void addSignificato(String s){
        significati.add(s);
    }




}
