package Negozio;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Negozio {


    private ArrayList<Prodotto> Inventario = new ArrayList<>();
    private String nomenegozio;

    public Negozio(ArrayList<Prodotto> inventario, String nomenegozio) {
        setInventario(inventario);
        setNomenegozio(nomenegozio);
    }

    public ArrayList<Prodotto> getInventario() {
        return Inventario;
    }

    public void setInventario(ArrayList<Prodotto> inventario) {
        Inventario = inventario;
    }


    public String getNomenegozio() {
        return nomenegozio;
    }

    public void setNomenegozio(String nomenegozio) {
        this.nomenegozio = nomenegozio;
    }

    public void aggiungiProdotto(Prodotto p) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < getInventario().size(); i++) {
            if (p.getNome().equals(getInventario().get(i).getNome())) {
                System.out.println("Prodotto già presente. qta: " + getInventario().get(i).getQta() + " inserire nuova qta ->");
                int nuovaqta = input.nextInt();
                getInventario().get(i).setQta(nuovaqta);
                return;
            }
        }
        getInventario().add(p);
    }


    public void rimuoviProdotto(Prodotto p) {
        getInventario().remove(p);
    }

    public int qtaRimanenteProdotto(Prodotto p) {
        for (int i = 0; i < getInventario().size(); i++) {
            if (p.getNome().equals(getInventario().get(i).getNome())) {
                return getInventario().get(i).getQta();
            }
        }
        return 0;
    }

    public int getTodaysDayOfWeek() {
        final Calendar c = Calendar.getInstance();
        return c.get(Calendar.DAY_OF_WEEK);
    }

    public void applicaScontoAlimentariOver60(Prodotto p) {
        p.setPrezzo(p.getPrezzo() + p.getPrezzo() / 20 * 100);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Prodotto p1 = new Prodotto("Carne", 5, true, 2);
        Prodotto p2 = new Prodotto("matite", 2, false, 2);
        ArrayList<Prodotto> inv1 = new ArrayList<Prodotto>();
        inv1.add(p1);
        inv1.add(p2);
        Negozio negozio1 = new Negozio(inv1, "da ciccio");
        int scelta;
        System.out.println("------Benvenuto nel Negozio " + negozio1.getNomenegozio() + "--------");
        System.out.println("scegli cosa fare:");
        System.out.println("1 - aggiungi in inventario");
        System.out.println("2 - rimuovi da inventario");
        System.out.println("3 - nuova vendita");
        System.out.println("4 - controlla in inventario");
        scelta = input.nextInt();

        switch (scelta) {
            case 1:
                System.out.println("Inserisci nome prootto");
                String nomeprodottoadd = input.nextLine();
                System.out.println("Inserisci prezzo:");
                int prezzoprod = input.nextInt();
                System.out.println("è ALIMENTARE?");
                boolean alim = input.nextBoolean();
                System.out.println("inserisci qta:");
                int qta = input.nextInt();
                negozio1.aggiungiProdotto(new Prodotto(nomeprodottoadd, prezzoprod, alim, qta));
                break;
            case 2:
                System.out.println("Inserisci nome prootto");
                String nomeprodottodarimuovere = input.nextLine();
                for (int i = 0; i < negozio1.getInventario().size(); i++) {
                    if (nomeprodottodarimuovere.equals(negozio1.getInventario().get(i).getNome()))
                        negozio1.rimuoviProdotto(negozio1.getInventario().get(i));
                }
                break;
            case 3:
                System.out.println("cosa vuoi vendere? scrivi termina per terminare");

                ArrayList<String> listavenduti=new ArrayList<>();
                String vendutoininput;
                vendutoininput=input.nextLine();
                listavenduti.add(vendutoininput);





                break;
            default:
                System.out.println("scelta errata interruzione programma");
                System.exit(0);
        }


    }
}






