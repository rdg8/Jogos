/*
 * Desenvolva o jogo Conecta-4 usando, também, os conceitos de tratamento de e
rros, funções e matrizes.
O Conecta-4 é um jogo de tabuleiro parecido com o Jogo-da-Velha. 
As diferenças são:
 Joga-se em um tabuleiro de 6 linhas por 7 colunas;
Ganha que faz uma linha, coluna ou diagonal de 4 peças;
Não se pode jogar em qualquer linha. Escolhe-se uma coluna e sua peça é colocada
nessa coluna "caindo" até a posição disponível.
 */
package jogos;

import java.util.Scanner;


public class Conecta4 {
    public static Scanner console=new Scanner(System.in);
    public static String vez;
    public static boolean D= true;
    public static void main(String[] args) {
        boolean denovo=true, ganhador=true;
        String[][] tabuleiro = new String[6][7];
        iniciaTabuleiro(tabuleiro);
        imprimirTabuleiro(tabuleiro); 
        
        
        do{
        System.out.println("escolha X ou O: ");
        vez = console.next();
        vez = vez.toUpperCase();
        if ((!vez.equals("X"))&(!vez.equals("O"))){
            System.out.println("escolha X ou O: ");
            vez = console.next();
            vez = vez.toUpperCase();       
        }  
        else{
            denovo=false;
        }
        }while(denovo);
        
        do{
        posicaoTabuleiro(tabuleiro);
        
        imprimirTabuleiro(tabuleiro);
        if(D){
        jogarDenovo();
        }
        }while(ganhador);
              
    }  
     static void jogarDenovo(){
         
            if(vez.equals("X")){
                vez = "O";
            }
            else if(vez.equals("O")){
                vez = "X";
            }   
            
        
     }
    static void iniciaTabuleiro(String[][] tabuleiro){
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                tabuleiro[i][j] = ".";
            }
        }
        
    }
    
    static void imprimirTabuleiro(String[][] tabuleiro){
        System.out.println("0 1 2 3 4 5 6");
        for(int i=0;i<tabuleiro.length;i++){
            for(int j=0;j<tabuleiro[i].length;j++){
                System.out.print(tabuleiro[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("=============");
    }
        
   
    static void
         posicaoTabuleiro(String[][] tabuleiro){
    
        do{
         boolean codicao=true;   
         System.out.println("Jogador: " +vez+ "\nEscolha uma posição de 0 a 6:");  
        int p = console.nextInt();
        if ((p<=6)&(p>=0)){
            
        
        switch(p){
            case 0:
                if (tabuleiro[5][0].equals(".")){
                tabuleiro[5][0]= vez;
                }
                else if(tabuleiro[4][0].equals(".")){
                tabuleiro[4][0]=vez;
                }
                else if(tabuleiro[3][0].equals(".")){
                tabuleiro[3][0]=vez;
                }
                else if(tabuleiro[2][0].equals(".")){
                tabuleiro[2][0]=vez;
                }
                else if(tabuleiro[1][0].equals(".")){
                tabuleiro[1][0]=vez;
                }
                else if(tabuleiro[0][0].equals(".")){
                tabuleiro[0][0]=vez;
                }
                else{
                    System.out.println("Posição INVALIDA\nessa coluna ja foi preenchida escolha outra");
                    System.out.println("Escolha uma posição de 0 a 6:"+vez);
                    D=false;
                                    
                    }
                codicao=true;
                break;
            case 1:
                if (tabuleiro[5][1].equals(".")){
                tabuleiro[5][1]= vez;
                }
                else if(tabuleiro[4][1].equals(".")){
                tabuleiro[4][1]=vez;
                }
                else if(tabuleiro[3][1].equals(".")){
                tabuleiro[3][1]=vez;
                }
                else if(tabuleiro[2][1].equals(".")){
                tabuleiro[2][1]=vez;
                }
                else if(tabuleiro[1][1].equals(".")){
                tabuleiro[1][1]=vez;
                }
                else if(tabuleiro[0][1].equals(".")){
                tabuleiro[0][1]=vez;
                }
                else{
                    System.out.println("Posição INVALIDA\nessa coluna ja foi preenchida escolha outra");
                    System.out.println("Escolha uma posição de 0 a 6:"+vez);
                    D=false;
                                   
                    }
                codicao=true;
                break;
            case 2:
                if (tabuleiro[5][2].equals(".")){
                tabuleiro[5][2]= vez;
                }
                else if(tabuleiro[4][2].equals(".")){
                tabuleiro[4][2]=vez;
                }
                else if(tabuleiro[3][2].equals(".")){
                tabuleiro[3][2]=vez;
                }
                else if(tabuleiro[2][2].equals(".")){
                tabuleiro[2][2]=vez;
                }
                else if(tabuleiro[1][2].equals(".")){
                tabuleiro[1][2]=vez;
                }
                else if(tabuleiro[0][2].equals(".")){
                tabuleiro[0][2]=vez;
                }
                else{
                    System.out.println("Posição INVALIDA\nessa coluna ja foi preenchida escolha outra");
                    System.out.println("Escolha uma posição de 0 a 6:"+vez);
                    p = console.nextInt(tabuleiro.length);
                    D=false;
                    }
                codicao=true;
                break;
            case 3:
                if (tabuleiro[5][3].equals(".")){
                tabuleiro[5][3]= vez;
                }
                else if(tabuleiro[4][3].equals(".")){
                tabuleiro[4][3]=vez;
                }
                else if(tabuleiro[3][3].equals(".")){
                tabuleiro[3][3]=vez;
                }
                else if(tabuleiro[2][3].equals(".")){
                tabuleiro[2][3]=vez;
                }
                else if(tabuleiro[1][3].equals(".")){
                tabuleiro[1][3]=vez;
                }
                else if(tabuleiro[0][3].equals(".")){
                tabuleiro[0][3]=vez;
                }
                else{
                    System.out.println("Posição INVALIDA\nessa coluna ja foi preenchida escolha outra");
                    System.out.println("Escolha uma posição de 0 a 6:"+vez);
                    p = console.nextInt(tabuleiro.length);
                    D=false;
                    }
                codicao=true;
                break;
            case 4:
                if (tabuleiro[5][4].equals(".")){
                tabuleiro[5][4]= vez;
                }
                else if(tabuleiro[4][4].equals(".")){
                tabuleiro[4][4]=vez;
                }
                else if(tabuleiro[3][4].equals(".")){
                tabuleiro[3][4]=vez;
                }
                else if(tabuleiro[2][4].equals(".")){
                tabuleiro[2][4]=vez;
                }
                else if(tabuleiro[1][4].equals(".")){
                tabuleiro[1][4]=vez;
                }
                else if(tabuleiro[0][4].equals(".")){
                tabuleiro[0][4]=vez;
                }
                else{
                    System.out.println("Posição INVALIDA\nessa coluna ja foi preenchida escolha outra");
                    System.out.println("Escolha uma posição de 0 a 6:"+vez);
                    p = console.nextInt(tabuleiro.length);
                    D=false;
                    }
                codicao=true;
                break;
            case 5:
                if (tabuleiro[5][5].equals(".")){
                tabuleiro[5][5]= vez;
                }
                else if(tabuleiro[4][5].equals(".")){
                tabuleiro[4][5]=vez;
                }
                else if(tabuleiro[3][5].equals(".")){
                tabuleiro[3][5]=vez;
                }
                else if(tabuleiro[2][5].equals(".")){
                tabuleiro[2][5]=vez;
                }
                else if(tabuleiro[1][5].equals(".")){
                tabuleiro[1][5]=vez;
                }
                else if(tabuleiro[0][5].equals(".")){
                tabuleiro[0][5]=vez;
                }
                else{
                    System.out.println("Posição INVALIDA\nessa coluna ja foi preenchida escolha outra");
                    System.out.println("Escolha uma posição de 0 a 6:"+vez);
                    p = console.nextInt(tabuleiro.length);
                    D=false;
                    }
                codicao=true;
                break;
            case 6:
                if (tabuleiro[5][6].equals(".")){
                tabuleiro[5][6]= vez;
                }
                else if(tabuleiro[4][6].equals(".")){
                tabuleiro[4][6]=vez;
                }
                else if(tabuleiro[3][6].equals(".")){
                tabuleiro[3][6]=vez;
                }
                else if(tabuleiro[2][6].equals(".")){
                tabuleiro[2][6]=vez;
                }
                else if(tabuleiro[1][6].equals(".")){
                tabuleiro[1][6]=vez;
                }
                else if(tabuleiro[0][6].equals(".")){
                tabuleiro[0][6]=vez;
                }
                else{
                    System.out.println("Posição INVALIDA\nessa coluna ja foi preenchida escolha outra");
                    System.out.println("Escolha uma posição de 0 a 6:"+ vez);
                    p = console.nextInt(tabuleiro.length);
                    D=false;
                    }
                codicao=true;
                break;
                default:
                    System.out.println("coluna invalida");
    
            }
          }
        }while(false);
    }
    
    public static void ganhador(String[][] tabuleiro){
        
        
        
    }
    
    
}
