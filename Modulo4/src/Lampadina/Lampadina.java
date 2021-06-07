package Lampadina;

public class Lampadina
{
    public Stato stato() {
        return state;
    }

    public void setState(Stato state) {
        this.state = state;
    }

    private int contclick;
    private Stato state;

    public int getContclick() {
        return contclick;
    }

    public void setContclick(int contclick) {
        this.contclick = contclick;
    }


    public Lampadina(){
        setState(Stato.spento);
    }

    public void click(){
        if (this.getContclick()>10){
            this.setState(Stato.rotto);
            System.out.println("Lampadina rotta");
        }

        setContclick(++contclick);
        if(this.stato()!=Stato.rotto) {
            if (this.stato() == Stato.acceso)
                this.setState(Stato.spento);
            else this.setState(Stato.acceso);
        }
    }

    public static void main(String[] args) {
        Lampadina l1=new Lampadina();

        while(l1.stato()!=Stato.rotto){
            l1.click();
            System.out.println(l1.stato());
        }
    }
}
