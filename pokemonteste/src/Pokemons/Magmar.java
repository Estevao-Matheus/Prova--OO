/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pokemons;

import pokemonteste.*;

/**
 *
 * @author crist
 */
public class Magmar extends Pokemon implements Fogo {
    public Magmar(String nome) {
        this.nome = nome;
    }

    public Magmar(String nome,float preco,String som) {
        this.nome = nome;
        this.preço = preco;
        this.Som = som;
    }

    
    
    //@return Retorna o nome
    public String getNome() {
        return nome;
    }

    @Override
    public void ataqueAnuncio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int chamaAtaque(int i) {
        if (i == 1){
            return flameThrower();
        }
        else if(i == 2){
            return inferno();
        }
        else if(i == 3){
            return fireBlast();
        }
        else if(i == 4){
            return flameBurst();
        }
        return 0;
    }

    @Override
    public int flameThrower() {
        System.out.println("Flame Thrower!");
        super.decreaseEnergy(10);
        return 20;
    }

    @Override
    public int inferno() {
        System.out.println("Inferno!");
        super.decreaseEnergy(40);
        return 40;
    }

    @Override
    public int fireBlast() {
        System.out.println("Fire Blast!");
        super.decreaseEnergy(20);
        return 30;
    }

    @Override
    public int flameBurst() {
        System.out.println("Flame Burst!");
        super.decreaseEnergy(25);
        return 25;
    }
}
