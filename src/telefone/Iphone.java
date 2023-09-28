package telefone;
import apps.AppReproducaoMusical;
import apps.FuncaoInternet;
import apps.FuncaoTelefone;

public class Iphone implements AppReproducaoMusical, FuncaoInternet, FuncaoTelefone  {

    @Override
    public void ligar() {
        System.out.println("Ligando...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação...");
    }

    @Override
    public void correioDeVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void enviarMensagem() {
        System.out.println("Enviando Mensagem...");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo Mensagem...");
    }

    @Override
    public void editarMensagem() {
        System.out.println("Mensagem editada...");
    }

    @Override
    public void mostrarPagina() {
        System.out.println("Abrindo página...");
    }

    @Override
    public void abirNovaAba() {
        System.out.println("Abrindo uma nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }

    @Override
    public void play() {
        System.out.println("música iniciada...");
    }

    @Override
    public void pause() {
        System.out.println("musica pausada");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("musica selecionada...");
    }   
    

    
}
