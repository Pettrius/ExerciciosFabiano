package exercicio_9;

public class Main {

    public static void main (String[] args)
    {

        Paciente paciente = new Paciente("Ana Souza", 35);

        paciente.exibirInformacoes();

        paciente.adicionarConsulta("Consulta de rotina - 12/01/2024");
        paciente.adicionarConsulta("Exame de sangue - 22/02/2024");

        paciente.exibirConsultas();


    }

}
