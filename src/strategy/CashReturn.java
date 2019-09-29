package strategy;

/**
 * @author CarterChou at 2019/2/18 10:15
 * @description
 */
public class CashReturn implements CashSuper {
    private double moneyCondition = 0.0d;
    private double moneyReturn = 0.0d;
    public CashReturn(double moneyCondition, double moneyReturn) {
         this.moneyCondition = moneyCondition;
         this.moneyReturn = moneyReturn;
    }
    @Override
    public double acceptCash(double money) {
        return money>moneyCondition?(money-Math.floor(money / moneyCondition) * moneyReturn):money;
    }
}
