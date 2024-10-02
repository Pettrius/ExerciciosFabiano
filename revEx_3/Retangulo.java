package revEx_3;

public class Retangulo {

    public double largura;
    public double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void exibirValores()
    {
        System.out.print("A largura é: " +largura);
        System.out.print("\nA altura é: " +altura);
    }
}
