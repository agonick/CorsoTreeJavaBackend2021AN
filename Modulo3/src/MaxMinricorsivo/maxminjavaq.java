package MaxMinricorsivo;


/*
Esercizio Minimo e Massimo Ricorsivo 🛵

Scrivere una funzione ricorsiva che, dato un array a non ordinato di interi positivi e
negativi, trovi e stampi il minimo elemento e il massimo elemento dell'array a.

Esempio:
array: [40, 90, 130]
minMaxRecursive(array) deve stampare 40 e 130

 */
public class maxminjavaq {
    public static void main(String[] args) {
        int[] vett = new int[] { 50, 40, 130 } ;
        int minimo;
      //  massimo=maxRecursive(vett,vett[0],0);
        minimo = minRecursive(0, vett);
        System.out.println("il minimo è");
        System.out.println(minimo);
        //System.out.println("il massimo è");
        //System.out.println(massimo);
        // minmaxRecursive(vett);
    }


    public static int minRecursive(int[] array, int min, int pos) {
        if (pos == array.length - 1)
            return min;
        if (min < array[pos + 1])
            return minRecursive(array, min, pos + 1);
        if (min > array[pos + 1])
            min = array[pos + 1];
        return minRecursive(array, min, pos + 1);
    }

    public static int maxRecursive(int[] array, int max, int pos) {
        if (pos == array.length - 1)
            return max;

        if (max > array[pos + 1])
            return maxRecursive(array, max,pos + 1);

        if (max < array[pos + 1])
            max = array[pos + 1];
            return maxRecursive(array, max,pos + 1);


    }

    public static int minRecursive(int pos,int[] array){
           if(pos==array.length-1)
               return array[pos];

           return Math.min(array[pos],minRecursive(pos+1,array));

         /*   int minimo=minRecursive(pos+1,array);

            if (array[pos] < minimo)
                return array[pos];
            else
                return minimo;
        */


    }

    public static void minmaxRecursive(int[] array){
        System.out.println("il massimo dell'array è");
        System.out.println(maxRecursive(array,array[0],0));
        System.out.println("il minimo dell'array è:");
        System.out.println(minRecursive(array,array[0],0));
    }
}
