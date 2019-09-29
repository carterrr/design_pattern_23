package proxy;

/**
 * @author CarterChou at 2019/2/19 18:10
 * @description  代理在外部再套了一层 ， 不叫代理也行 ，持有Girl对象的实际上还是Pursuit追求者 ， 代理只是持有追求者对象
 */
public class ProxyClient {
    public static void main(String[] args) {
        Girl girl = new Girl("jiaojiao");
        Pursuit pursuit = new Pursuit(girl);
        pursuit.GiveChocolate();



        Proxy proxy = new Proxy(pursuit);
        proxy.GiveChocolate();
    }
}
