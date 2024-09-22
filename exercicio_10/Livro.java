package exercicio_10;

public class Livro {

    public String titulo;
    public String autor;
    public int numPaginas;
    public boolean disponibilidade;

    public Livro(String titulo, String autor, int numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.disponibilidade = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public void emprestar() {
        if(disponibilidade)
        {
         disponibilidade = false;
         System.out.println("O livro "+titulo+" foi emprestado.");
        }

        else
        {
            System.out.println("O livro " +titulo+ " não está disponível.");
        }

    }

    public void devolver() {
        if (!disponibilidade) {
            disponibilidade = true;
            System.out.println("O livro '" + titulo + "' foi devolvido.");
        } else {
            System.out.println("O livro '" + titulo + "' já estava disponível.");
        }
    }

    public void verificaDisponibilidade()
    {
        if(disponibilidade)
        {
            System.out.println("O livro está disponível.");
        }

        else
            System.out.println("O livro está emprestado atualmente.");
    }

    public void exibirInformacoes()
    {
        System.out.println("Nome do livro: " +titulo);
        System.out.println("Nome do autor do livro: " +autor);
        System.out.println("Número de páginas do livro : " +numPaginas);
        verificaDisponibilidade();
    }
}
