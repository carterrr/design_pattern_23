package factory_4_in_total.simplefactory_factorymethod.beans;

/**
 * @author CarterChou at 2019/2/21 13:50
 * @description 学雷锋的社区志愿者
 */
public class Volunteer implements LeiFeng{
    @Override
    public void sweep() {
        System.out.println("志愿者帮老人扫地");
    }

    @Override
    public void wash() {
        System.out.println("志愿者帮老人洗衣服");

    }

    @Override
    public void BuyRice() {
        System.out.println("志愿者帮老人买米");

    }
}
