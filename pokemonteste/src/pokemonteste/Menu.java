/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonteste;
import Pokemons.*;
import Pokemons.Pikachu;
import static java.lang.System.in;
import java.util.*;

/**
 *
 * @author crist
 */
public class Menu {
    /**
     * Classe que irá ser responsável pela iteração constante, chamando a classe Locais e mudando entre os locais, após recebimento da insígnia, e verificar 
     * se chegou no limite de insígnia pra zerar o jogo, e salvar.
     * 
     */
    public Menu () {
        
    }
    
    public Menu(String nome, int idade) {
        Treinador coach = new Treinador(nome, idade);
    }
    
    @SuppressWarnings("empty-statement")
    public void rodar() {
        //Aqui ocorrerá todas as chamadas de funções e classe Locais.
        //Caso queira acrescentar funções à essa classe para que seja chamada na main, vá na Classe Tela no pacote Interface, e chame a função 
        // onde está sendo chamada a função rodar() lá, terá um comentário em CapsLock em cima.
        Treinador coach = new Treinador();
        Pikachu pikachu = new Pikachu("Pikachu");
        System.out.println("Você foi designado para treinar um Pikachu, parabéns!!");
        coach.addpokemon(pikachu);
        Scanner teclado = new Scanner (System.in);
        
        //Aqui são criados os ginasios e areas de farm
        int i;
        ArrayList<Locais> mundo = new ArrayList();
        //cria primeira area de farm
        AreaFarm AreaFarm1 = new AreaFarm();
        ArrayList<Pokemon> pokemonsarea = new ArrayList();
        Pokemon tangela = new Tangela ("Tangela");
        for(i=0;i<10;i++)
        {
            pokemonsarea.add(tangela);
        }
        AreaFarm1.preencheLista(pokemonsarea);
        mundo.add(AreaFarm1);
        
        //Primeiro Ginasio
        Ginasio Ginasio1 = new Ginasio();
        Insignia insignia = new Insignia("Cerulean","Eletrico");
        LiderdeGinasio Mitch = new LiderdeGinasio ("Bruxo",43);
        ArrayList<Pokemon> pokemonsgim1 = new ArrayList();
        Pokemon Ratata = new Ratata ("Ratata");
        Pokemon Fearow = new Fearow ("Fearow");
        Mitch.addpokemon(Fearow);
        Mitch.addpokemon(Ratata);
        Ginasio1.treinadores.add(Mitch);
        mundo.add(Ginasio1);
        
        //Area Farm 2
        AreaFarm AreaFarm2 = new AreaFarm();
        ArrayList<Pokemon> pokemonsarea2 = new ArrayList();
        Pokemon rapid = new Rapidash ("Fast Foward");
        for(i=0;i<10;i++)
        {
            pokemonsarea.add(rapid);
        }
        AreaFarm2.preencheLista(pokemonsarea2);
        mundo.add(AreaFarm2);
        
        
        
        
        //ginasio 2
        
      
        Ginasio Ginasio2 = new Ginasio();
        Insignia insignia2 = new Insignia("Pallet","fogo");
        LiderdeGinasio Stan = new LiderdeGinasio ("Stannis the Mannis",43);
        ArrayList<Pokemon> pokemonsgim2 = new ArrayList();
        Pokemon Victreebel = new Victreebel ("Vic");
        Pokemon NineTales = new Ninetales ("Tail");
        Stan.addpokemon(Victreebel);
        Stan.addpokemon(NineTales);
        Ginasio2.addLider(Stan);
        mundo.add(Ginasio1);
        
        
        //Area Farm 3
        
        AreaFarm AreaFarm3 = new AreaFarm();
        ArrayList<Pokemon> pokemonsarea3 = new ArrayList();
        Pokemon Magmar = new Magmar ("Magmar");
        for(i=0;i<10;i++)
        {
            pokemonsarea.add(rapid);
        }
        AreaFarm3.preencheLista(pokemonsarea2);
        mundo.add(AreaFarm3);
        
        VendaPokemon loja = new VendaPokemon();
        int j;
        float preco = (float) 19.50;
        for(j=0;j<10;j++)
        {
            Pokemon Magmar1 = new Magmar ("Magmar",preco,"mag");
            loja.adicioaloja(Magmar1);
        }
        
        
        
        
        
        
        
        
        
        
        
        
        do{
            System.out.println("1 - Enfrentar Pokemons Selvagens");
            System.out.println("2 - Avançar pro ginasio");
            int escolha = teclado.nextInt();
         switch (escolha){
             case 1: mundo.get(0).rodalocal(coach);
             break;
             case 2: mundo.remove(0);
             mundo.get(0).rodalocal(coach);
             break; 
            default: System.out.println("Escolha Inválida!");
            }
         
          
         
        }while(mundo.isEmpty()==false);
        
         
       
    }
        
        
        }