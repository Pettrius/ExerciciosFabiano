package exercicio_20;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    private int numeroAleatorio;
    private int tentativas;

    public JogoAdivinhacao() {
        Random random = new Random();
        this.numeroAleatorio = random.nextInt(100) + 1; // Gera um número entre 1 e 100
        this.tentativas = 0;
    }

    public void jogar() {
        Scanner scanner = new Scanner(System.in);
        int palpite = 0;

        System.out.println("Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("Tente adivinhar o número entre 1 e 100.");

        while (palpite != numeroAleatorio) {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite < numeroAleatorio) {
                System.out.println("O número é maior.");
            } else if (palpite > numeroAleatorio) {
                System.out.println("O número é menor.");
            } else {
                System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas.");
            }
        }

        scanner.close();
    }
}

