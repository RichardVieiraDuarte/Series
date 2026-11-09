package main;

public class Serie {

    private String nome;
    private String plataforma;

    public Serie(String nome, String plataforma){
        this.nome = nome;
        this.plataforma = plataforma;
    }
    public Serie(String nome){
        this.nome = nome;
        this.plataforma = "Plataforma indefinida";
    }

    @Override
    public String toString() {
        return "Serie{" +
                "nome='" + nome + '\'' +
                ", plataforma='" + plataforma + '\'' +
                '}';
    }
}
