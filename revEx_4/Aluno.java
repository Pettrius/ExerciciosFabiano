package revEx_4;

public class Aluno {

    public String nome;
    public int matricula;
    public double nota1;
    public double nota2;

    public Aluno(String nome, int matricula, double nota1, double nota2) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void exibirInfos()
    {
        System.out.print("Nome do aluno: " +nome);
        System.out.print("\nMatrícula do aluno: " +matricula);
        System.out.print("\nNota 1 do aluno: " +nota1);
        System.out.print("\nNota 2 do aluno: " +nota2);
    }
}
