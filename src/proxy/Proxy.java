package proxy;

/**
 * @author CarterChou at 2019/2/19 18:01
 * @description
 */
public class Proxy implements GiftProxy {
    private Pursuit pursuit;

    public Proxy(Pursuit pursuit) {
        this.pursuit = pursuit;
    }

    @Override
    public void GiveDolls() {
        pursuit.GiveDolls();
        System.out.println("by proxy");
    }

    @Override
    public void GiveFlowers() {
        pursuit.GiveFlowers();
        System.out.println("by proxy");
    }

    @Override
    public void GiveChocolate() {
        pursuit.GiveChocolate();
        System.out.println("by proxy");
    }
}
