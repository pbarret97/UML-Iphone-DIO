import telefone.Iphone;

public class Main {
    
    public static void main (String[] args) {
        Iphone iphone = new Iphone();

        System.out.println(" ---- FUNÇOES DE TELEFONE ----");
        iphone.ligar();
        iphone.atender();
        iphone.correioDeVoz();
        iphone.enviarMensagem();
        iphone.receberMensagem();
        iphone.editarMensagem();


        System.out.println(" ---- NAVEGAÇÃO ONLINE ----");
        iphone.abirNovaAba();
        iphone.mostrarPagina();
        iphone.atualizarPagina();

        System.out.println(" ---- REPRODUZIR MÚSICA ----");
        iphone.play();
        iphone.pause();
        iphone.selecionarMusica();
    }
}
