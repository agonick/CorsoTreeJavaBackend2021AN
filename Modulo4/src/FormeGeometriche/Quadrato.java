package FormeGeometriche;

public class Quadrato {

    private int lato;

    public Quadrato(int lato){
        setLato(lato);
    }

    public int getPerimetro(){
        return getLato()*4;
    }

    public int getLato() {
        return lato;
    }

    public void setLato(int lato) {
        this.lato = lato;
    }

    public static void main(String[] args) {
        Quadrato q1=new Quadrato(5);
        System.out.println("Quadrato \n di lato: " + q1.getLato() + "\n di perimetro: " + q1.getPerimetro());
    }
}

