package Lampadina;

public class Interruttore {

    private Pulsante p;
    private Lampadina l;

    public Interruttore(Lampadina lampadina){
        setP(Pulsante.off);
        setL(lampadina);
    }

    public Lampadina getL() {
        return l;
    }

    public void setL(Lampadina l) {
        this.l = l;
    }


    public Pulsante getP() {
        return p;
    }

    public void setP(Pulsante p) {
        this.p = p;
    }

   public void click(){

        if (getP()==Pulsante.off){
            setP(Pulsante.on);
            l.click();

        }
        else {
            setP(Pulsante.off);
            l.click();
        }
   }



}

enum Pulsante{
    on,off
        }
