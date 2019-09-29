package observer.delegate;

/**
 * @author CarterChou at 2019/4/9 19:40
 * @description 看股票的同事  通知者改变之后通知的观察者不尽相同  无需实现相同接口”
 */
public class StockObserver {
    private String name;

    private Notifyer notifyer;

    public StockObserver(String name, Notifyer notifyer) {
        this.name = name;
        this.notifyer = notifyer;
    }

    public void closeStockMarket(Object state) {

        System.out.println(notifyer.state + name + ",关闭股票窗口哦");
    }


}
