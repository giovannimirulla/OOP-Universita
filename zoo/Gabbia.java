/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo;

import java.util.UUID;

/**
 *
 * @author Giovanni Mirulla
 */
public class Gabbia {
    private GenericAnimal[] elenco;
    private int numeroEsemplari;
    private String id;
    
    public Gabbia(){
        this.elenco = new GenericAnimal[4];
        this.numeroEsemplari = 0;
        id = UUID.randomUUID().toString();
        System.out.println("L'ID della gabbia è: "+id);
    }
    public String getID(){
        return id;
    }
    public void addAnimal(GenericAnimal a){
        if (numeroEsemplari<4) this.elenco[numeroEsemplari++] = a;
        else System.out.println("Gabbia piena");
    }
    public int quantitàNecessaria(){
        int s = 0;
        for(int i = 0; i<numeroEsemplari; i++){
            s = s + elenco[i].getQuantità();
        }
        return s;
}
    public void removeAnimal(GenericAnimal a){
          for(int i = 0; i<numeroEsemplari; i++){
          if (elenco[i].equals(a)){
              elenco[i] = elenco[numeroEsemplari-1];
              elenco[numeroEsemplari-1] = null;
              numeroEsemplari--;
              return;
          }
          }
          System.out.println("Animale non presente in questa gabbia");
    } 
    public String toString(){
        String s = "";
          for(int i = 0; i<numeroEsemplari; i++){
                s = s + elenco[i].toString()+"\n";
            } 
          return s;
    }
}
