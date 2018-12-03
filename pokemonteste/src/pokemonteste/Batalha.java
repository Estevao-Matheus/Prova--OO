/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonteste;

import java.util.Random;

/**
 *
 * @author 1513 X-MXTI
 */
public class Batalha {
                
                int turno=1, danox, danoy;
                Random rand = new Random();
   
            void pokemonvspokemon(Treinador x,Pokemon y)
            {
                while(x.pokemons.get(0).hp !=0|| y.hp !=0)
                {
                    
                    danox = x.pokemons.get(0).chamaAtaque(x.chamaataque());
                    danoy = y.chamaAtaque(1 + rand.nextInt((4 - 1) + 1));
                    y.hp -= danox-y.def;
                    x.pokemons.get(0).hp -= danoy-x.pokemons.get(0).def;
                }
                
                
             
            }
           void treinadorvstreinador (Treinador x,LiderdeGinasio y)
           {
               
               while(x.pokemons.get(0).hp !=0|| y.pokemons.get(0).hp !=0)
                {
                    
                    danox = x.pokemons.get(0).chamaAtaque(x.chamaataque());
                    danoy = y.pokemons.get(0).chamaAtaque(1 + rand.nextInt((4 - 1) + 1));
                    y.pokemons.get(0).hp -= danox-y.pokemons.get(0).def;
                    x.pokemons.get(0).hp -= danoy-x.pokemons.get(0).def;
                }
                
               
               
           }
}
