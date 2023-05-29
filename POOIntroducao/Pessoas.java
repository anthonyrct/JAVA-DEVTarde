package POOIntroducao;

public abstract class Pessoas {
    //atributios
    protected String nome;
    protected String endereco;
    String rg;
    
    //métodos
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public abstract String getRg();
    
    public abstract void setRg(String rg    );
    
}
