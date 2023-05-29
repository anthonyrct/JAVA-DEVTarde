package POOInterface;

public class Trapezio implements FigurasGeometricas {
    int base1;

    int base2;

    int altura;

    int lado1;

    int lado2;

    int perimetro;

    public Trapezio(int base1, int base2, int altura, int lado1, int lado2, int perimetro) {
        this.base1 = base1;
        this.base2 = base2;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.perimetro = perimetro;
    }

    @Override
    public double getArea() {
        return (base1 + base2) * altura / 2;
    }

    @Override
    public String getNomeFigura() {
        return "trapezio";
    }

    @Override
    public double getPerimetro() {

        return base1 + base2 + lado1 + lado2;
    }
}
