package tabelline;

import java.util.Arrays;
import java.util.Scanner;

public class Tabelline
{
    public static void main(String[] args)
    {
     Scanner input= new Scanner(System.in);
        System.out.println("Inserisci n: ");
        int n=input.nextInt();
        System.out.println("Inserisci m:");
        int m= input.nextInt();

        System.out.println(Arrays.toString(tabelline(n,m)));
    }

    public static int[] tabelline(int n, int m)
    {
        int arrayTabelline[]=new int[m];
        for(int i=0;i< arrayTabelline.length;i++){
            arrayTabelline[i]=i*n;
        }
        return arrayTabelline;
    }
}
