package POOInterface;

public class Retangulo implements FigurasGeometricas{
    int base;

    int altura;

    

    public Retangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        return base*altura;
    }

    @Override
    public String getNomeFigura() {
        // TODO Auto-generated method stub
        return "Retangulo";
    }

    @Override
    public double getPerimetro() {
        // TODO Auto-generated method stub
        return (base + altura)*2;
    }
}
