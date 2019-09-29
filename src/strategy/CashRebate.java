package strategy;

/**
 * @author CarterChou at 2019/2/18 10:13
 * @description
 */
public class CashRebate implements CashSuper {
    private double moneyRebate = 1d;
    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }
    @Override
    public double acceptCash(double money) {
        return money * moneyRebate;
    }
}
