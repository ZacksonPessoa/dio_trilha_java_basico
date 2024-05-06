import java.util.Scanner; 

public class VerificadorNumeroConta { 

    public static void main(String[] args) { 
        Scanner sc= new Scanner(System.in); 
 
        
        try{
          
            String numeroConta = sc.next();          
            verificarNumeroConta(numeroConta);
          
        }catch(IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage()); 

        } finally {
            sc.close();
        }        
 

        
    }

// Declaração do método verificarNumeroConta, que verifica se o número de conta tem exatamente 8 dígitos:
    private static void verificarNumeroConta(String numeroConta) {
        if(numeroConta.length() == 8){ 
            System.out.println("Numero de conta valido.");
            System.out.println();
        }
        else{
            throw  new IllegalArgumentException("Numero de conta invalido. Digite exatamente 8 digitos.");

        }

       
    }
}