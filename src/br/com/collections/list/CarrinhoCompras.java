package br.com.collections.list;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {

    private final List<Item> listaDeItens;

    public CarrinhoCompras() {
        this.listaDeItens = new ArrayList<>();
    }

    public void adicionarItem(String name, double preco, int quantidade){
        Item item = new Item(name,preco,quantidade);
        this.listaDeItens.add(item);

    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        for (Item i : listaDeItens){
            if(i.getName().equalsIgnoreCase(nome)){
                itensParaRemover.add(i);
            }
        }
        listaDeItens.removeAll(itensParaRemover);
    }

    public void exibirItens(){
        System.out.println(listaDeItens);
    }

    public double calcularValorTotal(){
       double valorTotal = 0d;
       if(!listaDeItens.isEmpty()){
           for (Item item : listaDeItens){
               valorTotal += item.getPreco() * item.getQuantidade();
           }
       }
        return valorTotal;
    }

    public static void main(String[] args) {
        CarrinhoCompras carrinhoCompras = new CarrinhoCompras();
        carrinhoCompras.adicionarItem("Sabonete", 1.2d, 2);
        carrinhoCompras.adicionarItem("Calculadora", 50.0d, 2);
        carrinhoCompras.adicionarItem("Mouse", 50.0d, 20);
        System.out.println("Os itens no carrinho sao " + carrinhoCompras.listaDeItens);
        carrinhoCompras.removerItem("Sabonete");
        carrinhoCompras.exibirItens();
        System.out.println("O valor total dos produtos sao: " + carrinhoCompras.calcularValorTotal());
    }
}
