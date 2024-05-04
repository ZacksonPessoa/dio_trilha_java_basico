public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato");

        }else if(salarioBase==salarioPretendido){
            System.out.println("Liagra para o canditado com contra proposta");
        }else{
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
    }
}
