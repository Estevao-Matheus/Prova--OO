/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonteste;

import java.io.*;
import java.util.*;
import Interface.*;
/**
 *
 * @author eleno
 */
public class Pokemonteste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Tela tela = new Tela();
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    tela.setVisible(true);
                }
            });
            
    }
}