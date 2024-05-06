import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       try {
            int idade= sc.nextInt();
        
            if(idade >=18){
                System.out.println("Voce esta elegivel para criar uma conta bancaria.");
            }else{
                System.out.println("Voce nao esta elegivel para criar uma conta bancaria.");
            }
       } catch (InputMismatchException e) {
            System.err.println("Erro:Digite número inteiro.");
       }
        
    }
}
