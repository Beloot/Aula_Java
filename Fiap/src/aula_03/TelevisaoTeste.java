package aula_03;

public class TelevisaoTeste {

    public static void main(String[] args){

        System.out.println("--- Minha Televisão ---");

        //criando objeto de Televisao
        Televisao tv = new Televisao();
        System.out.println("--- Tentando usar a Televisão Desligada ---");

        System.out.println("Status: "+ tv.getStatus());
        System.out.println("Canal: " + tv.getCanal());
        System.out.println("Volume: " + tv.getVolume());

        //modificar os valores dos atributos
        tv.setCanal(1);
        //tv.canal = -3;

        System.out.println("Ligando a tv ....");
        tv.ligar();

        System.out.println("--- Ajustando as configurações ---");
        tv.setCanal(5);
        //tv.canal = 1

        tv.setVolume(3);
        //tv.volume = 20;
        System.out.println("--- mudando o volume ---");
        tv.setVolume(80);

        tv.setStatus(true);
        //tv.ligada = true;

        System.out.println("\n-------------------------------\n");

        System.out.println("Canal: " + tv.getCanal());
        System.out.println("Volume: " + tv.getVolume());
        System.out.println("Ligada: " + tv.getStatus());


    }
}