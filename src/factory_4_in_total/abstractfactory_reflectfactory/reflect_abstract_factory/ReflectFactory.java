package factory_4_in_total.abstractfactory_reflectfactory.reflect_abstract_factory;

import factory_4_in_total.abstractfactory_reflectfactory.beans.IDepartment;
import factory_4_in_total.abstractfactory_reflectfactory.beans.IUser;

/**
 * @author CarterChou at 2019/2/21 22:19
 * @description     所有通过简单工厂方式的  都可以用反射来解决
 *                  通过包名类名 来获取需要生产的对象类 将配置拆出来即可实现最少修改   将简单工厂的 switch case  用反射加上配置来解决
 *                  但是如果要增加Project表  还是要修改RelfectFactory  不符合开闭原则  但是更加艺术化了
 *
 *                  同抽象工厂 也只适合纵向扩展 但比抽象工厂更加省事  不用去扩展factory 少写了abstractFactoryInterface Mysqlfactory OrcleFactory  三个类
 *                  不符合开闭原则的解决方式 ：增加接口使用工厂方法模式来扩展 如果要增加Project表写成三个反射工厂实现 工厂方法接口  ---------  工厂方法+反射： 终极奥义
 */
public class ReflectFactory {
    public static final String packagename = "factory_4_in_total.abstractfactory_reflectfactory.beans";
    public static final String classname = "MySqlUser";

    public static IUser createUser() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class userClass = Class.forName(packagename+"."+classname);
        return (IUser) userClass.newInstance();
    }
    public static IDepartment createDepartment() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class departmentClass = Class.forName(packagename+"."+classname);
        return (IDepartment) departmentClass.newInstance();
    }
}
