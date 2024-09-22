package exercicio_6;

public class Produto {

    String nome;
    double preco;
    int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double calcularValorTotal() {
        return preco * quantidade;
    }

    public String verificaDisponibilidade() {
        if (quantidade > 0) {
            return "Disponível";

        } else if (quantidade < 0)
            return "Valor inválido.";

        else
            return "Não disponível.";
    }

    public void exibirInformacoes() {
        System.out.println("Nome do Produto: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade em Estoque: " + quantidade);
        System.out.println("Valor Total em Estoque: R$ " + calcularValorTotal());
        System.out.println("Disponibilidade: " + verificaDisponibilidade());

    }
}
