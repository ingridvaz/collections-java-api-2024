package br.com.collections.map;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removeContato(String nome){
        Map<String, Integer> removeContatoMap = null;
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer telefonePorNome = null;
        if(!agendaContatoMap.isEmpty()){
            telefonePorNome = agendaContatoMap.get(nome);
        }
        return telefonePorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Andre", 9876);
        agendaContatos.adicionarContato("Ana", 1234);
        agendaContatos.adicionarContato("Andre", 5678);
        agendaContatos.adicionarContato("Debora", 8901);

        agendaContatos.exibirContatos();
        agendaContatos.removeContato("Ana");
        agendaContatos.exibirContatos();
    }
}
