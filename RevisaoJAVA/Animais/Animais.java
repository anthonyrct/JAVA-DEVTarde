package RevisaoJAVA.Animais;

public abstract class Animais {
    //atributos
    String proprietario;
    String especie;
    double peso;
    int idade;
    public Animais(String proprietario, String especie, double peso, int idade) {
        this.proprietario = proprietario;
        this.especie = especie;
        this.peso = peso;
        this.idade = idade;
    }
    //gets and sets
    public String getProprietario() {
        return proprietario;
    }
    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }
    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
}
