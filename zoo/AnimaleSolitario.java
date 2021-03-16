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
public class AnimaleSolitario extends GenericAnimal{
    private int etàMedia;
    public AnimaleSolitario(String nome, String specie, int quantitàCibo, int etàMedia){
        super(nome,specie,quantitàCibo,false);
        this.etàMedia = etàMedia;
    }
    
    public int getEtàMedia(){
        return etàMedia;
    }
    public void setEtàMedia(int etàMedia){
        this.etàMedia = etàMedia;
    }
    
        public String toString(){
            return super.toString() + " - " + etàMedia;
        }
    
}
