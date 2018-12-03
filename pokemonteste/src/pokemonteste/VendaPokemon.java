/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonteste;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 1513 X-MXTI
 */
public class VendaPokemon {
    
         ArrayList<Pokemon> pokemonsvenda = new ArrayList();   // pokemons disponiveis pra compra
         ArrayList<Pokemon> pokemonscomprados = new ArrayList(); // "carrinho de compras" do cliente, ia ser armazenado aqui 
         float precototal; // valor total da compra do cliente

        public VendaPokemon() {
            }
         
         
         void adicioaloja(Pokemon pk) // metodo pra que se adcionem os pokemons disponiveis pra venda que vai ser feita
         {
             this.pokemonsvenda.add(pk); 
         }
         
         void comprapokemon(Treinador x) // metodo chamado com treinador pra que os pokemons comprados sejam imediatamente adicionados tambem a sua coleção
         {
             int i;
             int j;
             int controle=1;
             int qtd;
             do
             {
               try
               {   
                        Scanner teclado = new Scanner (System.in);
                        System.out.println("Bem vindo a loja pokemon");
                        System.out.println("Pokemons a venda:");
                        for(i=0;i<pokemonsvenda.size();i++)     // imprime pokemosn disponíveis pra venda
                        {
                            System.out.println(i+""+pokemonsvenda.get(i).nome+""+pokemonsvenda.get(i).preço);
                        }
                        System.out.println("Digite o numero do pokemon que você deseja comprar:");           
                        int escolha = teclado.nextInt();          // le qual pokemon o usuario quer comprar
                        if(escolha<0)
                        {
                            throw new ValorInvalido();
                        }
                        System.out.println("Digite a quantidade de pokemons que você deseja comprar:");
                        qtd = teclado.nextInt();  // a quantidade que ele deseja comprar
                        if(qtd<0)
                        {
                            throw new ValorInvalido();
                        }
                        for(j=0;j<qtd;j++)
                        {    
                            this.pokemonscomprados.add(pokemonsvenda.get(escolha));       // adiciona pokemons ao carrinho e a coleção do treinador 
                            x.addpokemon(pokemonsvenda.get(escolha));
                        }    
                        System.out.println("Digite 1 pra continuar comprando e 0 pra sair da loja");   // verifica se quer continuar comprando ou encerrar a compra
                        controle = teclado.nextInt();
                        if(controle<0)
                        {
                            throw new ValorInvalido();
                        }
                }catch(ValorInvalido e){
                     e.showmessage();
                }
             }while(controle!=0);  
             if(controle==1)
             {
                 System.out.println("Compra Finalizada!!!");
                 finalizacompra(); // chama metodo pra finalizar a compra do usuario
             }
             
         }
         
         void finalizacompra ()  // metodo que finaliza a compra do jogador
         {
             int i;
             for(i=0;i<pokemonscomprados.size();i++)  
             {
                 precototal = precototal + pokemonscomprados.get(i).preço;
             }
            
            try {
                FileWriter treinador = new FileWriter("CompraJogador.txt");
                PrintWriter pw = new PrintWriter(treinador);
                for(i=0;i<pokemonscomprados.size();i++)
                {
                    pw.print(pokemonscomprados.get(i).nome);
                    pw.print(pokemonscomprados.get(i).preço);
                    pw.println();
                }
                pw.println(precototal);
                pw.close();
            } catch (IOException ex) {
                System.out.println("ERRO!!");
            }
         }
         
}