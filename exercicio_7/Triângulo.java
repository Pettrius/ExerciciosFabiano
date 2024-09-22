package exercicio_7;

public class Triângulo {

    double lado1;
    double lado2;
    double lado3;

    public Triângulo(double lado1, double lado2, double lado3)
    {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public int verificaTriangulo()
    {
        if (lado1 + lado2 > lado3 && lado2 + lado3 > lado1 && lado3 + lado1 > lado2)
        {
            return 1;
        }

        else
            return 0;
    }

    public double area()
    {
        if (verificaTriangulo() == 0) {
            System.out.println("As medidas inseridas não formam um triângulo!");
            return 0;
        }

        else {
            double semiPerimetro = (lado1 + lado2 + lado3) / 2;
            return Math.sqrt(semiPerimetro * (semiPerimetro - lado1) *
                    (semiPerimetro - lado2) * (semiPerimetro - lado3));
        }
    }

    public void exibirInformacoes()
    {
        System.out.println("Lado 1: " +lado1);
        System.out.println("Lado 1: " +lado2);
        System.out.println("Lado 1: " +lado3);

        if(verificaTriangulo() == 1)
        {
            System.out.println("O triângulo é válido!");

            System.out.println("A área do triângulo é: " +area());
        }

        else
        {
            System.out.println("O triângulo não é válido");
        }

    }

}
