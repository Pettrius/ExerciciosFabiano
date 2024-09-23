package exercicio_15;

public class Main {

    public static void main(String[] args) {
        MáquinaDeVendas maquina = new MáquinaDeVendas();
        Produto p1 = new Produto("Refrigerante", 5.00, 10);
        Produto p2 = new Produto("Chips", 3.50, 5);

        maquina.cadastrarProduto(p1);
        maquina.cadastrarProduto(p2);

        maquina.exibirEstoque();

        maquina.inserirDinheiro(10.00);
        System.out.println(maquina.comprarProduto("Refrigerante"));
        System.out.println("Troco: " + maquina.retornarTroco());

        maquina.exibirEstoque();
    }
}
