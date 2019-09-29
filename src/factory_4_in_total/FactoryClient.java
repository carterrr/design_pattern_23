package factory_4_in_total;

import factory_4_in_total.abstractfactory_reflectfactory.abstract_factory.AbstractFactoryInterface;
import factory_4_in_total.abstractfactory_reflectfactory.beans.IUser;
import factory_4_in_total.abstractfactory_reflectfactory.abstract_factory.MysqlFactory;
import factory_4_in_total.abstractfactory_reflectfactory.beans.User;
import factory_4_in_total.abstractfactory_reflectfactory.reflect_abstract_factory.ReflectFactory;
import factory_4_in_total.simplefactory_factorymethod.beans.LeiFeng;
import factory_4_in_total.simplefactory_factorymethod.factoryfethod.FactoryInterface;
import factory_4_in_total.simplefactory_factorymethod.factoryfethod.VolunteerFactory;
import factory_4_in_total.simplefactory_factorymethod.simplefactory.SimpleFactory;

/**
 * @author CarterChou at 2019/2/21 14:04
 * @description   https://juejin.im/post/5ceb3f10f265da1b860864e7?utm_source=gold_browser_extension
 *                  工厂方法模式的一个工厂只能创建一个具体产品。
 *                  而抽象工厂模式的一个工厂可以创建属于一类类型的多种具体产品。
 */
public class FactoryClient {
    public static void main(String[] args) {
        LeiFeng xueleiFeng ;

        // 简单工厂
        xueleiFeng = SimpleFactory.createLeiFeng("UnderGraduate");
        xueleiFeng.sweep();


        // 工厂方法 多态赋值 只改等号右边new factory即可
        FactoryInterface factoryInterface = new VolunteerFactory();
        xueleiFeng = factoryInterface.createLeiFeng();
        xueleiFeng.BuyRice();



        // 抽象工厂方法
        User user = new User();
        AbstractFactoryInterface abstractFactoryInterface = new MysqlFactory();
        IUser iUser = abstractFactoryInterface.createUser();
        iUser.insert(user);

        // 简单工厂降维 + 反射 （+ 配置）
        ReflectFactory reflectFactory = new ReflectFactory();

    }
}
