import java.util.Scanner;

public class App {
    static double saldo = 0.0;

    public static void main(String[] args) {
        double valor = 0.0;
        Scanner sc = new Scanner(System.in);

        // Loop infinito para manter o programa em execução até que o usuário decida
        // sair
        //int x = 1;
        //int opcao = 0;
        //System.out.println("[1] Depositar");
        //System.out.println("[2] Sacar");
        //System.out.println("[3] Consultar saldo");
        //System.out.println("[0] Encerrar");
       
        while (true) {
         
            int opcao = sc.nextInt(); 
            switch (opcao) {
                case 1:
                    //System.out.println("Digite o valor a ser depositado");
                    valor = sc.nextDouble();
                    depositar(valor);
                    break;
                case 2:
                   // System.out.println("Digite o valor a ser sacado:");
                    valor = sc.nextDouble();
                    sacar(valor);
                    break;
                case 3:
                    consultarSaldo();
                    break;
                case 0:
                    System.out.println("Programa encerrado");
                    sc.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
             

        }
       
    }

    static void depositar(double valor){   
        saldo += valor;
        consultarSaldo();
       
      
    }

    static void sacar(double valor){
        if(valor > saldo){
            System.out.println("Saldo insuficiente");
          
            
        }
        else{
            saldo = saldo - valor; 
            //System.out.println("Saque efetuado: "+ valor);
            consultarSaldo();
           
          
        }
    }

    static void consultarSaldo() {
        System.out.println("Saldo atual: " + saldo);
       
    }
}
