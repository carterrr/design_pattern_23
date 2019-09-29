package observer;

/**
 * @author CarterChou at 2019/4/9 19:06
 * @description  依然会有耦合   concreteObserver 持有 concreteNotifyer 对象  从而取得其state
 */
public class ConcreteObserver implements Observer {

    private String name;
    private String state;
    private ConcreteNotifyer concreteNotifyer;

    public ConcreteObserver(String name, ConcreteNotifyer concreteNotifyer) {
        this.name = name;
        this.concreteNotifyer = concreteNotifyer;
    }



    @Override
    public void update() {
        state = concreteNotifyer.getState();

        System.out.println("观察者" + name + "的新状态是" + state);

    }


    public ConcreteNotifyer getConcreteNotifyer() {
        return concreteNotifyer;
    }

    public void setConcreteNotifyer(ConcreteNotifyer concreteNotifyer) {
        this.concreteNotifyer = concreteNotifyer;
    }
}
