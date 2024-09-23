package exercicio_14;

import java.util.ArrayList;
import java.util.List;

public class Contato {
    public String nome;
    public String telefone;

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Telefone: " + telefone;
    }
}







