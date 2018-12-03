/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonteste;

/**
 *
 * @author 1513 X-MXTI
 */
public class ValorInvalido extends RuntimeException {
    
        public ValorInvalido()
        {
        super("Apenas numeros positivos!");
        }

    void showmessage() {
        System.out.println("Apenas numeros positivos!");
    }
}
