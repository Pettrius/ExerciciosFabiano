package exercicio_17;

public class Main {
    public static void main(String[] args) {
        RedeSocial rede = new RedeSocial();
        rede.adicionarUsuario("Alice");
        rede.adicionarUsuario("Bob");

        Usuario alice = rede.buscarUsuario("Alice");
        Usuario bob = rede.buscarUsuario("Bob");

        alice.adicionarAmigo(bob);
        alice.publicarPost("Olá, mundo!");
        bob.comentarPost(alice.getPosts().get(0), "Oi, Alice!");

        System.out.println("Amigos de Alice: " + alice.getAmigos().get(0).getNome());
        System.out.println("Post de Alice: " + alice.getPosts().get(0).getConteudo());
        System.out.println("Comentário de Bob: " + alice.getPosts().get(0).getComentarios().get(0).getConteudo());
    }
}
