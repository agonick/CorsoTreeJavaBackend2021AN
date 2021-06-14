package formegeometriche;

public class Rettangolo extends Quadrato {
   private int altezza;

    public Rettangolo(int lato, int altezza) {
        super(lato);
        this.altezza = altezza;
    }


    public int getAltezza() {
        return altezza;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    public float getArea(){
        return getLato()*getAltezza();
    }

    @Override
    public float getPerimeter() {
        return getLato()*2+getAltezza()*2;
    }

    @Override
    public String toString() {
        return "Rettangolo{ " +
                "base: " +getLato() +
    "altezza: "+ getAltezza() +  " }" ;
    }
}
