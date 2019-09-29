package factory_4_in_total.simplefactory_factorymethod.beans;

/**
 * @author CarterChou at 2019/2/21 13:48
 * @description 学雷锋的大学生
 */

public class UnderGraduate implements LeiFeng{
    @Override
    public void sweep() {
        System.out.println("大学生帮老人扫地");
    }

    @Override
    public void wash() {
        System.out.println("大学生帮老人洗衣服");
    }

    @Override
    public void BuyRice() {
        System.out.println("大学生帮老人买米");
    }
}
