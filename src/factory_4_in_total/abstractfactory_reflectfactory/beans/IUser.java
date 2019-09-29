package factory_4_in_total.abstractfactory_reflectfactory.beans;

/**
 * @author CarterChou at 2019/2/21 18:52
 * @description Dao层抽象
 */

public interface IUser {
    void insert(User user);

    User getUser(int id);
}
