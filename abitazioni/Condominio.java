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
public class Condominio extends Abitazione{
    int numeroAuto;
    public Condominio(String via, int numeroCivico, int numeroPersone, int numeroAuto){ //Costruttore con le 3 variabili principali + il numero delle auto
        super(via,numeroCivico,numeroPersone);
        this.numeroAuto = numeroAuto;
    }
    public int auto(){ //Ritorna il numero delle auto
        return numeroAuto;
    }
    
    public int getNumeroAuto(){ //Get per il numero delle auto
        return numeroAuto;
    }
    public void setNumeroAuto(int numeroAuto){ //Set per il numero delle auto
        this.numeroAuto = numeroAuto;
    }
    
    public String toString(){ //Ritorna una stringa contenente tutte le variabili
        return super.toString() + " - "+this.numeroAuto;
    }
}
