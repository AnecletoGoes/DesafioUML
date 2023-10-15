package Iphone;

public class IphoneClass {
    private String marca = "Apple";
    private String modelo = "14 PROMax";

    public static void main(String[] args) {

        Navegador chrome = new Navegador();
        chrome.adicionarNovaAba();
        chrome.atualizarPagina();
        chrome.exibirPagina();

        IphoneChamada telefone = new IphoneChamada();
        telefone.atender();
        telefone.iniciarCorreioVoz();
        telefone.ligar();

        ReprodutorMusical spotify = new ReprodutorMusical();
        spotify.selecionarMusica();
        spotify.tocar();
        spotify.pausar();


    }

}