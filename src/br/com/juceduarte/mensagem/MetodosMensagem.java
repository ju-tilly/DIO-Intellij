package br.com.juceduarte.mensagem;

public class MetodosMensagem {

    public static void obterMensagem(int hora){
        switch (hora) { //a partir do java 12 e superior esta é a nova escrita do CASE
            case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 -> mensagemBomDia();
            case 13, 14, 15, 16, 17 -> mensagemBoaTarde();
            case 18, 19, 20, 21, 22, 23 -> mensagemBoaNoite();
            default -> System.out.println("Hora inválida.");
        }
    }

    private static void mensagemBoaNoite() {
        System.out.println("Boa noite!!");
    }

    private static void mensagemBoaTarde() {
        System.out.println("Boa tarde!!");
    }

    private static void mensagemBomDia() {
        System.out.println("Bom dia!!");
    }
}
