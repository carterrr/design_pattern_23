package observer;

/**
 * @author CarterChou at 2019/4/9 19:16
 * @description
 */
public class ObserverClient {


    public static void main(String[] args) {

        ConcreteNotifyer concreteNotifyer = new ConcreteNotifyer();

        concreteNotifyer.attach(new ConcreteObserver("a",concreteNotifyer));
        concreteNotifyer.attach(new ConcreteObserver("b",concreteNotifyer));
        concreteNotifyer.attach(new ConcreteObserver("c",concreteNotifyer));

        concreteNotifyer.setState("ABC");

        concreteNotifyer.notifys();


    }
}
