package main.java.list.Tarefa;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> ListaTarefa;

    public ListaTarefa() {
        ListaTarefa = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
    ListaTarefa.add(new Tarefa(descricao));
        }
    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : tarefasParaRemover){
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
            tarefasParaRemover.add(t);
            }
        }
        tarefasParaRemover.removeAll(tarefasParaRemover);
    }
    public int obterNumeroTotalTarefas(){
        return ListaTarefa.size();
    }
    public void obterDescricoesTarefas(){
        System.out.println(ListaTarefa);
    }
    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("O Numero Total de Tarefas e " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("tarefa1");
        listaTarefa.adicionarTarefa("tarefa2");
        listaTarefa.adicionarTarefa("tarefa3");

        System.out.println("O Numero Total de Tarefas e " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("tarefa 2");

        System.out.println("O Numero Total de Tarefas e " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();
        System.out.println("");

        
    }
}
