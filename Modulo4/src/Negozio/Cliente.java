package Negozio;

public class Cliente {
    private String name;
    private short età;

    public Cliente(String name, short età) {
       setEtà(età);
       setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getEtà() {
        return età;
    }

    public void setEtà(short età) {
        this.età = età;
    }


}
