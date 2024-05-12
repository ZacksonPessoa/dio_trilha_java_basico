

public class Iphone implements ReprodutorMusical, AparelhoTelefone, NavegadorInternet  {
    @Override
    public void tocar(){
        System.out.println("Tocando música...");
      };
    @Override
    public void pausar(){
        System.out.println("pausando música...");
    };
    @Override
    public void selecionarMusicar(){
        System.out.println("selecionando música..");
    };
    @Override
    public void ligar(){
        System.out.println("Ligando...");
    };
    @Override
    public void atender(){
        System.out.println("Atendendo...");
    };
    @Override
    public void iniciarCorreioVoz(){
        System.out.println("Iniciando mensagem de voz...");

    };
    @Override
    public void exibir(){
        System.out.println("Exibindo página...");
    };
    @Override
    public void adicionarNovaAba(){
        System.out.println("Adicionando nova página...");
    };
    @Override
    public void atualizarPagina(){
        System.out.println("Atualizando página...");
    };
}
