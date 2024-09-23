package exercicio_12;
public class Main {
    public static void main(String[] args) {

        Banco banco = new Banco("Banco Exemplo");


        banco.cadastrarCliente("João Silva", "111.111.111-11");
        banco.cadastrarCliente("Maria Souza", "222.222.222-22");

        banco.abrirConta("111.111.111-11");
        banco.abrirConta("222.222.222-22");

        banco.depositar(1, 500.0); // Depósito na conta 1
        banco.depositar(2, 300.0); // Depósito na conta 2

        banco.sacar(1, 100.0); // Saque na conta 1

        banco.transferir(1, 2, 50.0); // Transferência da conta 1 para a conta 2

        banco.exibirInformacoes();
    }
}

