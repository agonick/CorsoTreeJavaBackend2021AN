package dispariquadrati;

import java.util.Scanner;

public class DispariQuadrat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("inserisci un numero: ");
        int n=input.nextInt();
        System.out.println(quadratoDispari(n));

    }

    public static int quadratoDispari(int num){
        int square=0;
        int contadispari=1;
        int numerodispari=1;
        while (contadispari<=num) {
            square += numerodispari;
            numerodispari+=2;
            contadispari++;
        }
        return square;

    }
}
