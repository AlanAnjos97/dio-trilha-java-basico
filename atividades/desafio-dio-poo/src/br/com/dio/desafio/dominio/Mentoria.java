package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria  extends Conteudo{
    private LocalDate dataInicio;
   
    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Mentoria {" + 
                    "Título= " + getTitulo() + 
                    ", Descrição= " + getDescricao() + 
                    ", Data Início= " + dataInicio + 
                    " }";
    }

}
