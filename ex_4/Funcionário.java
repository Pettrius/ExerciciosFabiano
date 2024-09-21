package ex_4;

public class Funcionário {

    String nome;
    double salario;
    String cargo;


    public Funcionário(String nome, double salario, String cargo)
    {
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }


    public double calcularImposto()
    {
        return salario * 0.15;
    }

    public double descontarBeneficio()
    {
        return salario * 0.10;
    }

    public double salarioLiquido()
    {
        double impostos = calcularImposto();
        double beneficios = descontarBeneficio();
        return salario - (impostos + beneficios);
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário Bruto: R$ " + salario);
        System.out.println("Salário Líquido: R$ " + salarioLiquido());
    }
}
