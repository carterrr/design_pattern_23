package mediator;

/**
 * @author CarterChou at 2019/4/29 12:50
 * @description
 */
public abstract class Meditor {
    Colleague c1;
    Colleague c2;

    public Meditor(Colleague c1, Colleague c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    abstract void send(String message, Colleague colleague);
}
