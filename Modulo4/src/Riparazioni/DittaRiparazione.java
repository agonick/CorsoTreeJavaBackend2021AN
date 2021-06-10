package Riparazioni;

import java.util.ArrayList;
import java.util.Scanner;

public class DittaRiparazione {

    private ArrayList<Tecnico> listaTecnici;
    private ArrayList<Riparazione> listaRiparazioni;


    public DittaRiparazione(ArrayList<Tecnico> listaTecnici, ArrayList<Riparazione> listaRiparazioni) {
        this.listaTecnici = listaTecnici;
        this.listaRiparazioni = listaRiparazioni;
    }

    public ArrayList<Tecnico> getListaTecnici() {
        return listaTecnici;
    }

    public void setListaTecnici(ArrayList<Tecnico> listaTecnici) {
        this.listaTecnici = listaTecnici;
    }

    public ArrayList<Riparazione> getListaRiparazioni() {
        return listaRiparazioni;
    }

    public void setListaRiparazioni(ArrayList<Riparazione> listaRiparazioni) {
        this.listaRiparazioni = listaRiparazioni;
    }


    public void ottieniListaRiparazioni(){
        System.out.println("Lista Riparazioni in attesa ;\n");
        for(int i=0;i<getListaRiparazioni().size();i++){
            System.out.println("Riparazione n_" + (i+1));
            this.getListaRiparazioni().get(i).toString();
        }
    }

    public void ottieniListaTecnici(){
        System.out.println("Lista Tecnici in attesa ;\n");
        for(int i=0;i<getListaTecnici().size();i++){
            System.out.println("Tecnico n_" + (i+1));
            this.getListaTecnici().get(i).toString();
        }
    }

    public void stampaProssimaRiparazione(){
        int maxpriority=0;
        for(int i=0;i<getListaRiparazioni().size();i++){
            if(getListaRiparazioni().get(i).getPriorità()>maxpriority)
                maxpriority=getListaRiparazioni().get(i).getPriorità();
        }
        System.out.println("Prossima Riparazione:");
        for(int i=0;i<getListaRiparazioni().size();i++) {
            if (getListaRiparazioni().get(i).getPriorità() == maxpriority) {
                getListaRiparazioni().get(i).toString();
                break;
            }
        }
    }

    public Riparazione prossimaRiparazione(){
        int maxpriority=0;
        for(int i=0;i<getListaRiparazioni().size();i++){
            if(getListaRiparazioni().get(i).getPriorità()>maxpriority)
                maxpriority=getListaRiparazioni().get(i).getPriorità();
        }
        for(int i=0;i<getListaRiparazioni().size();i++) {
            if (getListaRiparazioni().get(i).getPriorità() == maxpriority) {
                return getListaRiparazioni().get(i);
            }
        }
        return null;
    }

    public void assegnaRiparazione(Riparazione rip,Tecnico tec){
        tec.setRiparazioneassegnata(rip);
    }

    public void mandaInFerie() {
        Scanner input = new Scanner(System.in);
        String nometecnico="";
        while (nometecnico!= "EXIT") {
            System.out.println("quali tecnici mandare in ferie? scrivi EXIT per uscire.");
            nometecnico = input.nextLine();
            for (int i = 0; i < getListaTecnici().size(); i++) {
                if (nometecnico.equals(getListaTecnici().get(i).getNome()))
                    getListaTecnici().get(i).setAvailable(false);
            }
        }

            System.out.println("Tecnici non disponibili o in ferie: ");
            for (int i = 0; i < getListaTecnici().size(); i++) {
                if (getListaTecnici().get(i).isAvailable() == false) {
                    getListaTecnici().get(i).toString();
                }
                System.out.println("----------------------------");
            }
        }


        public void aggiungiRiparazione (Riparazione riparazioneDaAggiungere){
            this.listaRiparazioni.add(riparazioneDaAggiungere);
        }

        public void rimuoviRiparazione (Riparazione riparazioneDaRimuovere){
            this.listaRiparazioni.remove(riparazioneDaRimuovere);
        }

        public void aggiungiTecnico (Tecnico tecnicoDaAggiugnere){
            this.listaTecnici.add(tecnicoDaAggiugnere);
        }

        public void rimuoviTecnico (Tecnico tecnicoDaRimuovere){
            this.listaTecnici.remove(tecnicoDaRimuovere);
        }





        public static void main (String[]args){


        }


    }

