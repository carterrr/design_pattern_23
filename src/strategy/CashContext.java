package strategy;

/**
 * @author CarterChou at 2019/2/18 10:23
 * @description combine with strategy and factory design pattern
 */
public class CashContext {
    private CashSuper cs;

    /**
     * @param cbxType
     * @description combine with strategy and factory design pattern  策略工厂模式
     */
    public CashContext(String cbxType) {
        switch (cbxType) {
            case "正常收费" :
                cs = new CashNormal();
                break;
            case "打8折收费" :
                cs = new CashRebate(0.8d);
                break;
            case  "满300减100" :
                cs = new CashReturn(300,100);
                break;
            default:
        }
    }
    public double getResult (double money) {
        return cs.acceptCash(money);
    }
}


