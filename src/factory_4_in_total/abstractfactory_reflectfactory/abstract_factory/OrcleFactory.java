package factory_4_in_total.abstractfactory_reflectfactory.abstract_factory;

import factory_4_in_total.abstractfactory_reflectfactory.beans.IDepartment;
import factory_4_in_total.abstractfactory_reflectfactory.beans.IUser;
import factory_4_in_total.abstractfactory_reflectfactory.beans.OrcleDepartment;
import factory_4_in_total.abstractfactory_reflectfactory.beans.OrcleUser;

/**
 * @author CarterChou at 2019/2/21 19:19
 * @description
 */
public class OrcleFactory implements AbstractFactoryInterface {

    @Override
    public IUser createUser() {
        return new OrcleUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new OrcleDepartment();
    }
}
