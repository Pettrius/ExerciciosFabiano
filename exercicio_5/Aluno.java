package exercicio_5;

public class Aluno {

    String nome;
    String matricula;
    int[] notas = new int[3];

    public Aluno(String nome, String matricula, int[] notas)
    {
        this.nome = nome;
        this.matricula = matricula;
        this.notas =  notas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }

    public double calcularMedia()
    {
        double soma = 0;
        for(int i = 0; i < notas.length; i++)
        {
            soma = soma + notas[i];
        }
        return soma / notas.length;
    }

    public String verificarSituacao()
    {
        double media = calcularMedia();
        if (media > 7.0)
        {
            return "Aprovado.";
        }

        else
        {
            return "Reprovado.";
        }
    }

    public void exibirInformacoes()
    {
        System.out.println("Nome do aluno: " +nome);
        System.out.println("Matrícula do aluno: " +matricula);
        System.out.println("Notas: ");

        for(int i = 0; i < notas.length; i++)
        {
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }

        System.out.println("Media do aluno: " +calcularMedia());
        System.out.println("Situação: " +verificarSituacao());
    }

}
