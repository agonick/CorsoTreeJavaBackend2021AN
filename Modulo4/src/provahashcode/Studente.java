package provahashcode;

import java.util.Objects;

public class Studente extends Persona{

    private String matricola;

    public Studente(String nome, int codiceIdentificativo, String matricola) {
        super(nome, codiceIdentificativo);
        setMatricola(matricola);
    }

    public String getMatricola() {
        return matricola;
    }

    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Studente studente = (Studente) o;
        return matricola.equals(studente.matricola);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), matricola);
    }


}
