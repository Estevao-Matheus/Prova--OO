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
public class Fearow extends Pokemon implements Ar {

    public Fearow(String nome) {
        this.nome = nome;
    }
    //@return Retorna o nome
    public String nome() {
        return nome;
    }
    @Override
    public void ataqueAnuncio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int chamaAtaque(int i) {
        if (i == 1){
            return hurricane();
        }
        else if(i == 2){
            return wingAttack();
        }
        else if(i == 3){
            return airSlash();
        }
        else if(i == 4){
            return fly();
        }
        return 0;
    }

    @Override
    public int hurricane() {
        System.out.println("Hurricane!");
        super.decreaseEnergy(40);
        return 40;
    }

    @Override
    public int wingAttack() {
        System.out.println("Wing Attack!");
        super.decreaseEnergy(20);
        return 30;
    }

    @Override
    public int airSlash() {
        System.out.println("Air Slash!");
        super.decreaseEnergy(25);
        return 25;
    }

    @Override
    public int fly() {
        System.out.println("Fly!");
        super.decreaseEnergy(10);
        return 20;
    }
    
}
