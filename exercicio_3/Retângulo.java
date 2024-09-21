package ex_3;

public class Retângulo {

    double largura;
    double altura;

    public Retângulo(double largura, double altura)
    {
        this.largura = largura;
        this.altura = altura;
    }

    public double perimetro()
    {
        return (2 * largura) + (2 * altura);
    }

    public double area()
    {
        return largura * altura;
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

    public void mostrarCalculos()
    {
        System.out.println("Altura: " +altura);
        System.out.println("Largura: " +largura);
        System.out.println("Área: " +area());
        System.out.println("Perímetro: " +perimetro());
    }

}
