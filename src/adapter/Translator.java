package adapter;

/**
 * @author CarterChou at 2019/4/16 12:39
 * @description 适配器类  要继承  并持有要适配类对象
 */
public class Translator extends Player{

    private ForginCenter forginCenter ;

    public Translator(ForginCenter  forginCenter) {
        this.forginCenter = forginCenter;
    }

    @Override
    public void attack() {
        forginCenter.进攻();
    }

    @Override
    public void defense() {
        forginCenter.防守();
    }
}
