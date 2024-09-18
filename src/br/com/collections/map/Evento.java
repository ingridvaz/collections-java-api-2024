package br.com.collections.map;

public class Evento {
    private String nome;
    private String nomeAtracao;

    public Evento(String nomeAtracao, String nome) {
        this.nomeAtracao = nomeAtracao;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeAtracao() {
        return nomeAtracao;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "nome='" + nome + '\'' +
                ", nomeAtracao='" + nomeAtracao + '\'' +
                '}';
    }
}
