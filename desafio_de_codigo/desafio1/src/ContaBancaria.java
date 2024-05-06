public class ContaBancaria {
    private Double  saldo = 0.0; 
    

    public Double despositar(Double valor){
        return saldo += valor;
    }
    public Double sacar(Double valor){
        return saldo -= valor;
    }
    public void consultarSaldo(){
       System.out.println("Seu saldo é: "+ saldo);
    } 
    
}
