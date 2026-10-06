package aula_04;

import java.util.Scanner;

public class PersonagemTeste {               /*orientaçao ao objeto */
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        //1. Usando o contrutor padrao (default)
        Personagem p1 = new Personagem();
        Personagem p3 = new Personagem();
        //2.Usando o contrutor parametizado
        Personagem p2 = new Personagem("Intermediário",10);
        Personagem p4 = new Personagem("avançado", 10);

        /*
        System.out.println("Dados do P1");
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Nivel: " + p1.getNivel());
        System.out.println("Vida: " + p1.getVida());

        System.out.println("Dados do P3");
        System.out.println("Nome: " + p3.getNome());
        System.out.println("Nivel: " + p3.getNivel());
        System.out.println("Vida: " + p3.getVida());

        System.out.println("----------------------------------");

        System.out.println("Dados do P2");
        System.out.println("Nome: " + p2.getNome());
        System.out.println("Nivel: " + p2.getNivel());
        System.out.println("Vida: " + p2.getVida());
        System.out.println("Dados do P4");
        System.out.println("Nome: " + p4.getNome());
        System.out.println("Nivel: " + p4.getNivel());
        System.out.println("Vida: " + p4.getVida());
         */

        //imprimindo os dados com exibirInfo()
        p1.exibirInfo();
        System.out.println("-----------------");
        p3.exibirInfo();
        System.out.println("------------------");
        p2.exibirInfo();
        System.out.println("-------------------");
        p4.exibirInfo();
        System.out.println("--------------------");

        //Execução com Scanner (interaçao com o usuario)
        System.out.println("Nome do Personagem: ");
        String nome = input.next();
        System.out.println("Nivel do Personagem: ");
        int nivel = input.nextInt();

        Personagem p5 = new Personagem(nome, nivel);
        p5.exibirInfo();
        System.out.println("-------------");

    }

}
