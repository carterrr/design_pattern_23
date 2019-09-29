package observer.delegate;

/**
 * @author CarterChou at 2019/4/9 19:56
 * @description  委托模式    使得观察者模式的通知方法不尽相同 不必实现同一个接口   如 StockObserver  NBAObserver
 */
public class DelegateClient {

    public static void main(String[] args) {
        Boss HuangPeng = new Boss();

        StockObserver huanghuang = new StockObserver("huanghuang", HuangPeng);

        NBAObserver xiechangjiang = new NBAObserver("xiechangjiang", HuangPeng);

        HuangPeng.consumers.add(huanghuang::closeStockMarket);
        HuangPeng.consumers.add(xiechangjiang::closeNBATV);

        HuangPeng.setState("老板回来了~,");

        HuangPeng.notifys();
    }

}
