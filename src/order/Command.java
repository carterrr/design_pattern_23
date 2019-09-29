package order;

/**
 * @author CarterChou at 2019/4/25 12:34
 * @description
 */
public abstract class Command {
    Barbecuer receiver;

    public Command(Barbecuer receiver) {
        this.receiver = receiver;
    }
    public abstract void ExcuteCommand();

}
