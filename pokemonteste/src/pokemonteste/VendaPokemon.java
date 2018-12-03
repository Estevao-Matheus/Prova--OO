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
    
        // como o tempo não deu pra instanciar pokemons de brinquedo pra fazer as vendas coloquei aqui com os pokemons reais mas basta mudar o tipo de ArrayList e de instancia pra
        // pokemons de brinquedo
    
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
                            System.out.println(i+" Nome: "+pokemonsvenda.get(i).nome+" Preço "+pokemonsvenda.get(i).preço);
                        }
                        System.out.println("Digite o numero do pokemon que você deseja comprar:");           
                        int escolha = teclado.nextInt();          // le qual pokemon o usuario quer comprar
                        if(escolha<0)
                        {
                              throw new ValorInvalido("Apenas numeros positivos, valores negativo não permitidos!");
                        }
                        System.out.println("Digite a quantidade de pokemons que você deseja comprar:");
                        qtd = teclado.nextInt();  // a quantidade que ele deseja comprar
                        if(qtd<0)
                        {
                            throw new ValorInvalido("Apenas numeros positivos, valores negativo não permitidos!");
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
                            throw new ValorInvalido("Apenas numeros positivos, valores negativo não permitidos!");
                        }
                }catch(ValorInvalido e){
                     System.out.println(e.getMessage());
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
                FileWriter fw = new FileWriter("CompraJogador.txt");
                PrintWriter pw = new PrintWriter(fw);
                for(i=0;i<pokemonscomprados.size();i++)
                {
                    pw.print("Nome:"+pokemonscomprados.get(i).nome);
                    pw.print("Preço:"+pokemonscomprados.get(i).preço);
                    pw.println();
                }
                pw.println("Preço total da compra"+precototal);
                pw.close();
            } catch (IOException ex) {
                System.out.println("ERRO!!");
            }
         }
         
}
