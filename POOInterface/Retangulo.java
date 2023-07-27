package POOInterface;

public class Retangulo implements FigurasGeometricas {
    int base;

    int altura;

    public Retangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double getArea() {

        return base * altura;
    }

    @Override
    public String getNomeFigura() {

        return "Retangulo";
    }

    @Override
    public double getPerimetro() {

        return (base + altura) * 2;
    }
}
