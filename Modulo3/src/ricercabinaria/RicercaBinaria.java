package ricercabinaria;

public class RicercaBinaria {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 4, 6, 11, 17, 22, 25};
        int num = 22;

        System.out.println(binarySearch(array, num,0,array.length-1));
    }


    public static boolean binarySearch(int[] array, int num, int inizio, int fine) {
        if (num > array[array.length-1 / 2])
            binarySearch(array, num, (array.length / 2)+1, array.length);
        if (num < array[array.length-1 / 2])
            binarySearch(array, num, inizio+1, (array.length / 2)-1);
        if (num == array[array.length / 2])
            return true;


        return false;
    }
}
