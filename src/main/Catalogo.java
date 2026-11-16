package main;

import java.util.ArrayList;

public class Catalogo {
    private ArrayList<Serie> catalogo;

    public Catalogo() {
        catalogo = new ArrayList<>();
    }

    public void adSerie(Serie serie){
        catalogo.add(serie);
    }

    public Serie buscaSerie(String nomeBusca){
        for (Serie serie:catalogo){
            if (serie.getNome().equalsIgnoreCase(nomeBusca)){
                return serie;
            }
        }
        return null;
    }
}
