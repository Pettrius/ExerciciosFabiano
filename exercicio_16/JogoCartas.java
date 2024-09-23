package exercicio_16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

class Carta {
    private String cor;
    private String valor;

    public Carta(String cor, String valor) {
        this.cor = cor;
        this.valor = valor;
    }

    public String getCor() {
        return cor;
    }

    public String getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return cor + " " + valor;
    }
}

class JogoCartas {
    public List<Carta> baralho;
    public List<List<Carta>> maosJogadores;
    public int numeroJogadores;

    public JogoCartas(int numeroJogadores) {
        this.numeroJogadores = numeroJogadores;
        this.baralho = new ArrayList<>();
        this.maosJogadores = new ArrayList<>();
        inicializarBaralho();
        embaralharCartas();
        distribuirCartas();
    }

    public void inicializarBaralho() {
        String[] cores = {"Vermelho", "Verde", "Azul", "Amarelo"};
        String[] valores = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "Pular", "Reverso", "Comprar 2"};

        for (String cor : cores) {
            for (String valor : valores) {
                baralho.add(new Carta(cor, valor));
                baralho.add(new Carta(cor, valor)); // Adiciona duas cartas de cada combinação
            }
        }
    }

    private void embaralharCartas() {
        Collections.shuffle(baralho);
    }

    public void distribuirCartas() {
        for (int i = 0; i < numeroJogadores; i++) {
            maosJogadores.add(new ArrayList<>());
        }

        for (int i = 0; i < 7; i++) { // Distribui 7 cartas para cada jogador
            for (int j = 0; j < numeroJogadores; j++) {
                maosJogadores.get(j).add(baralho.remove(0));
            }
        }
    }

    public void exibirMaosJogadores() {
        for (int i = 0; i < numeroJogadores; i++) {
            System.out.println("Jogador " + (i + 1) + ": " + maosJogadores.get(i));
        }
    }

    public void jogarCarta(int jogador, int indiceCarta) {
        if (jogador < 0 || jogador >= numeroJogadores || indiceCarta < 0 || indiceCarta >= maosJogadores.get(jogador).size()) {
            System.out.println("Jogada inválida.");
            return;
        }

        Carta cartaJogada = maosJogadores.get(jogador).remove(indiceCarta);
        System.out.println("Jogador " + (jogador + 1) + " jogou: " + cartaJogada);
    }
}

