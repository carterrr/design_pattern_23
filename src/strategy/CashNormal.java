package strategy;

/**
 * @author CarterChou at 2019/2/18 10:11
 * @description
 */
public class CashNormal implements CashSuper{
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
