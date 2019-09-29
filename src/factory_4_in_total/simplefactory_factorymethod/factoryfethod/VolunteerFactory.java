package factory_4_in_total.simplefactory_factorymethod.factoryfethod;

import factory_4_in_total.simplefactory_factorymethod.beans.LeiFeng;
import factory_4_in_total.simplefactory_factorymethod.beans.Volunteer;

/**
 * @author CarterChou at 2019/2/21 13:58
 * @description 新增LeiFeng接口实现类时只需要新增相应的工厂类即可 无需修改已经写好的类   符合开闭原则
 *              不再是static方法  因为要继承工厂接口
 */
public class VolunteerFactory implements FactoryInterface{
    @Override
    public LeiFeng createLeiFeng() {
        return new Volunteer();
    }
}
