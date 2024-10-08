package com.iphone;

import com.iphone.browser.browser;
import com.iphone.musicplayer.musicplayer;
import com.iphone.phone.phone;

public class iphone implements musicplayer, browser, phone{
    // PLAYER
    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.err.println("Música " + musica + " selecionada.");
    }

    // BROWSER
    @Override
    public void exibirPagina(String url) {
        System.out.println("Carregando página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada com Sucesso");
    }

    // PHONE
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o telefone: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado");

    }


}
