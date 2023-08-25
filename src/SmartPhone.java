public class SmartPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    @Override
    public void tocar() {
        System.out.println("Tocando musica!!");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica!!");
    }

    @Override
    public void selecionarMusica(String nomeMusica) {
        System.out.println("Selecionando musica: " + nomeMusica + "!!");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina!!");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba!!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina!!");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando!!");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo!!");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz!!");
    }

}
