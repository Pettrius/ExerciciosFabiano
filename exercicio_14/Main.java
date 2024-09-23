package exercicio_14;

public class Main {

    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        // Adicionando contatos
        agenda.adicionarContato("João", "123456789");
        agenda.adicionarContato("Maria", "987654321");

        // Listando contatos
        agenda.listarContatos();

        // Editando um contato
        agenda.editarContato("João", "João Silva", "111111111");

        // Buscando por nome
        agenda.buscarPorNome("Maria");

        // Buscando por telefone
        agenda.buscarPorTelefone("111111111");

        // Removendo um contato
        agenda.removerContato("Maria");

        // Listando contatos novamente
        agenda.listarContatos();
    }
}
