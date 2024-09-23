package exercicio_12;

import java.util.HashMap;

public class Banco {

    private String nomeBanco;
    private HashMap<String, Cliente> clientes; // CPF como chave
    private HashMap<Integer, ContaBancaria> contas; // Número da conta como chave
    private int numeroContaSequencial;

    // Construtor do banco
    public Banco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
        this.clientes = new HashMap<>();
        this.contas = new HashMap<>();
        this.numeroContaSequencial = 1; // Inicializa o número da conta
    }

    // Método para cadastrar um cliente
    public void cadastrarCliente(String nome, String cpf) {
        if (!clientes.containsKey(cpf)) {
            Cliente novoCliente = new Cliente(nome, cpf);
            clientes.put(cpf, novoCliente);
            System.out.println("Cliente cadastrado com sucesso: " + novoCliente);
        } else {
            System.out.println("Cliente já cadastrado.");
        }
    }

    // Método para abrir uma conta bancária
    public void abrirConta(String cpf) {
        Cliente cliente = clientes.get(cpf);
        if (cliente != null) {
            ContaBancaria novaConta = new ContaBancaria(cliente, numeroContaSequencial++);
            contas.put(novaConta.getNumeroConta(), novaConta);
            System.out.println("Conta aberta com sucesso: " + novaConta);
        } else {
            System.out.println("Cliente não encontrado. Cadastre o cliente primeiro.");
        }
    }

    // Método para realizar depósitos
    public void depositar(int numeroConta, double valor) {
        ContaBancaria conta = contas.get(numeroConta);
        if (conta != null) {
            conta.depositar(valor);
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    // Método para realizar saques
    public void sacar(int numeroConta, double valor) {
        ContaBancaria conta = contas.get(numeroConta);
        if (conta != null) {
            conta.sacar(valor);
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    // Método para realizar transferências entre contas
    public void transferir(int contaOrigem, int contaDestino, double valor) {
        ContaBancaria origem = contas.get(contaOrigem);
        ContaBancaria destino = contas.get(contaDestino);
        if (origem != null && destino != null) {
            origem.transferir(destino, valor);
        } else {
            System.out.println("Uma das contas não foi encontrada.");
        }
    }

    // Método para exibir informações do banco
    public void exibirInformacoes() {
        System.out.println("Banco: " + nomeBanco);
        System.out.println("Clientes cadastrados: " + clientes.size());
        System.out.println("Contas abertas: " + contas.size());
        for (ContaBancaria conta : contas.values()) {
            System.out.println(conta);
        }
    }

    // Classe interna para Cliente
    private class Cliente {
        private String nome;
        private String cpf;

        public Cliente(String nome, String cpf) {
            this.nome = nome;
            this.cpf = cpf;
        }

        @Override
        public String toString() {
            return "Cliente: " + nome + " | CPF: " + cpf;
        }
    }

    // Classe interna para ContaBancaria
    private class ContaBancaria {
        private Cliente cliente;
        private int numeroConta;
        private double saldo;

        public ContaBancaria(Cliente cliente, int numeroConta) {
            this.cliente = cliente;
            this.numeroConta = numeroConta;
            this.saldo = 0.0; // A conta começa com saldo zero
        }

        public int getNumeroConta() {
            return numeroConta;
        }

        public double getSaldo() {
            return saldo;
        }

        // Método para realizar depósitos
        public void depositar(double valor) {
            if (valor > 0) {
                saldo += valor; // Adiciona ao saldo
                System.out.println("Depósito de R$ " + valor + " realizado com sucesso na conta " + numeroConta);
            } else {
                System.out.println("Valor de depósito inválido.");
            }
        }

        // Método para realizar saques
        public boolean sacar(double valor) {
            if (valor > 0 && valor <= saldo) {
                saldo -= valor; // Subtrai do saldo
                System.out.println("Saque de R$ " + valor + " realizado com sucesso na conta " + numeroConta);
                return true;
            } else {
                System.out.println("Saldo insuficiente ou valor de saque inválido.");
                return false;
            }
        }

        // Método para transferir valores para outra conta
        public boolean transferir(ContaBancaria destino, double valor) {
            if (sacar(valor)) {
                destino.depositar(valor); // Adiciona ao saldo da conta de destino
                System.out.println("Transferência de R$ " + valor + " da conta " + numeroConta + " para a conta " + destino.getNumeroConta() + " realizada com sucesso.");
                return true;
            } else {
                System.out.println("Transferência não realizada.");
                return false;
            }
        }

        @Override
        public String toString() {
            return "Conta Nº: " + numeroConta + " | Cliente: " + cliente.nome + " | Saldo: R$ " + saldo;
        }
    }
}

