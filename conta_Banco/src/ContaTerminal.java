import java.util.Scanner;
public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        // importando a classe  Scanner
        Scanner sc = new Scanner(System.in);
       
        //exibir as mensagens para o usuário
        //Obter pela scanner os valores digitados no terminal
        System.out.println();
        System.out.println("Por favor digite os dados da conta a ser criada:");
        System.out.println();
        
        System.out.print("Número da conta: ");
        int numeroDaConta = sc.nextInt();

        System.out.print("Número da agência:");
        String agencia = sc.next();

        System.out.print("Nome do Cliente: ");
        sc.nextLine();
        String nomeCliente = sc.nextLine();

        System.out.print("Saldo: ");
        double saldo = sc.nextDouble();
        System.out.println();
    
        //exibir a mensagem da conta criada
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, Conta: %d e seu saldo %.2f já está disponival para saque.\n",nomeCliente,agencia,numeroDaConta,saldo);
        System.out.println();



    }
}
