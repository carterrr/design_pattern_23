package factory_4_in_total.abstractfactory_reflectfactory.abstract_factory;

import factory_4_in_total.abstractfactory_reflectfactory.beans.IDepartment;
import factory_4_in_total.abstractfactory_reflectfactory.beans.IUser;

/**
 * @author CarterChou at 2019/2/21 15:57
 * @description     适合某一维上的大量扩展
 *                  多个维度上的产品系统时 使用抽象方法模式 先纵向在横向  像坐标定位一样找到相应的对象实例
 *                  不适合 横向大量扩展如增加project表   需要增加Project MysqlProject OrcleProject三个类 并修改AbstractFactoryInterface Mysqlfactory OrcleFactory三个类
 *                  但是很适合 纵向扩展 如增加 SQLiteFactory 类
 */
public interface AbstractFactoryInterface {

    IUser createUser();

    IDepartment createDepartment();

}
