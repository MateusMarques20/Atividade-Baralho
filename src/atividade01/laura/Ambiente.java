package atividade01.laura;

public class Ambiente {
    
private int Linhas;
private int Colunas;

public Ambiente(int linhas, int colunas){
    this.Linhas = Linhas;
    this.Colunas = Colunas;
}

    public int getLinhas() {
        return Linhas;
    }

    public void setLinhas(int Linhas) {
        this.Linhas = Linhas;
    }

    public int getColunas() {
        return Colunas;
    }

    public void setColunas(int Colunas) {
        this.Colunas = Colunas;

    }
}