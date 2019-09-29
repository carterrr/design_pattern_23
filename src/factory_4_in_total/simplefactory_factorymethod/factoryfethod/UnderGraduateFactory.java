package factory_4_in_total.simplefactory_factorymethod.factoryfethod;

import factory_4_in_total.simplefactory_factorymethod.beans.LeiFeng;
import factory_4_in_total.simplefactory_factorymethod.beans.UnderGraduate;

/**
 * @author CarterChou at 2019/2/21 14:00
 * @description  新增LeiFeng接口实现类时只需要新增相应的工厂类即可 无需修改已经写好的类   符合开闭原则
 */
public class UnderGraduateFactory implements FactoryInterface{
    @Override
    public LeiFeng createLeiFeng() {
        return new UnderGraduate();
    }
}
