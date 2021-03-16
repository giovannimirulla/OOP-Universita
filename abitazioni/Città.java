/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compito.abitazioni;

/**
 *
 * @author Giovanni Mirulla
 */
public class Città {
    private String nome; //Dichiaro le variabili di tipo String
    private Abitazione[] elencoAbitazioni; //Dichiaro l'elenco di tipo Abitazione
    private int numeroAbitazioni; //Dichiaro le variabili di tipo int
    
    public Città(String nome, int maxNum){  //Costruttore della classe   
        this.nome = nome; //dove instanzio nome
        this.elencoAbitazioni = new Abitazione[maxNum]; //l'elenco con il numero massimo di abitazioni
        this.numeroAbitazioni = 0; //e infine inizializzo la variabile contenente il numero di abitazioni
    }
    public void addHome(Abitazione a){ //Funzione per aggiungere un'abitazione
        if(elencoAbitazioni.length == numeroAbitazioni){ //Se l'elenco è pieno
            System.out.println("Errore"); //Stampa un errore
            return;
        }else elencoAbitazioni[numeroAbitazioni++] = a; //In caso contratio aggiungere un abitazione incrementando anche il numero di abitazioni presenti
    }
    public int auto(){ //Funzione che ritorna il numero di auto presenti in tutta la città
        int v = 0; //Inizializzo una variabile de'appoggio
        for(int i = 0; i < elencoAbitazioni.length; i++){ //Ciclo l'elenco delle abitazioni
            v = v + elencoAbitazioni[i].auto(); //Addizione alla variabile d'appoggio le auto presenti
        }
        return v; //Restituisco la variabile d'appoggio
    }
    public float percentualeAbitazioneSingole(){ //Calcolo il valore in percentuale delle case singole in città (Funzione 4 menù)
        int abitazioniSingole = 0;
        for(int i = 0; i < elencoAbitazioni.length; i++){ //Ciclo l'elenco delle abitazioni
            if (elencoAbitazioni[i].auto() == 0) abitazioniSingole++; //Addizione alla variabile d'appoggio le auto presenti
        }
        return (100*abitazioniSingole/numeroAbitazioni);
    }
    public int persone(){ //Funzione che ritotna il numero di persone presenti in tutta la città
        int p = 0; //Inizializzo una variabile de'appoggio
        for(int i = 0; i < elencoAbitazioni.length; i++){//Ciclo l'elenco delle abitazioni
            p = p + elencoAbitazioni[i].getNumeroPersone(); //Addizione alla variabile d'appoggio le persone presenti
        }
        return p; //Restituisco la variabile d'appoggio
    }
    public void removeHome(String via, int numeroCivico){ //Funzione che rimuove l'abitazione mediante la via e il numero civico
      for(int i = 0; i <= elencoAbitazioni.length; i++){ //Ciclo l'elenco delle abitazioni
          if(elencoAbitazioni[i].getVia().equals(via) && elencoAbitazioni[i].getNumeroCivico() == numeroCivico){ //Se trova una corrispondenza tra gli oggetti in elenco
              elencoAbitazioni[i] = elencoAbitazioni[numeroAbitazioni - 1]; //Sposto l'ultimo oggetto in elenco al medesimo individiato
              elencoAbitazioni[numeroAbitazioni -1 ] = null; //Rendo nullo l'ultimo
              numeroAbitazioni -= 1; //Decremento il numero di abitazioni
              return;
          }else System.out.println ("Abitazione " + via + " − " + numeroCivico + " non trovata in questa citta."); //In caso contrario ritorno una stringa
      }
}
    
    public String getName(){ //Funzione che mi ritorna il nome della città
        return nome; //Funzione utilizzata per la 3 e 4 opzione del menù
    }
}
