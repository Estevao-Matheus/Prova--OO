/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonteste;

import java.util.ArrayList;

/**
 *
 * @author 1513 X-MXTI
 */
public class Ginasio extends Locais {
            
                    ArrayList<LiderdeGinasio> treinadores = new ArrayList();
                    boolean derrotado = false;
                   
                    
                    @Override
                    public void rodalocal (Treinador x)
                    {
                        
                        while(treinadores.isEmpty()==false||derrotado == false)
                        {
                            
                            while (x.pokemons.isEmpty()==false||treinadores.get(0).pokemons.isEmpty()==false)
                            {    
                                batalha.treinadorvstreinador(x, treinadores.get(0));
                                if(x.pokemons.get(0).hp==0)
                                {
                                    x.pokemons.remove(0);
                                }
                                if(treinadores.get(0).pokemons.get(0).hp==0)
                                {
                                    treinadores.get(0).pokemons.remove(0);
                                }
                            
                           }    
                           if(treinadores.get(0).pokemons.isEmpty())
                           {   
                                if(treinadores.size()==1)
                                {
                                    treinadores.get(0).passainsignia(x);
                                }
                            
                                treinadores.remove(0);
                           } 
                        
                            if(x.pokemons.isEmpty())
                            {
                                derrotado = true;
                                System.out.println("Voce foi derrotado!");
                            }
                        }
                        if(treinadores.isEmpty())
                        {
                            System.out.println("Voce venceu!!!"); 
                           
                        }
                    
                    }    
                         
                   void addLider (LiderdeGinasio lider)
                   {
                        this.treinadores.add(lider);
                   }
                        
                   
                        
                        
                        
  }
                    
                    
