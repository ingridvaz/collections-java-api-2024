package br.com.collections.map;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {
    Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProduto() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProdutos(long codigoProduto, String nome, double preco, int quantidade){
        estoqueProdutosMap.put(codigoProduto, new Produto(nome,preco,quantidade));
    }
    public void exibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }

    public double calculaValorTotalEstoque(){
        double valorTotal = 0;
        if(!estoqueProdutosMap.isEmpty()){
            for (Produto p : estoqueProdutosMap.values()){
               valorTotal += p.getPreco() * p.getQuantidade();
            }
        }
        return valorTotal;
    }

    public Produto retornaProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorValor = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()){
             for (Produto p : estoqueProdutosMap.values()){
                 if (p.getPreco() > maiorValor){
                     produtoMaisCaro = p;
                 }
             }
        }
        return produtoMaisCaro;
    }

    public static void main(String[] args) {
        EstoqueProduto estoqueProduto = new EstoqueProduto();
        estoqueProduto.adicionarProdutos(1, "Produto 1", 1.3 , 2);
        estoqueProduto.adicionarProdutos(2, "Produto 2", 4.3 , 3);
        estoqueProduto.adicionarProdutos(3, "Produto 3", 2.3 , 5);
        estoqueProduto.exibirProdutos();
        System.out.println("O produto mais caro e " + estoqueProduto.retornaProdutoMaisCaro());

    }
}
