/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo;

import java.io.*;

/**
 *
 * @author Giovanni Mirulla
 */
public class Zoo {

    /**
     * @param args the command line arguments
     */
    public static int menu(BufferedReader bf) throws Exception{ //Stampo il menù
 System.out.println("\nMENU");
 System.out.println("1. Inserisci animale");
 System.out.println("2. Quantità cibo totale");
 System.out.println("3. Stampa animali presenti"); 
 System.out.println("4. Esci");
 System.out.print("−−−−> Inserire la scelta: ");
 return Integer.parseInt(bf.readLine()); //E leggo la prossima scelta
 }
    public static void aggiungiAnimale(BufferedReader bf, Gabbia[] elenco, int numeroGabbie)throws Exception {
        String nome, specie,id;
        int quantità;
        System.out.println("Qual'è l'ID della gabbia?");
        id = bf.readLine();
        for(int i =0; i<numeroGabbie;i++){
            if(elenco[i].getID().equals(id)){
                   System.out.print("Nome:");
        nome = bf.readLine();
        System.out.print("Specie:");
        specie = bf.readLine();
        System.out.print("Quantità cibo:");
        quantità = Integer.parseInt(bf.readLine());
        
        elenco[i].addAnimal(new GenericAnimal( nome,  specie,  quantità));
        return;
            }else System.out.println("Gabbia non trovata");
        }
    
        
    }
    public static void calcoloQuantità(Gabbia[] elenco, int numeroGabbie){
        int s = 0;
        for(int i =0; i<numeroGabbie;i++){
            s = s+elenco[i].quantitàNecessaria();
        }
        System.out.println("Quantità: "+s);
    }
    public static void animaliPresenti(Gabbia[] elenco, int numeroGabbie){
        System.out.println("Animali presenti:");
        for(int i =0; i<numeroGabbie;i++){
            System.out.println(elenco[i].toString());
        }
    }
    public static void main(String[] args) throws Exception {
        Gabbia[] elencoGabbie;
        int numeroGabbie, scelta;
        
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Quante gabbie vuoi gestire?");
        numeroGabbie = Integer.parseInt(bf.readLine());
        elencoGabbie = new Gabbia[numeroGabbie];
        
        while((scelta = menu(bf))!=4){
            switch(scelta){
                case 1:
                    aggiungiAnimale(bf,elencoGabbie,numeroGabbie);
                case 2:
                    calcoloQuantità(elencoGabbie,numeroGabbie);
                case 3:
                    animaliPresenti(elencoGabbie,numeroGabbie);
                default:
                    System.out.println("Non è presente questa opzione");
            }   
        }
        // TODO code application logic here
    }
    
}
