package br.com.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ListaDeTarefas {

    private List<Tarefa> listaDeTarefas;

    public ListaDeTarefas() {
        this.listaDeTarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        listaDeTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : listaDeTarefas){
              if(t.getDescricao().equalsIgnoreCase(descricao)){
                  tarefasParaRemover.add(t);
              }
          }
        listaDeTarefas.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return listaDeTarefas.size();
    }

    public void obterDescricaoTarefas(){
        System.out.println(listaDeTarefas);
    }
}
