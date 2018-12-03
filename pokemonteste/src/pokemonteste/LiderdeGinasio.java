/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonteste;

import pokemonteste.Treinador;

/**
 *
 * @author 1513 X-MXTI
 */
public class LiderdeGinasio extends Treinador {
                       

    public LiderdeGinasio() {
    }

    public LiderdeGinasio(String nome, int idade) {
        super(nome, idade);
    }
    void passainsignia(Treinador x)
   {
       x.insignias.add(this.insignias.get(0)); //zero por que lider de ginasio só terá uma insgnia na lista de insignias
       
   }
    
}
