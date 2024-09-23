package exercicio_17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Usuario {
    private String nome;
    private List<Usuario> amigos;
    private List<Post> posts;

    public Usuario(String nome) {
        this.nome = nome;
        this.amigos = new ArrayList<>();
        this.posts = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Usuario> getAmigos() {
        return amigos;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void adicionarAmigo(Usuario amigo) {
        amigos.add(amigo);
    }

    public void publicarPost(String conteudo) {
        posts.add(new Post(this, conteudo));
    }

    public void comentarPost(Post post, String comentario) {
        post.adicionarComentario(new Comentario(this, comentario));
    }
}

class Post {
    private Usuario autor;
    private String conteudo;
    private List<Comentario> comentarios;

    public Post(Usuario autor, String conteudo) {
        this.autor = autor;
        this.conteudo = conteudo;
        this.comentarios = new ArrayList<>();
    }

    public Usuario getAutor() {
        return autor;
    }

    public String getConteudo() {
        return conteudo;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void adicionarComentario(Comentario comentario) {
        comentarios.add(comentario);
    }
}

class Comentario {
    private Usuario autor;
    private String conteudo;

    public Comentario(Usuario autor, String conteudo) {
        this.autor = autor;
        this.conteudo = conteudo;
    }

    public Usuario getAutor() {
        return autor;
    }

    public String getConteudo() {
        return conteudo;
    }
}

public class RedeSocial {
    private Map<String, Usuario> usuarios;

    public RedeSocial() {
        this.usuarios = new HashMap<>();
    }

    public void adicionarUsuario(String nome) {
        if (!usuarios.containsKey(nome)) {
            usuarios.put(nome, new Usuario(nome));
        }
    }

    public Usuario buscarUsuario(String nome) {
        return usuarios.get(nome);
    }
}
