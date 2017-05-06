/*
 * jogo velha
 */

package jogos;

import java.util.Scanner;

public class JogoVelha {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int j=0;
    do{    
        System.out.println("1 para jogar contra o PC \n2 para dois jogadores");
        j = console.nextInt();
        
       //jogar contra o pc
        
        
        //jogar 2 jogadores
        if(j==2){
        System.out.println("  1  |  2  |  3  ");
        System.out.println("-----+-----+-----");
        System.out.println("  4  |  5  |  6  ");
        System.out.println("-----+-----+-----");
        System.out.println("  7  |  8  |  9  ");
        
        String vez="",p1="1",p2="2",p3="3",p4="4",p5="5",p6="6",p7="7",p8="8",p9="9";
        
        boolean jogarnovamente = false;
        
        int i=0,p=0;
        //validando escolha
        do{
        System.out.print("Escolha X ou O: ");
        vez = console.next();
        vez = vez.toUpperCase();
        }while(! vez.equals ("X") & ! vez.equals ("O"));
        
        //poso colar um do while para ver se da empate
        while(i<9){
        
        do{
        System.out.print("Jogador "+vez+" Escolha uma posição: ");
        p = console.nextInt();
        }while((p>9)|(p<1));   
        
        //validando posicao e salvando
        switch(p){
            case 1:
                if(p1.equals("1")){       
                p1=vez;
                }
                else{
                    System.out.println("JOGADA INVALIDA POSIÇÃO JA OCUPADA\n");
                    jogarnovamente = true;
                }
                break;
            case 2:
                if(p2.equals("2")){     
                p2=vez;
                }
                else{
                    System.out.println("JOGADA INVALIDA POSIÇÃO JA OCUPADA\n");
                    jogarnovamente = true;
                }
                break;
            case 3:
                if(p3.equals("3")){     
                p3=vez;
                }
                else{
                    System.out.println("JOGADA INVALIDA POSIÇÃO JA OCUPADA\n");
                    jogarnovamente = true;
                }
                break;
            case 4:
                if(p4.equals("4")){     
                p4=vez;
                }
                else{
                    System.out.println("JOGADA INVALIDA POSIÇÃO JA OCUPADA\n");
                    jogarnovamente = true;
                }
                break;
            case 5:
                if(p5.equals("5")){     
                p5=vez;
                }
                else{
                    System.out.println("JOGADA INVALIDA POSIÇÃO JA OCUPADA\n");
                    jogarnovamente = true;
                }
                break;
            case 6:
                if(p6.equals("6")){     
                p6=vez;
                }
                else{
                    System.out.println("JOGADA INVALIDA POSIÇÃO JA OCUPADA\n");
                    jogarnovamente = true;
                }
                break;
            case 7:
                if(p7.equals("7")){     
                p7=vez;
                }
                else{
                    System.out.println("JOGADA INVALIDA POSIÇÃO JA OCUPADA\n");
                    jogarnovamente = true;
                }
                break;
            case 8:
                if(p8.equals("8")){     
                p8=vez;
                }
                else{
                    System.out.println("JOGADA INVALIDA POSIÇÃO JA OCUPADA\n");
                    jogarnovamente = true;
                }
                break;
            case 9:
                if(p9.equals("9")){     
                p9=vez;
                }
                else{
                    System.out.println("JOGADA INVALIDA POSIÇÃO JA OCUPADA\n");
                    jogarnovamente = true;
                }
                break;
        }  
        
        System.out.println("  "+p1+"  |  "+p2+"  |  "+p3+"  ");
        System.out.println("-----+-----+-----");
        System.out.println("  "+p4+"  |  "+p5+"  |  "+p6+"  ");
        System.out.println("-----+-----+-----");
        System.out.println("  "+p7+"  |  "+p8+"  |  "+p9+"  \n");
        
        //vendo ganhador quando for X
            if((p1.equals("X") & p2.equals("X") & p3.equals("X"))){
                System.out.println("GANHADOR X"); 
                break;
            }
            else if((p1.equals("X") & p4.equals("X") & p7.equals("X"))){
                System.out.println("GANHADOR X"); 
                break;        
            }
            else if((p2.equals("X") & p5.equals("X") & p8.equals("X"))){
                System.out.println("GANHADOR X"); 
                break;        
            }
            else if((p3.equals("X") & p6.equals("X") & p9.equals("X"))){
                System.out.println("GANHADOR X"); 
                break;        
            }
            else if((p1.equals("X") & p5.equals("X") & p9.equals("X"))){
                System.out.println("GANHADOR X"); 
                break;        
            }
            else if((p3.equals("X") & p5.equals("X") & p7.equals("X"))){
                System.out.println("GANHADOR X"); 
                break;        
            }
        //ganhador quando for O
        else{
            if((p1.equals("O") & p2.equals("O") & p3.equals("O"))){
                System.out.println("GANHADOR O"); 
                break;
            }
            else if((p1.equals("O") & p4.equals("O") & p7.equals("O"))){
                System.out.println("GANHADOR O"); 
                break;        
            }
            else if((p2.equals("O") & p5.equals("O") & p8.equals("O"))){
                System.out.println("GANHADOR O"); 
                break;        
            }
            else if((p3.equals("O") & p6.equals("O") & p9.equals("O"))){
                System.out.println("GANHADOR O"); 
                break;        
            }
            else if((p1.equals("O") & p5.equals("O") & p9.equals("O"))){
                System.out.println("GANHADOR O"); 
                break;        
            }
            else if((p3.equals("O") & p5.equals("O") & p7.equals("O"))){
                System.out.println("GANHADOR O"); 
                break;        
            }
            
        
        
        
        }
            //verificando empate
            if (! p1.equals("1") & ! p2.equals("2") & ! p3.equals("3")& ! p4.equals("4")
                & ! p5.equals("5")& ! p6.equals("6")& ! p7.equals("7")& ! p8.equals("8")
                & ! p9.equals("9")){
                System.out.println("DEU VELHA\nEMPATE");
                break;
            }
            
        //mudando a vez de jogador se a posicao for valida
        if(jogarnovamente==false){
             if(vez.equals("X")){
                 vez = "O";
             }
             else{
                 vez = "X";
             }
        }
        //se a posicao for invalida continua com o mesmo jogador
        jogarnovamente=false;
        
        
    }
        }
        
        System.out.println("digite 1 para jogar novamente");
        j = console.nextInt();
        
    }while(j==1);    
       if(j==42){
           System.out.println("Parabéns você é o conhecedor do sentido da vida do universo e tudo mais");
           
       } 
  }
}
