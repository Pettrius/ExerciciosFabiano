package exercicio_13;

public class Main {
    public static void main(String[] args) {
        LojaVirtual loja = new LojaVirtual();
        Produto p1 = new Produto("Notebook", 3000.00, 10);
        Produto p2 = new Produto("Mouse", 50.00, 100);

        loja.cadastrarProduto(p1);
        loja.cadastrarProduto(p2);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarProduto(p1);
        carrinho.adicionarProduto(p2);
        carrinho.aplicarDesconto(100.00);

        carrinho.exibirProdutos();
        System.out.println("Total da compra: " + carrinho.calcularTotal());
    }
}
