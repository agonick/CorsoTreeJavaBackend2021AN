package ristorante;

public class GestorePrenotazioni {
    private int postiInterno;
    private int postiEsterno;

    public int getPostiInterno() {
        return postiInterno;
    }

    public void setPostiInterno(int postiInterno) {
        this.postiInterno = postiInterno;
    }

    public int getPostiEsterno() {
        return postiEsterno;
    }

    public void setPostiEsterno(int postiEsterno) {
        this.postiEsterno = postiEsterno;
    }

    public boolean prenota(Prenotazione p){
        if(p instanceof PrenotazioneSingola){
            if (((PrenotazioneSingola) p.getPreferenzaPosto()==Preferenza.Esterno) {
                if (getPostiEsterno() > 0) {
                    return true;
                    setPostiEsterno(getPostiEsterno()-1);
                }
                else if (getPostiInterno() > 0){
                    return true;
                    setPostiInterno(getPostiInterno()-1);
                }

                else return false;
            } else {
                if (getPostiInterno()>0) {
                    return true;
                    setPostiInterno(getPostiInterno()-1);
                }
                else if(getPostiEsterno()>0) {
                    return true;
                    setPostiEsterno(getPostiEsterno()-1);
                }
                return false


            }
        }

    }

    public static void main(String[] args) {

    }
}
