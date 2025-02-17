package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

    private int cargaHoraria;
    
    @Override
    public double calcularXp() {
        return XP_PADRAO + cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Curso {" + 
                    "Título= " + getTitulo() + 
                    ", Descrição= " + getDescricao() + 
                    ", Carga Horária= " + cargaHoraria + 
                    " }";
    }

}
