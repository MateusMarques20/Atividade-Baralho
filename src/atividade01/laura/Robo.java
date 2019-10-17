package atividade01.laura;

//import robo.Ambiente;

public class Robo {
private int linha;
private int coluna;
private final Ambiente sala;

public Robo(int linha, int coluna, Ambiente sala, int fator){
    this.linha = linha;
    this.coluna = coluna;
    this.sala = sala;
    System.out.println("A sala tem tamanho: " + sala.getLinhas() + " x " + sala.getColunas());
    mostrarPosicao();
}

    public void mostrarPosicao(){
        System.out.println("[Robo] esta na posição (" + linha + ", " + coluna + ") da sala");
    }
    
    public void andarFrente(){
        if(linha + 1 <= sala.getLinhas()){
            System.out.println("\n[Robo]: Andando para frente! ");
            linha++;
        }else{
            System.out.println("[Robo}: nao pode ir para frente! ");
        }
        mostrarPosicao();
    }
    
    public void andarTras(){
        if(linha - 1 >= 0){
            System.out.println("\n[Robo]: Andando para tras! ");
            linha--;
        }else{
            System.out.println("[Robo]: nao pode ir para tras! ");
        }
        mostrarPosicao();
    }
    
    public void parar(){
        System.out.println("\n[Robo]: Parando! ");
        mostrarPosicao();
    }
    
    public void virarDireita(){
        if(coluna + 1 <= sala.getColunas()){
            System.out.println("\n[Robo]: Virando para a direita! ");
            coluna++;
        }else{
            System.out.println("[Robo]: nao pode virar para a direita! ");
        }
        mostrarPosicao();
    }
    
    public void virarEsquerda(){
        if(coluna - 1 >= 0){
            System.out.println("\n[Robo]: Virando para a esquerda! ");
            coluna--;
        }else{
            System.out.println("[Robo]: nao pode virar para a esquerda! ");
        }
        mostrarPosicao();
    }    
}   


