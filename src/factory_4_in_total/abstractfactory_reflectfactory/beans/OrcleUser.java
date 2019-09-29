package factory_4_in_total.abstractfactory_reflectfactory.beans;

/**
 * @author CarterChou at 2019/2/21 19:13
 * @description
 */
public class OrcleUser implements IUser {
    @Override
    public void insert(User user) {
        System.out.println("orcleuser insert");
    }

    @Override
    public User getUser(int id) {
        return null;
    }
}
