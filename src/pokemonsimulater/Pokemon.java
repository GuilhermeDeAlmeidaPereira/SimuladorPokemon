package pokemonsimulater;

public class Pokemon {
    
    // ATRIBUTOS
    private String nome;
    private String tipo;
    private int level;
    private int vida;
    private int ataque;
    private int defesa;
   
     
    
    // CONSTRUTOR
    public Pokemon(String nome, String tipo, int level) {
        this.nome = nome;
        this.tipo = tipo;
        this.level = level;
    
        calculaAtributos();
        calculaBonus();
        imprimiPokemon();
       
    }
    
    // METODOS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }
    
     public void imprimiPokemon(){
        
        System.out.println(
                "Nome: " + nome + " | " + 
                    "Tipo: " + tipo + " | " + 
                        "Level: " + level + " | " + 
                            "Vida: " + vida + " | " +
                                "Ataque: " + ataque + " | " +
                                    "Defesa: " + defesa + "\n");
        
    }   
      private void calculaBonus(){
        
        vida = vida + (level / 3);
        ataque = ataque + (level / 4);
        defesa = defesa + (level / 2);
        
    }   
     //Métodos que podem ser usados por um objeto do tipo pokemon    
   public void calculaAtributos() {
            switch(this.tipo) {
                case "Fogo":
                this.vida = 100;
                this.ataque = 60;
                this.defesa = 35;
                break;
                
                case "Agua":
                this.vida = 90;
                this.ataque = 40;
                this.defesa = 60;    
                break;
                
                case "Terra":
                this.vida = 80;
                this.ataque = 90;
                this.defesa = 80;    
                break;
                
                case "Planta":
                this.vida = 120;
                this.ataque = 50;
                this.defesa = 75;    
                break;
                
                case "Eletrico":
                this.vida = 120;
                this.ataque = 50;
                this.defesa = 75;    
                break;
                
                case "Fada":
                this.vida = 120;
                this.ataque = 50;
                this.defesa = 75;    
                break;
            }
    }    
}
