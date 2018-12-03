/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pokemons;
import java.util.*;
import pokemonteste.*;

/**
 *
 * @author eleno
 */
public class Ratata extends Pokemon implements Normal {

    public Ratata(String nome) {
        this.nome = nome;
    }
    //@return Retorna o nome
    public String getNome() {
        return nome;
    }
    @Override
    public void ataqueAnuncio() {
        System.out.println(this.nome + " usa choque do trovão");
    }

    @Override
    public int cometPunch() {
        System.out.println("Comet Punch!");
        super.decreaseEnergy(30);
        return 30;
    }

    @Override
    public int chamaAtaque(int i) {
        if (i == 1){
            return cometPunch();
        }
        else if(i == 2){
            return bite();
        }
        else if(i == 3){
            return quickAttack();
        }
        else if(i == 4){
            return tackle();
        }
        return 0;
    }

    @Override
    public int quickAttack() {
        System.out.println("Quick Attack!");
        super.decreaseEnergy(15);
        return 15;
    }

    @Override
    public int tackle() {
        System.out.println("Tackle!");
        super.decreaseEnergy(10);
        return 12;
    }

    @Override
    public int bite() {
        System.out.println("Bite!");
        super.decreaseEnergy(15);
        return 20;
    }
}
