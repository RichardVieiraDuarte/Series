package main;

import utils.Input;

public class Main {
    static void main(String[] args) {

        Catalogo catalogo = new Catalogo();

        String nome = Input.st("Digite o nome da serie:");
        String plataforma = Input.st("Digite o nome da plataforma:");


        //Instancie uma série sabendo onde ela passa e outra apenas
        Serie serie1 = new Serie(nome, plataforma);

         nome = Input.st("Digite o nome da serie: ");
        //pelo nome. Imprima os dados na tela.
        Serie serie2 = new Serie(nome);

        System.out.println(serie1.getNome());
        serie1.setNota(Input.db("Informe uma nota:"));

        System.out.println(serie2.getNome());
        serie2.setNota(Input.db("Informe uma nota:"));

        System.out.println(serie1.toString());
        System.out.println(serie2.toString());


        System.out.println("Criando um catálogo de três séries:");

            Serie serieUm = new Serie(nome, plataforma);
            serieUm.setNome(Input.st("Digite o nome da serie 1:"));
            serieUm.setNota(Input.db("Informe a nota da serie 1:"));

            Serie serieDois = new Serie(nome, plataforma);
            serieDois.setNome(Input.st("Digite o nome da serie 2:"));
            serieDois.setNota(Input.db("Informe a nota da serie 2:"));

            Serie serieTres = new Serie(nome, plataforma);
            serieTres.setNome(Input.st("Digite o nome da serie 3:"));
            serieTres.setNota(Input.db("Informe a nota da serie 3:"));

            catalogo.adSerie(serieUm);
            catalogo.adSerie(serieDois);
            catalogo.adSerie(serieTres);

            Serie busca = catalogo.buscaSerie(Input.st("Informe o nome da serie:"));
            if(busca != null) {
                System.out.println("Plataforma: " + busca.getPlataforma());
                System.out.println("Nota: " + busca.getNota());
            }
            else  {
                System.out.println("Serie nao encontrada!");
            }
    }
}
