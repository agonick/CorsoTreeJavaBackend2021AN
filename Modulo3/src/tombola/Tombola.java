package tombola;

import java.util.Random;

public class Tombola {
    Random rand = new Random();
    int [] numUsciti= new int[90];
    int[][] cartella= new int [3][5];

    public static void main(String[] args) {

    }




public static int[][] nuovaCartella(){
    int[][] cartella=new int[3][5];
    int num;
    Random random=new Random();
/*
    for (int i=0;i<3;i++) {
        for (int j = 0; j < 5; j++) {
           int num = random(90) + 1;
            cartella[i][j] = num;
        }
    }

 */
            /* do {
                num = random(90) + 1;
            }while (doppione(num ))

             */

        return cartella;
}
}



