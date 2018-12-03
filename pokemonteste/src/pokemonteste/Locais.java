    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */
package pokemonteste;

import Pokemons.*;
import java.util.*;

    /**
     *
     * @author eleno
     */
    public class Locais {

    String Nome;
    String Tipo;
    int    ExperienciaPadrao;// atributo pra calcular experiencia obtida por pokemons selvagens da area de farm
    Batalha batalha = new Batalha(); 
    public Locais(){};
    
    
    
    public void setExperiencia(int exp)
    {
        this.ExperienciaPadrao = exp;
    }
    public void rodalocal(Treinador X)
    {
        
    }
   
  
}
        /* aqui será instanciado todos os locais, como os ginásios e os lugares secundário para farmar xp
        * atributos basicos: nome, pokemons e está atrelado a batalha, pois aqui ocorrerá as batalhas
        * os ginasios tem insignias para facilitar o controle de quando o jogo é completo
        */

