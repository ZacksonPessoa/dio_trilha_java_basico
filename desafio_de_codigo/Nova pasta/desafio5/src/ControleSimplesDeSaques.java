import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        try { 

            double limiteDiario = sc.nextDouble();
            double saque =sc.nextDouble();
            if(limiteDiario<saque){
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
            }
            for(double i  = limiteDiario; i> saque; i++){
               
                if(saque==0){
                    System.out.println("Transacoes encerradas.");
                    break;
                }
                else if(limiteDiario < saque){
                        System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                }else
                {
            
                    limiteDiario = limiteDiario - saque;
                    System.out.println("Saque realizado. Limite restante:"+limiteDiario);
                    saque =sc.nextDouble();
                    
                 }
               
               
            }
            
        } catch (Exception e) {
            System.out.println("valor inválido, tente novamente");
        }

       

        sc.close();         
    }
}



   
