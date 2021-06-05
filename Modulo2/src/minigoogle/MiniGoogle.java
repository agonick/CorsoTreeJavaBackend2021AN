package minigoogle;

import java.util.Scanner;

public class MiniGoogle
{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int dimensione;
        System.out.println("Quanto grande vuoi l'array?");
        dimensione=input.nextInt();

        int[] D= new int[dimensione];
                for (int num: D) {
                    System.out.println("inserisci numero: ");
                    num = input.nextInt();
                }
        System.out.println("inserisci numero da cercare:");
         int ricerca = input.nextInt();
        System.out.println(ricercaNelVettore(D,ricerca));
    }


    public static String ricercaNelVettore(int[] array, int n){
        for (int i=0;i<array.length;i++){
            if (n==array[i]) {
                return "Presente";
            }
        }
        return "Non presente";
    }
}
