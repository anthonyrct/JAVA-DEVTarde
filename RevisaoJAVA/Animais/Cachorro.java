package RevisaoJAVA.Animais;

/**
 * Cachorro
 */
public class Cachorro extends Animais {
    String proprietario;
    String especie;
    double peso;
    int idade;

    public Cachorro(String proprietario, String especie, double peso, int idade) {
        super(proprietario, especie, peso, idade);
    }
}