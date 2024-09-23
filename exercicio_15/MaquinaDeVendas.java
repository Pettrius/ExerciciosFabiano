package exercicio_15;

import java.util.ArrayList;
import java.util.List;

class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}

class MáquinaDeVendas {
    private List<Produto> estoque;
    private double saldo;

    public MáquinaDeVendas() {
        this.estoque = new ArrayList<>();
        this.saldo = 0.0;
    }

    public void cadastrarProduto(Produto produto) {
        estoque.add(produto);
    }

    public void exibirEstoque() {
        for (Produto produto : estoque) {
            System.out.println("Produto: " + produto.getNome() + ", Preço: " + produto.getPreco() + ", Quantidade: " + produto.getQuantidade());
        }
    }

    public Produto selecionarProduto(String nome) {
        for (Produto produto : estoque) {
            if (produto.getNome().equalsIgnoreCase(nome) && produto.getQuantidade() > 0) {
                return produto;
            }
        }
        return null;
    }

    public void inserirDinheiro(double valor) {
        saldo += valor;
    }

    public String comprarProduto(String nome) {
        Produto produto = selecionarProduto(nome);
        if (produto == null) {
            return "Produto não disponível.";
        }
        if (saldo < produto.getPreco()) {
            return "Saldo insuficiente.";
        }
        saldo -= produto.getPreco();
        produto.setQuantidade(produto.getQuantidade() - 1);
        return "Produto comprado: " + produto.getNome() + ". Troco: " + saldo;
    }

    public double retornarTroco() {
        double troco = saldo;
        saldo = 0.0;
        return troco;
    }

}
