package observer;

/**
 * @author CarterChou at 2019/4/9 19:02
 * @description
 */
public class ConcreteNotifyer extends Notifyer {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;

    }
}
