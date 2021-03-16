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
public class Abitazione implements Comparable{
    private String via; //Dichiaro le variabili di tipo String
    private int numeroCivico, numeroPersone; //Dichiaro le variabili di tipo int
    
    public Abitazione(String via, int numeroCivico, int numeroPersone){ //Costruttore con le oppurtune 3 variabili 
        this.via = via;
        this.numeroCivico = numeroCivico;
        this.numeroPersone = numeroPersone;
    }
    
    
    public String getVia(){ //Un get per la via
      return via;
}
    public void setVia(String via){ //Un set per la via
        this.via = via;
    }
    
    
     public int getNumeroCivico(){ //Un get per sapere il numero civico
      return numeroCivico;
}
    public void setNumeroCivico(int numeroCivico){ //Un set per sapere il numero civico
        this.numeroCivico = numeroCivico;
    }
    
    
     public int getNumeroPersone(){ //Un get per sapere il numero di persone
      return numeroPersone;
}
    public void setNumeroPersone(int numeroPersone){ //Un set per sapere il numero di persone
        this.numeroPersone = numeroPersone;
    }
    
    public int auto(){ //Funzione richiesta solo per le estensioni, ritorna un valore standard, ovvero 0, nonchè valore standard della classe Abitazione singola
        return 0;
    }
    public String toString(){ //Ritorna una stringa contenente le 3 variabili
        return this.via + ", "+this.numeroCivico+" - "+this.numeroPersone;
    }
    public int compareTo(Object o){ //Compara to oggetti
        return this.numeroPersone - ((Abitazione)o).numeroPersone; //Fa la differenza tra il numero di persone della classe in questione e il numero di persone dell'oggetto definendo il tipo, ovvero Abitazione 
    }
}
