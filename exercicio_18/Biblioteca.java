package exercicio_18;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    public List<Livro> livros;

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    public void cadastrarLivro(Livro livro) {
        livros.add(livro);
    }

    public void emprestarLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                if (livro.isDisponivel()) {
                    livro.emprestar();
                    System.out.println("Livro emprestado: " + livro.getTitulo());
                } else {
                    System.out.println("Livro não disponível para empréstimo.");
                }
                return;
            }
        }
        System.out.println("Livro não encontrado.");
    }

    public void devolverLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                livro.devolver();
                System.out.println("Livro devolvido: " + livro.getTitulo());
                return;
            }
        }
        System.out.println("Livro não encontrado.");
    }

    public void verificarDisponibilidade(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                if (livro.isDisponivel()) {
                    System.out.println("Livro disponível: " + livro.getTitulo());
                } else {
                    System.out.println("Livro não disponível: " + livro.getTitulo());
                }
                return;
            }
        }
        System.out.println("Livro não encontrado.");
    }
}

