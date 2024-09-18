package br.com.collections.map;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEvento {

    private Map<LocalDate, Evento> eventoMap;

    public AgendaEvento() {
        this.eventoMap = new HashMap<>();
    }

    private void adicionarEvento(LocalDate data, String nome, String atracao){
        eventoMap.put(data, new Evento(nome,atracao));
    }

    private void exbirEventos(){
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventoMap);
        System.out.println(eventoTreeMap);
    }

    public void obterProximoEvento(){
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventoMap);
        for (Map.Entry<LocalDate, Evento> entry : eventoMap.entrySet()){
            if (entry.getKey().equals(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O proximo evento e " + proximoEvento + " e ocorrera na data " + proximaData);
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEvento agendaEvento = new AgendaEvento();
        agendaEvento.adicionarEvento(LocalDate.of(2024, Month.JULY, 6), "Evento 1", "Atracao 1");
        agendaEvento.adicionarEvento(LocalDate.of(2024, Month.SEPTEMBER, 28), "Evento 1", "Atracao 1");
        agendaEvento.exbirEventos();
        agendaEvento.obterProximoEvento();
    }
}
