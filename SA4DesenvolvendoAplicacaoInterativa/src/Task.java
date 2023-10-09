public class Task {
    // atributos
    String descripition;
    boolean done;

    // Construtor
    public Task(String descripition) {
        this.descripition = descripition;
        this.done = false;
    }
    //getters and setters
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

}
