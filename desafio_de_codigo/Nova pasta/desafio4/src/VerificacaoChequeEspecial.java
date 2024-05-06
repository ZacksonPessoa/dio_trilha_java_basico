import java.util.InputMismatchException;
import java.util.Scanner;

public class VerificacaoChequeEspecial { 

    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        try{
            double saldo = sc.nextDouble(); 
            double saque = sc.nextDouble(); 
            double limiteChequeEspecial = 500.0; 
        
            if(saque < saldo){
                System.out.println("Transação realizada com sucesso.");
            }else if (saque>saldo+limiteChequeEspecial) {
                System.out.println("Transação não realizada. Limite do cheque especial excedido.");
                
            }else{
                System.out.println("Transação realizada com sucesso utilizando o cheque especial.");
            }
        }catch(InputMismatchException e){
            System.err.println("valor inválido! tente novamente.");
        }
       
        sc.close();
              
                // Se o saque ultrapassar tanto o saldo disponível quanto o limite do cheque especial
               // System.out.println("Transacao nao realizada. Limite do cheque especial excedido.");
     }
 }
       
