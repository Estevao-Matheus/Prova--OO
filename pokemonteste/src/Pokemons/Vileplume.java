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
public class Vileplume extends Pokemon implements Grama{
    
    public Vileplume(String nome) {
        this.nome = nome;
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
            return vineWhip();
        }
        else if(i == 2){
            return solarBeam();
        }
        else if(i == 3){
            return razorLeaf();
        }
        else if(i == 4){
            return powerWhip();
        }
        return 0;
    }

    @Override
    public int vineWhip() {
        System.out.println("Vine Whip!");
        super.decreaseEnergy(25);
        return 25;
    }

    @Override
    public int solarBeam() {
        System.out.println("Solar Beam!");
        super.decreaseEnergy(40);
        return 40;
    }

    @Override
    public int razorLeaf() {
        System.out.println("Razor Leaf!");
        super.decreaseEnergy(20);
        return 30;
    }

    @Override
    public int powerWhip() {
        System.out.println("Power Whip!");
        super.decreaseEnergy(10);
        return 20;
    }
}
