package com.iphone;

import com.iphone.browser.browser;
import com.iphone.musicplayer.musicplayer;
import com.iphone.phone.phone;

public class iphone implements musicplayer, browser, phone{
    // PLAYER
    @Override
    public void tocar() {
        System.out.println("Tocando música");
        throw new UnsupportedOperationException("Unimplemented method 'tocar'");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música");
        throw new UnsupportedOperationException("Unimplemented method 'pausar'");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.err.println("Música " + musica + " selecionada.");
        throw new UnsupportedOperationException("Unimplemented method 'selecionarMusica'");
    }

    // BROWSER
    @Override
    public void exibirPagina(String url) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'exibirPagina'");
    }

    @Override
    public void adicionarNovaAba() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'adicionarNovaAba'");
    }

    @Override
    public void atualizarPagina() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atualizarPagina'");
    }

    // PHONE
    @Override
    public void ligar(String numero) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ligar'");
    }

    @Override
    public void atender() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atender'");
    }

    @Override
    public void iniciarCorreioVoz() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iniciarCorreioVoz'");
    }


}
