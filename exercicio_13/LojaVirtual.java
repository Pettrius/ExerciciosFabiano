package exercicio_13;

import java.util.ArrayList;
import java.util.List;

class Produto {
    public String nome;
    public double preco;
    public int quantidade;

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

class CarrinhoDeCompras {
    private List<Produto> produtos;
    private double desconto;

    public CarrinhoDeCompras() {
        this.produtos = new ArrayList<>();
        this.desconto = 0.0;
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void aplicarDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double calcularTotal() {
        double total = 0.0;
        for (Produto produto : produtos) {
            total += produto.getPreco() * produto.getQuantidade();
        }
        return total - desconto;
    }

    public void exibirProdutos() {
        for (Produto produto : produtos) {
            System.out.println("Produto: " + produto.getNome() + ", Preço: " + produto.getPreco() + ", Quantidade: " + produto.getQuantidade());
        }
    }
}

class LojaVirtual {
    private List<Produto> estoque;

    public LojaVirtual() {
        this.estoque = new ArrayList<>();
    }

    public void cadastrarProduto(Produto produto) {
        estoque.add(produto);
    }

    public Produto buscarProduto(String nome) {
        for (Produto produto : estoque) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                return produto;
            }
        }
        return null;
    }
}
