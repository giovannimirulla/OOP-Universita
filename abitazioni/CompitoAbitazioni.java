/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compito.abitazioni;

import java.io.*;

/**
 *
 * @author Giovanni Mirulla
 */
public class CompitoAbitazioni {

    /**
     * @param args the command line arguments
     */
    public static void maxNumeroPersoneCittà(Città[] elenco, int numeroCittà)throws Exception{  //Cerco il numero massimo di persone nelle città
        int max = elenco[0].persone(); //Imposto il massimo al primo elemento
        String nome = elenco[0].getName(); 
        for(int i = 1; i<numeroCittà; i++){ //Ciclo le città
            if (elenco[i].persone() > max){ //Se è maggiore del precedente
                max = elenco[i].persone(); //Cambio valori alle variabili d'appoggio
                nome = elenco[i].getName();
            }
        }
        System.out.println(nome + " - " +max); //Stampo il massimo 
    }
    public static void maxPercentualeAbitazioneSingole(Città[] elenco, int numeroCittà)throws Exception{ //Cerco la percentuale massima
        float max = elenco[0].percentualeAbitazioneSingole(); //Imposto il massimo al primo elemento
        String nome = elenco[0].getName();
        for(int i = 1; i<numeroCittà; i++){ //Ciclo le città
            if (elenco[i].percentualeAbitazioneSingole() > max){ //Se è maggiore del precendente
                max = elenco[i].percentualeAbitazioneSingole(); //Cambio valori alle variabili
                nome = elenco[i].getName();
            }
        }
        System.out.println(nome + " - " +max); //Stampo la percentuale massima
    }
    public static void numeroPostiAuto(Città[] elenco, int numeroCittà)throws Exception{ //Calcolo la somma dei posti auto
        int v = 0; //Variabile d'appoggio
        for(int i = 0; i<numeroCittà; i++){ //Ciclo le città
          v = v + elenco[i].auto(); //Sommo
        }
        System.out.println("Posti totali: " +v); //Stampo il valore
    }
        public static void aggiungereAbitazione(BufferedReader bf, Città[] elenco, int numeroCittà) throws Exception{ //Aggiungo abitazione
        System.out.print("Inserisci il nome della città: "); //Chiedo in quale città
        String nome = bf.readLine();
        
        for(int i = 0; i<numeroCittà; i++){ //Ciclo le città
            if(elenco[i].getName().equals(nome)){ //Sino a trovare quella interessata
                System.out.print("In che via: ");
                String via = bf.readLine();
                System.out.print("Numero civico: ");
                int numeroCivico = Integer.parseInt(bf.readLine());
                System.out.print("Numero persone: ");
                int numeroPersone = Integer.parseInt(bf.readLine());
                System.out.print("Numero auto: ");
                int numeroAuto = Integer.parseInt(bf.readLine()); //Leggo e inizializzo i valori
                if (numeroAuto>0) elenco[i].addHome(new Condominio( via,  numeroCivico,  numeroPersone,  numeroAuto)); //Creo e aggiungo all'elenco un condominio se il numero dei posti auto è maggiore di 0
                else elenco[i].addHome(new AbitazioneSingola(via, numeroCivico, numeroPersone)); //In caso contrario aggiungo una casa singola
                return;
            }
        }
        System.out.println("Non esiste questa città"); //Se il nome non viene trovato in lista
        }
    public static int creaCittà(BufferedReader bf, Città[] elenco, int numeroCittà) throws Exception{ //Creo una città
        System.out.print("Inserisci il nome: ");
        String nome = bf.readLine();
        System.out.print("Quante abitazioni: ");
        int maxNum = Integer.parseInt(bf.readLine()); //Leggo i valori
        elenco[numeroCittà] = new Città(nome, maxNum); //Imposto l'oggetto Città alla poszione numeroCittà dell'elenco
        return ++numeroCittà; //Incremento e restituisco il numero delle città
    }
        public static int menu(BufferedReader bf) throws Exception{ //Stampo il menù
 System.out.println("\nMENU");
 System.out.println("1. Creare una nuova citta");
 System.out.println("2. Aggiungere un'abitazione");
 System.out.println("3. Stampare il nome della citta con il numero di abitanti maggiore"); 
 System.out.println("4. Stampare il nome della citta in cui il numero di AbitazioniSingole sia maggiore in percentuale");
 System.out.println("5. Stampare il numero di posti auto totali nelle citta");
 System.out.println("6. Uscire");
 System.out.print("−−−−> Inserire la scelta: ");
 return Integer.parseInt(bf.readLine()); //E leggo la prossima scelta
 }

    public static void main(String[] args) throws Exception{  
        Città[] elencoCittà; //Creo elenco città
        int numeroCittà = 0, sceltaMenu, max; //Inizializzo e dichiato le variabili int, numero delle Città, la scelta del menù e il massimo numero di città
        
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //Creo un BufferedReader per leggere in input dalla tastiera
        System.out.println("Quante città vuoi gestire?");
        max = Integer.parseInt(bf.readLine());
        elencoCittà = new Città[max]; //Inizializzo l'elenco con il valore massimo inserito

        while ((sceltaMenu = menu(bf)) != 6){ //Ciclo il menù se la scelta è diversa da 6
            switch (sceltaMenu){ 
                case 1:
                    if (numeroCittà == elencoCittà.length) System.out.println("Elenco pieno"); //Se l'elenco è pieno
                    else numeroCittà = creaCittà(bf,elencoCittà,numeroCittà); //Oppure creo la città
                    break;
                case 2:
                    aggiungereAbitazione(bf,elencoCittà, numeroCittà); //Aggiungo abitazione
                    break;
                case 3:
                    if (numeroCittà > 0)maxNumeroPersoneCittà(elencoCittà,numeroCittà); //Se l'elenco è pieno cerco il numero massimo di persone
                    else System.out.println("Non ci sono città");
                    break;
                case 4:
                    if (numeroCittà > 0) maxPercentualeAbitazioneSingole(elencoCittà,numeroCittà); //Se l'elenco è pieno cerco la percentuale massima di case singole nella città
                    else System.out.println("Non ci sono città");
                    break;
                case 5:
                    if (numeroCittà > 0)numeroPostiAuto(elencoCittà,numeroCittà); //Se l'elenco è pieno sommo e ritorno i posti auto
                    else System.out.println("Non ci sono città");
                    break;
                default:
                    System.out.println("Non esiste questa opzione"); //Se l'opzione non è presente
                    break;
        }
        }
    }

}
