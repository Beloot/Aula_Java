package aula_03;

public class Televisao {

    //encapsulamento - private, public, protected*
    private int canal = 1;
    private int volume = 10;
    private boolean status;

    //Metodos de Acesso e de modificacao (  getters e setters)

    public int getCanal (){
        return this.canal;   // this significa este canal
    }

    public void setCanal(int canal) {
        if(status) { // teste para ver se esta ligada!!
            //Restriçao: faixa valida de 0 a 100
            if (canal >= 0 && canal <= 99) { //&& = and significa que precisa as duas funçoes sejam verdadeiras
                this.canal = canal;
                System.out.println("Canal atual: " + this.canal);
            } else {
                System.out.println("Canal inválido!!");
                System.out.println("Canal ataul: " + this.canal);
            }
        }else{
            System.out.println("[AVISO]: A TV está Desligada! Não e possivel mudar o canal");
        }
    }

    public int getVolume (){
        return this.volume;
    }

    public void setVolume(int volume) {
        //Restriçao: faixa valida de 0 a 100
        if (volume >= 0 && volume <= 99) { //&& = and significa que precisa as duas funçoes sejam verdadeiras
            this.volume = volume;
            System.out.println("Volume atual: " + this.volume);
        } else {
            System.out.println("Volume inválido!!");
            System.out.println("Volume ataul: " + this.volume);
        }

    }


    public boolean getStatus (){
        return this.status;
    }

    public void setStatus (boolean status){
        this.status = status;
    }

    public void ligar(){
        this.status = !this.status; // ! -- quer dizer não
        //if(status == true) pode ser digitado assim tbm!
        if(status) {
            System.out.println("... TV Ligada!");
        }else{
            System.out.println("... TV Desligada");
        }
    }

}