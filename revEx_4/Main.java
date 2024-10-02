package revEx_4;

public class Main {

    public static void main(String[] args)
    {

        Leitor leitor = new Leitor();
        String nome = leitor.lerNome();
        int matricula = leitor.lerMatricula();
        double nota1 = leitor.lerNota1();
        double nota2 = leitor.lerNota2();

        Aluno aluno = new Aluno(nome, matricula, nota1, nota2);
        aluno.exibirInfos();

        Media media = new Media();
        Situacao situacao = new Situacao();

        System.out.print("\nA média do aluno é: " +media.calcularMedia(aluno));
        System.out.print("\nSituação do aluno: " +situacao.verificaSituacao(aluno,media));
    }
}
