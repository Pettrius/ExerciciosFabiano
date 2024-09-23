package exercicio_14;

import java.util.ArrayList;
import java.util.List;


public class Agenda {
        public List<Contato> contatos;

        public Agenda() {
            this.contatos = new ArrayList<>();
        }

        // Adicionar contato
        public void adicionarContato(String nome, String telefone) {
            Contato contato = new Contato(nome, telefone);
            contatos.add(contato);
            System.out.println("Contato adicionado: " + contato);
        }

        // Editar contato existente
        public void editarContato(String nomeAntigo, String novoNome, String novoTelefone) {
            for (Contato contato : contatos) {
                if (contato.nome.equalsIgnoreCase(nomeAntigo)) {
                    contato.nome = novoNome;
                    contato.telefone = novoTelefone;
                    System.out.println("Contato atualizado: " + contato);
                    return;
                }
            }
            System.out.println("Contato não encontrado.");
        }

        // Remover contato
        public void removerContato(String nome) {
            for (Contato contato : contatos) {
                if (contato.nome.equalsIgnoreCase(nome)) {
                    contatos.remove(contato);
                    System.out.println("Contato removido: " + nome);
                    return;
                }
            }
            System.out.println("Contato não encontrado.");
        }

        // Buscar contato por nome
        public Contato buscarPorNome(String nome) {
            for (Contato contato : contatos) {
                if (contato.nome.equalsIgnoreCase(nome)) {
                    System.out.println("Contato encontrado: " + contato);
                    return contato;
                }
            }
            System.out.println("Contato não encontrado.");
            return null;
        }

        // Buscar contato por telefone
        public Contato buscarPorTelefone(String telefone) {
            for (Contato contato : contatos) {
                if (contato.telefone.equals(telefone)) {
                    System.out.println("Contato encontrado: " + contato);
                    return contato;
                }
            }
            System.out.println("Contato não encontrado.");
            return null;
        }

        public void listarContatos() {
            if (contatos.isEmpty()) {
                System.out.println("A agenda está vazia.");
            } else {
                System.out.println("Contatos na agenda:");
                for (Contato contato : contatos) {
                    System.out.println(contato);
                }
            }
        }
}
