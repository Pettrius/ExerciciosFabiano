package revEx_1;

public class Circulo {

    public double raio;
    public double pi;

    public Circulo(double raio) {
        this.raio = raio;
        this.pi = 3.14;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public void exibirRaio()
    {
        System.out.print("O raio eh: " +raio);
    }
}
