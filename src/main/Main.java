package main;

import utils.Input;

public class Main {
    static void main(String[] args) {

        String nome = Input.st("Digite o nome da serie");
        String plataforma = Input.st("Digite o nome da plataforma");

        //Instancie uma série sabendo onde ela passa e outra apenas
        Serie serie1 = new Serie(nome, plataforma);

         nome = Input.st("Digite o nome da serie");
        //pelo nome. Imprima os dados na tela.
        Serie serie2 = new Serie(nome);

        System.out.println(serie1.toString());
        System.out.println(serie2.toString());
    }
}
