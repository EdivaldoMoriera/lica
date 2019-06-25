package calculadora;


import java.text.DecimalFormat;
import java.util.Scanner;
public class Calculadora {  
    public static void main(String[] args) {
        byte  OPCAO = 0;
        Scanner opcao = new Scanner(System.in);
        //Preograma principal
        while(OPCAO != 5){
            System.out.println("");
            System.out.println("------------------------");
            System.out.println("Progrmama calculadora");
            System.out.println("Menu Principal");
            System.out.println();
            System.out.println("[1].....................Adição");
            System.out.println("[2].....................Subtração");
            System.out.println("[3].....................Multiplicação");
            System.out.println("[4].....................Divisão");
            System.out.println("[5].....................Fim do probgrama");
            System.out.println();
            System.out.println("Escolha uma opção!");
            OPCAO = opcao.nextByte();
            if(OPCAO !=5 || OPCAO !=0){
                switch(OPCAO){
                    case 1: rotadicao();
                    break;
                    case 2: rotsubtracao();
                    break;
                    case 3: rotmultiplicacao();
                    break;
                    case 4: rotdivisao();
                    break;
                    case 5: 
                    default:
                        System.out.println("Fim do probgrama");
                        
                                
                                
                                
                                
                }
            }
                
         }
       }
        //modulo Adição
    public static void rotadicao(){
        double R,A,B;
        DecimalFormat df = new DecimalFormat();
        Scanner s = new Scanner(System.in);
        System.out.println("Rotina Adição");
        System.out.println("Entre com o valor para variavel [A]");
        A = s.nextDouble();
        System.out.println("Entre com o valor para variavel [B]");
        B = s.nextDouble();
        R = A+B;
        df.applyPattern("0.00");
        System.out.println("Resultado é " + df.format(R));
            
    
     }
    
        //modulo Subtracao
    public static void rotsubtracao(){
        double R,A,B;
        DecimalFormat df = new DecimalFormat();
        Scanner s = new Scanner(System.in);
        System.out.println("Rotina Subtracao");
        System.out.println("Entre com o valor para variavel [A]");
        A = s.nextDouble();
        System.out.println("Entre com o valor para variavel [B]");
        B = s.nextDouble();
        R = A/B;
        df.applyPattern("0.00");
        System.out.println("Resultado é " + df.format(R));      
                                             
        }
    
            //modulo Divisao
    public static void rotdivisao(){
        double R,A,B;
        DecimalFormat df = new DecimalFormat();
        Scanner s = new Scanner(System.in);
        System.out.println("Rotina Divisão");
        System.out.println("Entre com o valor para variavel [A]");
        A = s.nextDouble();
        System.out.println("Entre com o valor para variavel [B]");
        B = s.nextDouble();
        R = A/B;
        df.applyPattern("0.00");
        System.out.println("Resultado é " + df.format(R));
     
        
        
    }
    
    //modulo Multiplicação
    public static void rotmultiplicacao(){
        double R,A,B;
        DecimalFormat df = new DecimalFormat();
        Scanner s = new Scanner(System.in);
        System.out.println("Rotina Multiplicação");
        System.out.println("Entre com o valor para variavel [A]");
        A = s.nextDouble();
        System.out.println("Entre com o valor para variavel [B]");
        B = s.nextDouble();
        R = A*B;
        df.applyPattern("0.00");
        System.out.println("Resultado é " + df.format(R));
     
    }
    

}