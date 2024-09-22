package exercicio_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o nome do produto: ");
        String nome = scanner.nextLine();

        System.out.print("Insira o valor do produto:  ");
        double preco = scanner.nextDouble();

        System.out.print("Insira a quantidade do produto disponível no estoque: ");
        int quantidade = scanner.nextInt();

        Produto produto =  new Produto(nome, preco, quantidade);

        produto.exibirInformacoes();

        scanner.close();

    }
}
