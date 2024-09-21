package ex_1;

public class Círculo {

    double raio;
    double pi = 3.14;

    public Círculo(double raio)
    {
        this.raio = raio;
    }

    public double calcularArea()
    {
        return pi * (raio * raio);
    }


    public double calcularCircunferencia()
    {
        return 2 * pi * raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public void mostrarCalculos()
    {
        System.out.println("Raio: " +raio);
        System.out.println("Área: " +calcularArea());
        System.out.println("Circunferência: " +calcularCircunferencia());
    }

}
