package factory_4_in_total.simplefactory_factorymethod.simplefactory;

import factory_4_in_total.simplefactory_factorymethod.beans.LeiFeng;
import factory_4_in_total.simplefactory_factorymethod.beans.UnderGraduate;
import factory_4_in_total.simplefactory_factorymethod.beans.Volunteer;

/**
 * @author CarterChou at 2019/2/21 13:51
 * @description  简单工厂方法  当新增实现子类时要修改工厂新增case 违背了开放-封闭原则
 */
public class SimpleFactory {

    public static LeiFeng createLeiFeng(String type) {

         LeiFeng leiFeng = null;
        switch (type){
            case "UnderGraduate" :
                leiFeng = new UnderGraduate();
                break;
            case "Volunteer" :
                leiFeng = new Volunteer();
                break;
            default:
        }
        return leiFeng;
    }

}
