package exercicio_11;

public class Pessoa {

    public String nome;
    public int idade;
    public String profissao;

    public Pessoa(String nome, int idade, String profissao) {
        this.nome = nome;
        this.idade = idade;
        this.profissao = profissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public int calcularIdadeBissexta()
    {
        int anoAtual = 2024;
        int anoNascimento = anoAtual - idade;
        int anosBissextos = 0;

        for(int ano = anoNascimento; ano <= anoAtual; ano++)
        {
           if(ehAnoBissexto (ano))
           {
               anosBissextos++;
           }
        }
        return anosBissextos;
    }

    public boolean ehAnoBissexto(int ano)
    {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    public void exibirInformacoes()
    {
        System.out.println("Nome: " +nome);
        System.out.println("Idade: " +idade);
        System.out.println("Profissão: " +profissao);
        System.out.println("Anos bissextos vividos: " +calcularIdadeBissexta());
    }
}