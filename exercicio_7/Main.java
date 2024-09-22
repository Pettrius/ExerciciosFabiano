package exercicio_7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o lado 1 do triângulo: ");
        double lado1 = scanner.nextDouble();

        System.out.print("Insira o lado 2 do triângulo: ");
        double lado2 = scanner.nextDouble();

        System.out.print("Insira o lado 3 do triângulo: ");
        double lado3 = scanner.nextDouble();

        Triângulo triangulo = new Triângulo(lado1, lado2, lado3);

        triangulo.exibirInformacoes();
    }
}
