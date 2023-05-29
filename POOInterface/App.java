package POOInterface;

public class App {
    public static void main(String[] args) {
        Retangulo figura2 = new Retangulo(10, 5);
        // array de objetos
        Trapezio figTrapezio[] = new Trapezio[5];
        figTrapezio[0] = new Trapezio(10, 5, 6, 7, 8, 6);

        for (int i = 0; i < figTrapezio.length; i++) {
            figTrapezio[i] = new Trapezio(i + 5, i, i + 1, i + 2, i + 3, i + 4);
        }

        System.out.println("Nome da Figura é: " + figura2.getNomeFigura()
                + "\n Area = " + figura2.getArea()
                + "\n Perimetro = " + figura2.getPerimetro());

        Quadrado figura1 = new Quadrado(5);

        System.out.println("Nome da Figura é: " + figura1.getNomeFigura()
                + "\n Area = " + figura1.getArea()
                + "\n Perimetro = " + figura1.getPerimetro());
    }
}
