import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        double saldo = 0; 
        // Loop infinito para manter o programa em execução até que o usuário decida sair
        while (true) { 
                System.out.println("[1] Depositar");
                System.out.println("[2] Sacar");
                System.out.println("[3] Consultar saldo");
                System.out.println("[4] Encerrar");
              try{
                int opcao = scanner.nextInt();
                switch(opcao){
                  case 1:
                    depositar();
                }
                
              }catch(){
                System.out.println("Opção inválida. Tente novamente.")
              }
                
            
              }
    }
    static void depositar(valor){
      System.out.println(@);
      saldo += valor
    }
    static void sacar(valor){
      saldo -= valor
    }
    static void consultarSaldo(valor){
      System.out.println("saldo Atual: "+ saldo) 
    }
    static void encerrar(valor){
      System.out.println("Obrigado por usar nosso Sistema!");
      break;
    }
}