package ex_4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do funcionario: ");
        String nome = scanner.nextLine();

        System.out.print("\nDigite o cargo do funcionário: ");
        String cargo = scanner.nextLine();

        System.out.print("Insira o salário: ");
        double salario = scanner.nextDouble();

        Funcionário func = new Funcionário(nome, salario, cargo);

        func.exibirInformacoes();

        scanner.close();
    }

}
