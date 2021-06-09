package Riparazioni;

public class DittaRiparazione {
    private Tecnico[] listaTecnici;
    private Riparazione[] listaRiparazioni;

    public DittaRiparazione(Tecnico[] listaTecnici, Riparazione[] listaRiparazioni) {
        this.listaTecnici = listaTecnici;
        this.listaRiparazioni = listaRiparazioni;
    }

    public Tecnico[] getListaTecnici() {
        return listaTecnici;
    }

    public void setListaTecnici(Tecnico[] listaTecnici) {
        this.listaTecnici = listaTecnici;
    }

    public Riparazione[]getListaRiparazioni() {
        return listaRiparazioni;
    }

    public void setListaRiparazioni(Riparazione[] listaRiparazioni) {
        this.listaRiparazioni = listaRiparazioni;
    }

    public void assegnaLavoro(){
        // cerca in listarip quella più alta come priorità
        // la assegna al primo tecnico libero in listatecnici
        // cambia lo stato del tecnico in occupato
    }



    public static void main(String[] args) {
        Tecnico t1=new Tecnico("Paolo");
        Riparazione r1=new Riparazione("via roma",3);
        Tecnico[] listat1=new Tecnico[5];
        Riparazione[] listarip1=new Riparazione[5];
        listat1[0]=t1;
        listarip1[0]=r1;
        t1.ripara(r1);
        DittaRiparazione ditta1=new DittaRiparazione(listat1,listarip1);

    }



}
