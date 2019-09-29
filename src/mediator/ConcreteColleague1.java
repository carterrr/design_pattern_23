package mediator;

/**
 * @author CarterChou at 2019/4/29 12:57
 * @description
 */
public class ConcreteColleague1 extends Colleague {

    @Override
    public void nootiify(String msg) {
        System.out.println("同事1得到信息" + msg);
    }

    @Override
    public void send(String msg, Meditor meditor) {
        meditor.send(msg, this);
    }
}
