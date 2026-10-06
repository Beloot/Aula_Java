package aula_05;

public class ControleRemoto {

    //1.Atributos da classe
    private boolean ligado;
    private int volume;

    //1.Contrutores
    public ControleRemoto(){
        this.ligado = false;
        this.volume = 10;
    }

    public ControleRemoto(boolean ligado, int volume){
        this.ligado = ligado;
        this.volume = volume;
    }
    //3. getters e setters
    public boolean isLigado() {
        return ligado; // true or false
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        //Validaçao simples no setters "para proteger o atributo"
        if (volume >=0 && volume <= 100) {
            this.volume = volume;
            System.out.println("Volume alterado:" + this.volume);
        }else{
            System.out.println("Volume inválido");
        }
    }

    //4. Métodos operacionais com logica condicional
    //Ligar e Desligar a TV

    public void LigarDesligar(){
        this.ligado = !this.ligado;
        if(this.ligado) {
            System.out.println("TV LIGADA!!");
        }else{
            System.out.println("TV DESLIGADA!!");
        }
    }
    //Aumentar Volume

    public void aumentarVolume(){
        if(!this.ligado){
            System.out.println("Erro: TV DESLIGADA");
        }else if(this.volume > 100) {
            System.out.println("Aviso: Volume MÁXIMO (100)!");
        }else{
            this.volume++; // this.volume = this.volume + 1;
            System.out.println("Volume aumentado para: " + this.volume);
        }
    }

    //Diminuir Volume
    public void diminuirVolume(){
        if(!this.ligado) {
            System.out.println("Erro: TV DEESLIGA!!");
        } else if (this.volume <= 0) {
            System.out.println("Aviso: A TV já está no MÍNIMO (O)");
        }else {
            this.volume--; //this.volume = this.volume -1;
            System.out.println("Volume diminuindo para: " + this.volume);
        }
    }
}
