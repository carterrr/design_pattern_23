package factory_4_in_total.abstractfactory_reflectfactory.abstract_factory;

import factory_4_in_total.abstractfactory_reflectfactory.beans.IDepartment;
import factory_4_in_total.abstractfactory_reflectfactory.beans.IUser;
import factory_4_in_total.abstractfactory_reflectfactory.beans.MysqlDepartment;
import factory_4_in_total.abstractfactory_reflectfactory.beans.MysqlUser;

/**
 * @author CarterChou at 2019/2/21 21:18
 * @description
 */
public class MysqlFactory implements AbstractFactoryInterface {
    @Override
    public IUser createUser() {
        return new MysqlUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new MysqlDepartment();
    }
}
