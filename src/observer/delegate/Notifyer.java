package observer.delegate;

/**
 * @author CarterChou at 2019/4/9 19:41
 * @description
 */
public  abstract class Notifyer {

    String state;

    abstract void notifys();

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
