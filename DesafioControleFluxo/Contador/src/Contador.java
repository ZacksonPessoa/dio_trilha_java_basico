import java.util.InputMismatchException;
import java.util.Scanner;
public class Contador {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Digite o primeiro parâmetro: ");
            int parametroUm = sc.nextInt();

            System.out.print("Digite o segundo parâmetro: ");
            int parametroDois = sc.nextInt();
		
		
			contar(parametroUm, parametroDois);
            
		
		}catch (ParametrosInvalidosException e) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}catch(InputMismatchException e){
            System.out.println("Valor inválido: digite apenas números inteiro.");
        }
        sc.close();
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if(parametroUm >= parametroDois){
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }else{
            for (int i = parametroUm; i < parametroDois; i++) {
                System.out.println("Número: "+i);
                
            }
        }
		int contagem = parametroDois - parametroUm;
        System.out.println(contagem);
		
		
	}
 }

