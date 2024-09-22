package exercicio_9;

import java.util.ArrayList;

public class Paciente {

    public String nome;
    public int idade;
    public ArrayList<String> historicoConsultas;


    public Paciente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.historicoConsultas = new ArrayList<>();
    }


    public void adicionarConsulta(String consulta) {
        historicoConsultas.add(consulta);
        System.out.println("Consulta adicionada: " + consulta);
    }


    public void exibirConsultas() {
        if (historicoConsultas.isEmpty()) {
            System.out.println("Nenhuma consulta realizada.");
        } else {
            System.out.println("Consultas realizadas:");
            for (String consulta : historicoConsultas) {
                System.out.println(consulta);
            }
        }
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        exibirConsultas();

    }

}