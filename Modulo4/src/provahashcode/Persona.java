package provahashcode;

import java.util.Objects;

public class Persona {
    private String Nome;
    private int CodiceIdentificativo;

    public Persona(String nome, int codiceIdentificativo) {
        setNome(nome);
        setCodiceIdentificativo(codiceIdentificativo);
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getCodiceIdentificativo() {
        return CodiceIdentificativo;
    }

    public void setCodiceIdentificativo(int codiceIdentificativo) {
        CodiceIdentificativo = codiceIdentificativo;
    }


}
