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
public class AbitazioneSingola extends Abitazione {
   public AbitazioneSingola(String via, int numeroCivico, int numeroPersone){ //Costruttore con le variabili della classe principale
       super(via, numeroCivico, numeroPersone);
   }
   public String toString(){ //Ritorna una stringa con le tre variabili della classe principale più il numero di auto
       return super.toString()+" - 0";
   }
}
