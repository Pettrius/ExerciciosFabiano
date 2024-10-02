package revEx_3;

public class Main {
    public static void main(String [] args)
    {
        Leitor leitor = new Leitor();
        double largura = leitor.lerLargura();
        double altura = leitor.lerAltura();

        Retangulo retangulo = new Retangulo(largura, altura);
        retangulo.exibirValores();

        Area area = new Area();
        Perimetro perimetro = new Perimetro();

        System.out.print("\nA área do retângulo é: " +area.calcularArea(retangulo));
        System.out.print("\nO perímetro do retângulo é: " +perimetro.calcularPerimetro(retangulo));
    }
}
