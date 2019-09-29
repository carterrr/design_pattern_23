package mediator;

/**
 * @author CarterChou at 2019/4/29 12:50
 * @description
 */
public abstract class Colleague {

    /**
     * 模拟被调用的方法 provider
     */
    public abstract void nootiify(String msg);

    /**
     * 主动调用的方法  consumer   通过meditor来进行
     */
    public abstract void send(String msg, Meditor meditor);
}
