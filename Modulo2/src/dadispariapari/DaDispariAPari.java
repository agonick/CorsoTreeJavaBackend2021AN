package dadispariapari;



public class DaDispariAPari {
    public static void main(String[] args) {
        int ints1[]= new int[]{1, 2, 3, 4, 5};
        int[] ints = daDispariAPari(ints1);
       for(int numPari : ints) System.out.println(numPari);
    }

    public static int[] daDispariAPari(int[] array){ // trasforma un vettore in num pari
        for (int i=0; i<array.length;i++) {
            if (0 == array[i] % 2) continue; // se è pari salta
            array[i] = array[i] * 2; //altrimenti moltiplica per 2
        }
        return array;
    }
}
