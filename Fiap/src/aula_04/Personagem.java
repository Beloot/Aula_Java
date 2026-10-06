package aula_04;

public class Personagem {

    private String nome;
    private int vida;
    private int nivel;

    //Construtores

    //Contrutor padrao
    public Personagem(){
        this.nome = "Novato";
        this.nivel = 1;
        this.vida = 100;
    }

    //Contrutor parametrizado
    public Personagem(String nome, int nivel){
        this.nome = nome;
        this.vida = nivel * 50;
        this.nivel = nivel;
    }



    /*
    Control + botao direito do mouse
    -Generate
    -Getters and Setters
    -Selecionar todas e clicar em generate
     */

    //getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void exibirInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Nivel: " + nivel);
        System.out.println("Vida: " + vida);
    }
}




