package aula;


public class Carro {
    //Atributos (caracteristica)
    String marca;
    String modelo;
    String cor;
    int velocidadeAtual;

    //Metodos (comportamento)
    void acelerar(){
        System.out.println("Acelerando....");
        velocidadeAtual = velocidadeAtual + 10;
        System.out.println("O carro acelerou! Velocidade: " + velocidadeAtual + "km/h");
    }
    void freiar(){
        System.out.println("Freiando....");
        velocidadeAtual = velocidadeAtual - 10;
        System.out.println("o carro esta freiando! Velocidade: " + velocidadeAtual + "km/h");

    }






}
