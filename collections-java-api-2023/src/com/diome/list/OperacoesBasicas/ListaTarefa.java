package com.diome.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();

        for(Tarefa t : tarefaList) {
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(tarefaList);
    }
public static void main(String[] args) {
    ListaTarefa listaTarefa = new ListaTarefa();
    listaTarefa.adicionarTarefa("Tarefa 01");
    listaTarefa.adicionarTarefa("Tarefa 02");
    listaTarefa.adicionarTarefa("Tarefa 01");
    System.out.println("numero total de itens na lista é: " + listaTarefa.obterNumeroTotalTarefas());

    // listaTarefa.removerTarefa("Tarefa 02");
    System.out.println("numero total de itens na lista é: " + listaTarefa.obterNumeroTotalTarefas());

    listaTarefa.obterDescricoesTarefas();
}

}
