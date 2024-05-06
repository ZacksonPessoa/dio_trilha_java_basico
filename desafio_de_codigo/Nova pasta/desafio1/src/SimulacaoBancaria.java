

import java.util.Locale;
import java.util.Scanner;

public class SimulacaoBancaria {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		double saldo = 0;
		
		//Exibe as opcoes disponiveis para o usuario
		System.out.println("Bem-vindo ao Banco!");
		System.out.println("Digite 1 para o deposito.");
		System.out.println("Digite 2 para o saque.");
		System.out.println("Digite 3 para consultar o saldo.");
		System.out.println("Digite 4 para encerrar.");

		while (true) {
			System.out.print("Escolha uma opção: ");
			int opcao = scanner.nextInt();

			switch (opcao) {
			case 1: {
				System.out.print("Digite o valor para depósito: ");
				double valor_deposito = scanner.nextDouble();
				saldo += valor_deposito;
				System.out.println("Depósito realizado com sucesso Saldo atual: " + saldo);
				break;				
			}
			case 2: //sacar
				System.out.print("Digite o valor do saque: ");
				double valor_sacado = scanner.nextDouble();
				if(valor_sacado <= saldo) {
					saldo -= valor_sacado;
					System.out.println("Saque realizado com sucesso Saldo Atual: " + saldo);
				}else {
					System.out.println("Saldo insuficiente.");
				}
				break;
			case 3: //consultat saldo
				System.out.println("Saldo atual: " + saldo);
				break;
			case 4: //Encerrar
				System.out.println("Programa encerrado");
				scanner.close();
				return;
				
				default: //
					System.out.println("Opção inválida. Tente novamente.");
					break;
			}
		}

	}

}