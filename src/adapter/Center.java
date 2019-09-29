package adapter;

/**
 * @author CarterChou at 2019/4/16 12:28
 * @description
 */
public class Center extends Player {
    public Center(String name) {
        this.name = name;
    }

    @Override
    public void attack() {
        System.out.println("中锋" + getName() + "进攻");
    }

    @Override
    public void defense() {
        System.out.println("中锋" + getName() + "防守");

    }
}
