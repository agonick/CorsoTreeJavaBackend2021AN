package massimoprodotto;

import java.util.Arrays;

public class MassimoProdotto {
    public static void main(String[] args) {
      int []array= new int[]{1,4,2,3,10,3};
        System.out.println(maxProdotto(array));

    }

    public static int maxProdotto(int[]array){
        Arrays.sort(array);
        return array[array.length-1]*array[array.length-2];
    }
}


