package br.com.collections.set;

public class Convidado {
    private String nome;
    private int codigoConvidado;

    public Convidado(int codigoConvidado, String nome) {
        this.codigoConvidado = codigoConvidado;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoConvidado() {
        return codigoConvidado;
    }

    @Override
    public String toString() {
        return "Convidado{" +
                "nome='" + nome + '\'' +
                ", codigoConvidado=" + codigoConvidado +
                '}';
    }
}
