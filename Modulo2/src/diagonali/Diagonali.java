package diagonali;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Diagonali {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Inserisci n righe e colonne:");
        int raw=input.nextInt();
        if(raw<=0){
            System.out.println("valore non valido");
            return;
        }
        int column=raw;
        int matrice[][]=new int[raw][column];
        String numeriInIngresso= input.nextLine();
        String[] numSingoli=numeriInIngresso.split(",");
        for(int i=0;i<raw;i++) {
            for (int j = 0; j < column; j++) {
                matrice[i][j] = rand.nextInt(50);
            }
        }
        for(int i=0;i<raw;i++) {
            System.out.println(Arrays.toString(matrice[i]));
        }
        System.out.println("vuoi la diagonale principale (true) o l'antidiagonale? (false) ");
        boolean diag=input.nextBoolean();
        System.out.println(diagonali(matrice,diag));


    }


    public static int diagonali(int[][] matrice, boolean diagonOAnti){
        int sum=0;
        if (diagonOAnti == true) {
            for (int i = 0; i < matrice.length; i++) { // sommo la diagonale principale
                sum += matrice[i][i];
            }

        }else {
            for (int i = 0; i < matrice.length; i++) { // sommo l'antidiagonale
                sum += matrice[i][matrice.length - i - 1];
            }
        }
        return sum;
    }
}
