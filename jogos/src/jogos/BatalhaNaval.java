package jogos;
import java.util.Scanner;
 
public class BatalhaNaval {
    public static void main(String[] args) {
       String[][] tabuleiro = new String[10][10];
        tabuleiro(tabuleiro);
        posicao(tabuleiro);
    }
    public static void tabuleiro(String[][] tabuleiro) {
         System.out.println("   0   1   2   3   4   5   6   7   8   9");
        for(int linha=0 ; linha<10 ; linha++){
            System.out.print(linha + " ");
            for(int coluna= 0 ; coluna<10 ; coluna++){
            tabuleiro[linha][coluna] = "[ ]";
            System.out.print(tabuleiro[linha][coluna] + " ");
            }
            System.out.println();
        }
       }
    public static void posicao(String[][] tabuleiro) {
       Scanner console= new Scanner(System.in);
       int PortaAviao = 1, NaviosTanque = 1, ContraTorpedos = 1, Submarino = 2;
       System.out.printf("Escolha o navio que deseja posicionar\n 1 = Submarino\n 2 = ContraTopedos\n 3 = NaviosTanque\n 4 = PortaAviao\n" );
       int opcao= console.nextInt();
       switch(opcao){
           case 1: 
               if(Submarino == 2 || Submarino == 1){
               posicionar(tabuleiro, opcao);
               Submarino = Submarino - 1;
           }else
               System.out.println("Você ja posicionou esta unidade");
               break;
           case 2:
               if(ContraTorpedos == 1){
               posicionar(tabuleiro, opcao);
               ContraTorpedos = 0;
           }else
               System.out.println("Você ja posicionou esta unidade");
               break;
           case 3:
               if(NaviosTanque == 1){
               posicionar(tabuleiro, opcao);
               NaviosTanque = 0;
           }else
               System.out.println("Você ja posicionou esta unidade");
               break;
           case 4:
               if(PortaAviao == 1){
               posicionar(tabuleiro, opcao);
               PortaAviao = 0;
           }else
               System.out.println("Você ja posicionou esta unidade");
               break;
           default:
               System.out.println("Esta unidade não existe");
       }
    }
    public static void posicionar(String[][] tabuleiro, int opcao) {
        Scanner console= new Scanner(System.in);
        System.out.println("Escolha a posição (Linha e Coluna )");
                   int linha = console.nextInt();
                   int coluna= console.nextInt();
                   if(linha < 0 || coluna<0 || coluna > 9 || linha > 9)
                       System.out.println("Posicao nao existe");
                   else{
                   System.out.printf("Escolha a direcao:\n1 - para cima\n2 - para a direita\n3 - para baixo\n"
                           + "4 - para a esquerda\n");
                   int opcao2 = console.nextInt();
                   int direcao = opcao + 1;
                   switch(opcao2){
                       case 1:
                           if(linha-opcao < 0)
                               System.out.println("Nao foi possivel posicionar o navio");
                           else{
                           for(int i = 0; i < direcao ; i++ ){
                           tabuleiro[linha - i][coluna] = "[A]";}
                           imprime(tabuleiro);}
                           break;
                        case 2:
                            if(coluna+opcao>9)
                            System.out.println("Nao foi possivel posicionar o navio");
                            else{
                                 for(int i = 0; i < direcao ; i++ ){
                                 tabuleiro[linha][coluna + i] = "[A]";}
                                 imprime(tabuleiro);}
                            break;
                        case 3:
                            if(linha+opcao > 9)
                            System.out.println("Nao foi possivel posicionar o navio");
                            else{
                                 for(int i = 0; i < direcao ; i++ ){
                                 tabuleiro[linha + i][coluna] = "[A]";}
                                 imprime(tabuleiro);}
                            break;
                        case 4:
                            if(coluna-opcao < 0)
                              System.out.println("Nao foi possivel posicionar o navio");
                            else{
                                 for(int i = 0; i < direcao ; i++ ){
                                 tabuleiro[linha][coluna - i] = "[A]";}
                                 imprime(tabuleiro);}
                            break;
                        default:
                            System.out.println("Nao foi possivel posicionar o navio");
                   }
                   }
           
    }
    public static void imprime(String[][] tabuleiro) {
         System.out.println("   0   1   2   3   4   5   6   7   8   9");
           for (int i = 0; i < tabuleiro.length; i++) {
           System.out.print(i + " ");
            // imprime a linha i:
            for (int j = 0; j < tabuleiro[i].length; j++) {
                System.out.print(tabuleiro[i][j] + " ");
            }
            System.out.println(); // para cada linha impressa, pula uma
        }
    }
}