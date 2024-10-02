package revEx_3;

import java.util.Scanner;

public class Leitor {

    public double lerLargura()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira a largura: ");
        return scanner.nextDouble();
    }

    public double lerAltura()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira a altura: ");
        return scanner.nextDouble();
    }
}

