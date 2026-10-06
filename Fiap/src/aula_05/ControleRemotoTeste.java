package aula_05;

public class ControleRemotoTeste {
    public static void main(String[] args) {

        ControleRemoto cr = new ControleRemoto();

        System.out.println("Ligado: " + cr.isLigado());
        System.out.println("Volume: " + cr.getVolume());

        //Teste 1: Tentar aumentar o volume com a TV desligada
        System.out.println("---  Teste 1 ---");
        cr.aumentarVolume();

        //Teste 2: ligar a TV e aumentar o volume
        System.out.println("---- Teste 2 ---");
        cr.LigarDesligar();
        cr.aumentarVolume();
        cr.aumentarVolume();
        cr.setVolume(30);
        System.out.println("Volume: " + cr.getVolume());

        //Teste 3: Digitar um valor invalido para o volume
        System.out.println("---- Teste 3 ---");
        cr.setVolume(200);
        System.out.println("Volume: " + cr.getVolume());
    }
}
