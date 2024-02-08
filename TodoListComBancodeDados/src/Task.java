public class Task {
    // atributos
    String descricao;
    boolean done;
    boolean setDone;

    // construtor
    public Task(String descricao, boolean done, boolean setDone) {
        this.descricao = descricao;
        this.done = done;
        this.setDone = setDone;
    }

    public Task(String descricao) {
        this.descricao = descricao;
        this.done = false;
    }

    // getters and setters
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public boolean isSetDone() {
        return setDone;
    }

    public void setSetDone(boolean setDone) {
        this.setDone = setDone;
    }

}
