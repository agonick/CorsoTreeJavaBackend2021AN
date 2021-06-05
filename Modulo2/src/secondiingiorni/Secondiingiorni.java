package secondiingiorni;

public class Secondiingiorni

{
    public static void main(String[] args) {
int s=60;
secondiingiorni(s);
    }

    public static void secondiingiorni(int sec){
        int min=sec/60;
        int h=min/60;
        int day=h/24;
        System.out.println("Giorni: " + day+ "Ore: "+ h + "Min: " +min);

}

}
