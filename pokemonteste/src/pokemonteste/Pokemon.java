/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonteste;

/**
 *
 * @author eleno
 */
public abstract class Pokemon {
    protected String nome;
    protected int hp = 100, def = 10, turno = -1, energy = 100;
    protected String ataques[] = new String[50];
    protected float preço;
    protected String Som;
    
    
    
    public int chamaAtaque(int i){
        return 0;
    }

    public abstract void ataqueAnuncio();
    @Override
    public String toString(){
        return this.nome;
    }
    
    public void addDef(int def){
        this.def += def;
    }
    
    public void decreaseHp(int damage){
        hp -= damage;
    }
    
     public void decreaseEnergy(int wane){
        energy -= wane;
    }
    
    public void heal() {
        hp = 100;
        energy = 100;
    }
}
