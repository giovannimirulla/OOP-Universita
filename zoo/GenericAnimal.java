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
public class GenericAnimal implements Comparable{
    private String nome;
    private String specie;
    private int quantitàCibo;
    private boolean inGabbia;
    
    public GenericAnimal(String nome, String specie, int quantitàCibo){
        this.nome = nome;
        this.specie = specie;
        this.quantitàCibo = quantitàCibo;
    }
    public GenericAnimal(String nome, String specie, int quantitàCibo, boolean inGabbia){
        this.nome = nome;
        this.specie = specie;
        this.inGabbia = inGabbia;
    }
    
    public boolean getInGabbia(){
        return inGabbia;
    }
    public void setInGabbia(boolean inGabbia){
        this.inGabbia =inGabbia;
    }
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome =nome;
    }
    
    public String getSpecie(){
        return specie;
    }
    public void setSpecie(String specie){
        this.specie =specie;
    }
    
     public int getQuantità(){
        return quantitàCibo;
    }
    public void setQuantità(int quantitàCibo){
        this.quantitàCibo =quantitàCibo;
    }
    
    public String toString(){
        return nome+":"+specie+","+quantitàCibo + "\nIn gabbia: "+inGabbia;
    }

    @Override
    public int compareTo(Object o) {
        return quantitàCibo - ((GenericAnimal)o).quantitàCibo;
    }
    
    @Override
    public boolean equals(Object o){
        return ((GenericAnimal)o).specie.equals(specie);
    }
}
