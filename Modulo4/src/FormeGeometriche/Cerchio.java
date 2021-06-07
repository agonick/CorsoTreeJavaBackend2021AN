package FormeGeometriche;

public class Cerchio {
    public int getRaggio() {
        return raggio;
    }

    public void setRaggio(int raggio) {
        this.raggio = raggio;
    }

    private int raggio;

    public Cerchio(int raggio){
        setRaggio(raggio);
    }

    public float getCirconferenza(){
        return (float) (this.getRaggio()*2*Math.PI);
    }

    public float getArea(){
        return (float) (this.getRaggio()*this.getRaggio()*Math.PI);
    }




}
