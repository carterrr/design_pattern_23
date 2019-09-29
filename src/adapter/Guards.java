package adapter;

/**
 * @author CarterChou at 2019/4/16 12:28
 * @description
 */
public class Guards extends Player {

    public Guards(String name) {
        this.name = name;
    }

    @Override
    public void attack() {
        System.out.println("后卫" + getName() + "进攻");
    }

    @Override
    public void defense() {
        System.out.println("后卫" + getName() + "防守");

    }
}
