package revEx_1;

public class Main {
    public static void main(String[] args) {

        Leitor leitor = new Leitor();
        double raio = leitor.lerRaio();

        Circulo circulo = new Circulo(raio);
        circulo.exibirRaio();

        Area area = new Area();
        Perimetro perimetro = new Perimetro();

        System.out.print("\nO valor do perimetro é: " +perimetro.calcularPerimetro(circulo));
        System.out.print("\nO valor da área é: " +area.calcularArea(circulo));

    }
}