package cifrario;

import java.util.Arrays;

/*
🛴 Cifrario di cesare • Il cifrario di Cesare è il più antico sistema di
criptografia della storia • Data una frase e una chiave numerica, il
cifrario sposta le lettere in avanti delle
posizioni della chiave • La parola «ciao» usando come chiave il 3
diventa quindi «flcr» • Per decriptare basterà fare il procedimento
inverso usando la stessa chiave. • Scrivete voi le funzioni cripta e decripta • Hint, le lettere sono codificate in seguendo
il sistema ASCII (tabella nella prossima
slide)
 */
public class Cifrario {
    public static void main(String[] args) {
        String stringa = "" ;
        int chiave = 3;
        System.out.println(cripta(stringa, chiave));
        stringa=cripta(stringa,chiave);
        System.out.println(decripta(stringa,chiave));

    }

    public static String cripta(String s, int key) {
       char[] parola=s.toCharArray();
        for (int i = 0; i < parola.length; i++) {
            int nuovoCarattere = (int)s.charAt(i) + key;
            char carattereTemp = (char) nuovoCarattere;
            parola[i] = carattereTemp;

        }
        String stringacriptata="";
        for(char car : parola){
            stringacriptata=stringacriptata+car;
        }
        return stringacriptata;

    }

    public static String decripta(String s,int key){
        return cripta(s,-key);
    }









}


