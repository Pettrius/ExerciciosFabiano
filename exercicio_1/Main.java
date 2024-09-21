package ex_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o valor do raio para realizar os cálculos: ");
        double raio = scanner.nextDouble();

        Círculo circulo = new Círculo(raio);

        circulo.mostrarCalculos();

        scanner.close();

        }
    }
