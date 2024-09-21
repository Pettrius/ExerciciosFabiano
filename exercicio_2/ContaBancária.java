package ex_2;

public class ContaBancária {

    String numeroDaConta;
    double saldo;
    String nomeDoTitular;

    public ContaBancária(String numeroDaConta, double saldo, String nomeDoTitular)
    {
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
        this.nomeDoTitular = nomeDoTitular;
    }

    public void depositar(double valor)
    {
        if (valor > 0)
        {
            saldo = saldo + valor;
            System.out.println("Depósito de R$" +valor+" realizado com sucesso.");
        }

        else
        {
            System.out.println("Valor de depósito invalido!");
        }
    }

    public void sacar(double valor)
    {
        if (valor > 0 && valor <= saldo)
        {
            saldo = saldo - valor;
            System.out.println("Saque de R$" +valor+" realizado com sucesso.");
        }

        else
        {
            System.out.println("Valor de saque inválido!");
        }
    }

    public double consultarSaldo()
    {
        return saldo;
    }

    public void mostrarDados()
    {
        System.out.println("Número da conta: " +numeroDaConta);
        System.out.println("Saldo: R$" +saldo);
        System.out.println("Nome do Titular: "+nomeDoTitular);
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public String getNomeDoTitular() {
        return nomeDoTitular;
    }

    public void setNomeDoTitular(String nomeDoTitular) {
        this.nomeDoTitular = nomeDoTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
