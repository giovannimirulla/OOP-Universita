/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo;

/**
 *
 * @author Giovanni Mirulla
 */
public class AnimaleDiGruppo extends GenericAnimal{
    private GenericAnimal[] altriAnimali;
    private int maxAnimals = 3;
    public AnimaleDiGruppo(String nome, String specie, int quantitàCibo, GenericAnimal[] elenco){
        super(nome,specie,quantitàCibo,false);
        altriAnimali = new GenericAnimal[maxAnimals];
        setAltriAnimali(elenco);
    }
    public void setAltriAnimali(GenericAnimal[] elenco){
        if (elenco.length <= maxAnimals){
            for(int i = 0; i<maxAnimals; i++){
                altriAnimali[i] = elenco[i];
            }
        }
    }
    public GenericAnimal[] getAltriAnimali(){
        return altriAnimali;
    }
    public String toString(){
        String s = super.toString() + " in gabbia con:\n";
        for(int i = 0; i<maxAnimals; i++){
                s = s + altriAnimali[i].toString()+"\n";
            }    
        return s;
    }
}
