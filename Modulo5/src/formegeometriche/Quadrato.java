package formegeometriche;

public class Quadrato {
   private int lato;

   public Quadrato(int lato) {
      this.lato = lato;
   }

   public int getLato() {
      return lato;
   }

   public void setLato(int lato) {
      this.lato = lato;
   }

   public float getArea(){
      return getLato()*getLato();
   }

   public float getPerimeter(){
      return getLato()*4;
   }

   @Override
   public String toString() {
      return "Quadrato{" +
              "lato=" + lato +
              '}';
   }
}
