package factory_4_in_total.abstractfactory_reflectfactory.beans;

/**
 * @author CarterChou at 2019/2/21 18:55
 * @description  Dao层抽象
 */
public interface IDepartment {

    void insert(Department department);

    Department getDepartment(int id);
}
