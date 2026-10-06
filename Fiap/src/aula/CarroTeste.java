package aula;

public class CarroTeste {
    public static void main(String[] args){

        Carro carro1 = new Carro();
        carro1.marca = "Jeep";
        carro1.modelo = "Compass";
        carro1.cor = "Azul";
        carro1.velocidadeAtual = 30;

        System.out.println("Marca: " + carro1.marca);
        System.out.println("Modelo: " + carro1.modelo);
        System.out.println("Cor: " + carro1.cor );
        System.out.println("velocidade: " + carro1.velocidadeAtual);

        System.out.println("\n------------------------------------------\n");

        // criando o objeto carro2 so tipo Carro
        Carro carro2 = new Carro();
        carro2.marca =  "Fiat";
        carro2.modelo = "Mobi";
        carro2.cor = "Preto";
        carro2.velocidadeAtual  = 40;

        System.out.println("Marca: " + carro2.marca);
        System.out.println("Modelo: " + carro2.modelo);
        System.out.println("Cor: " + carro2.cor );
        System.out.println("Velocidade: " + carro2.velocidadeAtual);

        System.out.println("\n------------------------------------------\n");
        System.out.println(" --- Açoes do " + carro1.modelo + "---");
        carro1.acelerar();
        carro1.acelerar();
        System.out.println(" --- Açoes do " + carro2.modelo + "---");
        carro2.freiar();
        System.out.println("Velocidade atual do: " + carro1.velocidadeAtual);
        System.out.println("Velocidade atual do: " + carro2.velocidadeAtual);

    }

}
