package br.com.collections.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {

    private List<Pessoa> listPessoas;

    public OrdenacaoPessoas() {
        this.listPessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        listPessoas.add(new Pessoa(nome, idade, altura));
    }

    private List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(listPessoas);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    private List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(listPessoas);
        Collections.sort(pessoasPorAltura , new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
        ordenacaoPessoas.adicionarPessoa("Ingrid", 34, 1.60);
        ordenacaoPessoas.adicionarPessoa("Ana", 33, 1.65);
        ordenacaoPessoas.adicionarPessoa("Andre", 43, 1.72);
        System.out.println("Ordenanando por idade" + ordenacaoPessoas.ordenarPorIdade());
        System.out.println("Ordenanando por idade" + ordenacaoPessoas.ordenarPorAltura());
    }
}
