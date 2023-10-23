public class Task {
    // atributos
    String descripition;
    boolean done;
    boolean setDone;

    // Construtor

    public Task(String descripition) {
        this.descripition = descripition;
        this.done = false;
    }

    public Task(boolean setDone) {
        this.setDone = setDone;
    }

    // getters and setters

    public String getDescripition() {
        return descripition;
    }

    public void setDescripition(String descripition) {
        this.descripition = descripition;
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
