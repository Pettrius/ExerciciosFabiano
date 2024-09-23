package exercicio_16;

public class Main {

    public static void main(String[] args) {
        JogoCartas jogo = new JogoCartas(4);
        jogo.exibirMaosJogadores();
        jogo.jogarCarta(0, 2); // Exemplo de jogada
        jogo.exibirMaosJogadores();
    }
}
