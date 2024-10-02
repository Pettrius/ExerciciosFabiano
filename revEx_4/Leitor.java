package revEx_4;

import java.util.Scanner;

public class Leitor {

    public String lerNome()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        return scanner.nextLine();
    }

    public int lerMatricula()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a matrícula do aluno: ");
        return scanner.nextInt();
    }

    public double lerNota1()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nota 1 do aluno: ");
        return scanner.nextDouble();
    }

    public double lerNota2()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nota 2 do aluno: ");
        return scanner.nextDouble();
    }
}
