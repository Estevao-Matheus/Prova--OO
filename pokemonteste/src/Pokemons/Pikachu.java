/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pokemons;

import pokemonteste.*;

/**
 *
 * @author eleno
 */
public class Pikachu extends Pokemon implements Eletrico {
    //String ataques[]= {"Thuder Shock(15)","Volt Tackle(20)","Thunder Fang(40)","Shock Wave(20)"};
    
    public Pikachu(String nome) {
        this.nome = nome;
         ataques[0] = "Thuder Shock(15)";
         //ataques[1]  Volt Tackle(20)","Thunder Fang(40)","Shock Wave(20)"};
    }
    //@return Retorna o nome
    public String getNome() {
        return nome;
    }

    @Override
    public void ataqueAnuncio() {
        System.out.println(this.nome + "usa choque do trovão");
    }

    @Override
    public int chamaAtaque(int i) {
        if (i == 1){
            return thunderShock();
        }
        else if(i == 2){
            return voltTackle();
        }
        else if(i == 3){
            return thunderFang();
        }
        else if(i == 4){
            return shockWave();
        }
        return 0;
    }

    @Override
    public int thunderShock() {
        System.out.println("Thunder Shock!");
        super.decreaseEnergy(15);
        return 25;    
    }

    @Override
    public int voltTackle() {
        System.out.println("Volt Tackle!");
        super.decreaseEnergy(20);
        return 30;
    }

    @Override
    public int thunderFang() {
        System.out.println("Thunder Fang!");
        super.decreaseEnergy(40);
        return 40;
    }

    @Override
    public int shockWave() {
        System.out.println("Shock wave!");
        super.decreaseEnergy(15);
        return 20;  
    }
    
    
}
