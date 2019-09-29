package factory_4_in_total.abstractfactory_reflectfactory.beans;

/**
 * @author CarterChou at 2019/2/21 19:14
 * @description
 */
public class MysqlDepartment implements IDepartment {
    @Override
    public void insert(Department department) {
        System.out.println("mysqldepartment insert");
    }

    @Override
    public Department getDepartment(int id) {
        return null;
    }
}
