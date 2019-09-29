package factory_4_in_total.abstractfactory_reflectfactory.beans;

/**
 * @author CarterChou at 2019/2/21 19:16
 * @description
 */
public class OrcleDepartment implements IDepartment {
    @Override
    public void insert(Department department) {
        System.out.println("orcledepartment insert");
    }

    @Override
    public Department getDepartment(int id) {
        return null;
    }
}
