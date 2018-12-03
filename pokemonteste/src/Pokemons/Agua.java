/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pokemons;

/**
 *
 * @author crist
 */
interface Agua {
    
    String Ataques[]= {"Ice Beam(25)","Bubble Beam(10)","Hydro Pump(20)","Hydro Cannon(40)"};
    
    
    int chamaAtaque(int i);
    
    int iceBeam();
    int bubbleBeam();
    int hydroPump();
    int hydroCannon();
    
    
}
