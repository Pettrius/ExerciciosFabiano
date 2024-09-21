package ex_3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira a largura: ");
        double largura = scanner.nextDouble();

        System.out.print("Insira a altura: ");
        double altura = scanner.nextDouble();

        Retângulo ret = new Retângulo(largura, altura);

        ret.mostrarCalculos();

        scanner.close();

    }

}
