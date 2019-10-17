package atividade01.laura;

import java.util.Scanner;

public class TestarRobo {
private Ambiente sala;
private Robo mig;
private final Scanner entrada = new Scanner(System.in);

public void definirAmbiente(){
    System.out.println("Defina o tamanho do ambiente ( linhas e colunas ): ");
    int linhas = entrada.nextInt();
    int colunas = entrada.nextInt();
    sala = new Ambiente(linhas, colunas);
}

public void iniciarRobo(){
    System.out.println("Informe o fator de movimento do robo: ");
    int fator = entrada.nextInt();
    System.out.println("Informe a posicao do robo no ambiente (linha e coluna)");
    int linha = entrada.nextInt();
    int coluna = entrada.nextInt();
    mig = new Robo(linha, coluna, sala, fator);
}

public void menu(){
    int opcao;
    
    do{
        System.out.println("1- Andar para frente ");
        System.out.println("2- Andar para tras ");
        System.out.println("3- Parar ");
        System.out.println("4- Virar para a direita ");
        System.out.println("5- Virar para a esquerda ");
        System.out.println("6- Sair ");
        opcao = entrada.nextInt();
        
        switch(opcao){
            case 1:
                mig.andarFrente();
                break;
                
            case 2:
                mig.andarTras();
                break;
                
            case 3:
                mig.parar();
                break;
                
            case 4:
                mig.virarDireita();
                break;
                
            case 5:
                mig.virarEsquerda();
                break;
                
            case 6:
                break;
                
            default:
                System.out.println("Opcao Invalida! Por favor, Tente novamente!");
        }
        
    }while( opcao != 6);
  }
}
