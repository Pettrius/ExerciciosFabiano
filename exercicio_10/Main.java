package exercicio_10;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do livro: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o autor desse livro: ");
        String autor = scanner.nextLine();

        System.out.print("Digite o número de páginas desse livro: ");
        int numPaginas = scanner.nextInt();

        Livro livro = new Livro(nome, autor, numPaginas);

        livro.exibirInformacoes();

        livro.emprestar();
        livro.verificaDisponibilidade();

        livro.devolver();
        livro.verificaDisponibilidade();

    }
}
