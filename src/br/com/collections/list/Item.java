package br.com.collections.list;

public class Item {

    private final String name;
    private final double preco;
    private final Integer quantidade;

    public Item(String name, double preco, Integer quantidade) {
        this.name = name;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getName() {
        return name;
    }

    public double getPreco() {
        return preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }
}
