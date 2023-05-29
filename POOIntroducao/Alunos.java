package POOIntroducao;

public class Alunos extends Pessoas {
    //atributos
    private int nota;

    //métodos
    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public Alunos(int nota) {
        this.nota = nota;
    }

    public Alunos() {
    }
    
    
}
