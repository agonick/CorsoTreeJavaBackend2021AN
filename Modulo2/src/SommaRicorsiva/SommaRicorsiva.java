package SommaRicorsiva;

public class SommaRicorsiva
{
    public static void main(String[] args) {

int[] prova=new int[]{1,2,3,4};
        System.out.println(sommaRicorsiva(prova,4));
    }

    public static int sommaRicorsiva(int[] array,int dim){
        int sum=0;

        if (dim==0)
            return 0;
        else
         sum=array[dim-1]+sommaRicorsiva(array,dim-1);
        return sum;
    }
}


