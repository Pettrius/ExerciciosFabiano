package ex_2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o número da conta: ");
        String numeroDaConta = scanner.nextLine();

        System.out.print("Insira o nome do titular: ");
        String nomeDoTitular = scanner.nextLine();

        System.out.print("Insira o saldo inicial: ");
        double saldo = scanner.nextDouble();

        ContaBancária conta = new ContaBancária(numeroDaConta, saldo, nomeDoTitular);

        conta.mostrarDados();

        boolean continuar = true;
        while(continuar) {
            System.out.println("\nEscolha uma operação: ");
            System.out.println("1. Depósito");
            System.out.println("2. Saque");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Sair");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Insira o valor para depósito: ");
                    double valorDeposito = scanner.nextDouble();
                    conta.depositar(valorDeposito);
                    break;

                case 2:
                    System.out.print("Insira o valor para saque: ");
                    double valorSaque = scanner.nextDouble();
                    conta.sacar(valorSaque);
                    break;

                case 3:
                    System.out.println("Saldo atual: R$" + conta.consultarSaldo());
                    break;

                case 4:
                    continuar = false;
                    System.out.println("Operações finalizadas.");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }

        scanner.close();

    }
}

