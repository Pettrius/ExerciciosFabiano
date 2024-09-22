package exercicio_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Entrada de nome e matrícula
        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a matrícula do aluno: ");
        String matricula = scanner.nextLine();

        // Entrada das notas com loop for
        int[] notas = new int[3];
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = scanner.nextInt();
        }

        // Criando um objeto Aluno usando o construtor
        Aluno aluno = new Aluno(nome, matricula, notas);

        // Exibindo as informações do aluno
        aluno.exibirInformacoes();

        scanner.close();

        }
    }