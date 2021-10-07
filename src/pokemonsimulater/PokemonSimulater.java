
package pokemonsimulater;
import java.util.Scanner;
public class PokemonSimulater {

    public static void main(String[] args) {
        
        //DECLARAR VARIASVEIS
      int menu1 = 0, menu2 = 0, sair=1;
      int lutador1 = 0, lutador2 =0;
      String Nomelutador1 = null, Nomelutador2 = null;
      
         //INSTANCIAR UM OBJETO
      Pokemon pokemon1 = new Pokemon("Charmander", "Fogo", 10); 
      Pokemon pokemon2 = new Pokemon("Picachu", "Eletrico", 20);
      Pokemon pokemon3 = new Pokemon("Blastoise", "Agua", 30);
      Pokemon pokemon4 = new Pokemon("graveler", "Terra", 40);
      Pokemon pokemon5 = new Pokemon("Bulbassauro", "Planta",50 );
      Pokemon pokemon6 = new Pokemon("Butterfree", "Fada",50 );
      Scanner ler = new Scanner (System.in);
       int vidaPokemon1, vidaPokemon2, vidaPokemon3, vidaPokemon4, vidaPokemon5, vidaPokemon6;
            
       
       
       
       //MENU DE OPÇÕES PARA O PRIMEIRO POKEMON
       System.out.println("Menu de opções");
        System.out.println("Escolha o primeiro pokemon");
            System.out.println("Digite 1 para escolher o Charmander;"
                    + " \nDigite 2 para escolher o Picachu;"
                    + " \nDigite 3 para escoher o Blastoise "
                    + " \nDigite 4 para escoher o graveler "
                    + " \nDigite 5 para escoher o Bulbassauro "
                    + " \nDigite 6 para escoher o Butterfree "
                    + " \nDigite 0 para SAIR DA BATALHA ");
                menu1 = ler.nextInt();
                
                switch (menu1){
                    case (1):
                        System.out.println("Você escolheu o Charmander");
                         vidaPokemon1 = pokemon1.getVida();
                         System.out.println("Vida " + pokemon1.getNome() + " = " + pokemon1.getVida());
                         lutador1 = pokemon1.getVida();
                         Nomelutador1 = pokemon1.getNome();
                        break;
                        
                    case (2):
                        System.out.println("Voce escolheu o Picachu ");
                         vidaPokemon2 = pokemon2.getVida();
                         System.out.println("Vida " + pokemon2.getNome() + " = " + pokemon2.getVida());
                        lutador1 = pokemon2.getVida();
                        Nomelutador1 = pokemon2.getNome();

                        break;
                        
                    case (3):
                        System.out.println("Voce escolheu o Blastoise ");
                         vidaPokemon3 = pokemon3.getVida();
                          System.out.println("Vida " + pokemon3.getNome() + " = " + pokemon3.getVida());
                          lutador1 = pokemon3.getVida();
                          Nomelutador1 = pokemon3.getNome();

                        break;
                        
                    case (4):
                        System.out.println("Voce escolheu o graveler ");
                         vidaPokemon4 = pokemon4.getVida();
                          System.out.println("Vida " + pokemon4.getNome() + " = " + pokemon4.getVida());
                          lutador1 = pokemon4.getVida();
                          Nomelutador1 = pokemon4.getNome();
                        break;    
                    case (5):
                        System.out.println("Voce escolheu o Bulbassauro ");
                         vidaPokemon5 = pokemon5.getVida();
                          System.out.println("Vida " + pokemon5.getNome() + " = " + pokemon5.getVida());
                          lutador1 = pokemon5.getVida();
                          Nomelutador1 = pokemon5.getNome();

                        break;    
                    case (6):
                        System.out.println("Voce escolheu o Butterfree ");
                         vidaPokemon6 = pokemon6.getVida();
                          System.out.println("Vida " + pokemon6.getNome() + " = " + pokemon6.getVida());
                           lutador1 = pokemon6.getVida();
                           Nomelutador1 = pokemon6.getNome();
                    break;    
                    case (0):
                        System.out.println("OBRIGADO, VOLTE SEMPRE!!");
                        sair = -1;
                        System.exit(0);
                        break;
                }
                
                  //MENU DE OPÇÕES PARA O SEGUNDO POKEMON
                System.out.println("");
                System.out.println("Escolha o segundo pokemon");
                 System.out.println("Digite 1 para escolher o Charmander;"
                    + " \nDigite 2 para escolher o Picachu;"
                    + " \nDigite 3 para escoher o Blastoise "
                    + " \nDigite 4 para escoher o graveler "
                    + " \nDigite 5 para escoher o Bulbassauro "
                    + " \nDigite 6 para escoher o Butterfree "
                    + " \nDigite 0 para SAIR DA BATALHA ");
                menu2 = ler.nextInt();
                 switch (menu2){
                    case (1):
                        System.out.println("Você escolheu o Charmander");
                         vidaPokemon1 = pokemon1.getVida();
                         System.out.println("Vida " + pokemon1.getNome() + " = " + pokemon1.getVida());
                         lutador2 = pokemon1.getVida();
                         Nomelutador2 = pokemon1.getNome();
                        break;
                        
                    case (2):
                        System.out.println("Voce escolheu o Picachu ");
                         vidaPokemon2 = pokemon2.getVida();
                         System.out.println("Vida " + pokemon2.getNome() + " = " + pokemon2.getVida());
                         lutador2 = pokemon2.getVida();
                         Nomelutador2 = pokemon2.getNome();
                        break;
                        
                    case (3):
                        System.out.println("Voce escolheu o Blastoise ");
                         vidaPokemon3 = pokemon3.getVida();
                          System.out.println("Vida " + pokemon3.getNome() + " = " + pokemon3.getVida());
                         lutador2 = pokemon3.getVida();
                         Nomelutador2 = pokemon3.getNome();
                        break;
                        
                    case (4):
                        System.out.println("Voce escolheu o graveler ");
                         vidaPokemon4 = pokemon4.getVida();
                          System.out.println("Vida " + pokemon4.getNome() + " = " + pokemon4.getVida());
                         lutador2 = pokemon4.getVida();
                         Nomelutador2 = pokemon4.getNome();
                        break;    
                    case (5):
                        System.out.println("Voce escolheu o Bulbassauro ");
                         vidaPokemon5 = pokemon5.getVida();
                          System.out.println("Vida " + pokemon5.getNome() + " = " + pokemon5.getVida());
                          lutador2 = pokemon5.getVida();
                          Nomelutador2 = pokemon5.getNome();
                        break;    
                    case (6):
                        System.out.println("Voce escolheu o Butterfree ");
                         vidaPokemon6 = pokemon6.getVida();
                          System.out.println("Vida " + pokemon6.getNome() + " = " + pokemon6.getVida());
                        lutador2 = pokemon6.getVida();
                        Nomelutador2 = pokemon6.getNome();
                    break;    
                    case (0):
                        System.out.println("OBRIGADO, VOLTE SEMPRE!!");
                        sair = -1;
                        System.exit(0);
                        break;
                }
        System.out.println("");
        
        
        // BATALHA DOS POKEMONS
        
        if (lutador1 > lutador2) {
            System.out.println( "O " +Nomelutador1+ " venceu");
        }else if (lutador1 == lutador2){
            System.out.println("Empate!");        
        }else if ( lutador2 > lutador1){        
            System.out.println("O " +Nomelutador2+ " venceu");
        }    
  
    }
}
    
