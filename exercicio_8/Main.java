package exercicio_8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a marca do carro: ");
        String marca = scanner.nextLine();
        System.out.print("Digite o modelo do carro: ");
        String modelo = scanner.nextLine();

        Carro meuCarro = new Carro(marca, modelo);

        meuCarro.exibirInformacoes();
        meuCarro.acelerar(50);
        meuCarro.frear(20);
        meuCarro.exibirVelocidadeAtual();
        meuCarro.frear(40);
        meuCarro.exibirVelocidadeAtual();
    }
}
