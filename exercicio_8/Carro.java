package exercicio_8;

public class Carro {

    String marca;
    String modelo;
    int velocidadeAtual;

    public Carro(String marca, String modelo)
    {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadeAtual = 0;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public void acelerar(double incremento) {
        if (incremento > 0) {
            velocidadeAtual += incremento;
            System.out.println("O carro acelerou. Velocidade atual: " + velocidadeAtual + " km/h.");
        } else {
            System.out.println("Valor de aceleração inválido.");
        }
    }

    // Método para frear o carro, diminuindo a velocidade
    public void frear(double decremento) {
        if (decremento > 0) {
            velocidadeAtual -= decremento;
            if (velocidadeAtual < 0) {
                velocidadeAtual = 0; // A velocidade não pode ser negativa
            }
            System.out.println("O carro freou. Velocidade atual: " + velocidadeAtual + " km/h.");
        } else {
            System.out.println("Valor de frenagem inválido.");
        }
    }

    // Método para exibir a velocidade atual do carro
    public void exibirVelocidadeAtual() {
        System.out.println("Velocidade atual: " + velocidadeAtual + " km/h.");
    }

    // Método para exibir as informações do carro
    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidade atual: " + velocidadeAtual + " km/h.");
    }


}
