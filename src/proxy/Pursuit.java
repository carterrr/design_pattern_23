package proxy;

/**
 * @author CarterChou at 2019/2/19 17:59
 * @description
 */
public class Pursuit implements GiftProxy{
    private Girl girl;

    public Pursuit(Girl girl) {
        this.girl =girl;
    }
    @Override
    public void GiveDolls() {
        System.out.println(girl.getName()+"send dolls");
    }

    @Override
    public void GiveFlowers() {
        System.out.println(girl.getName()+"send flowers");
    }

    @Override
    public void GiveChocolate() {
        System.out.println(girl.getName()+"send chocolate");
    }
}
