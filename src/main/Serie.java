package main;

public class Serie {

    private String nome;
    private String plataforma;
    private double nota;

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



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public boolean getNota() {
        if (nota >= 0 && nota<=0)
        return true;
    }

    public void setNota(double nota) {
        if (nota>=0 && nota<=10){
        this.nota = nota;}
    }
}
