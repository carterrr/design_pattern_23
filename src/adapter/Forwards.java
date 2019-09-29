package adapter;

/**
 * @author CarterChou at 2019/4/16 12:28
 * @description
 */
public class Forwards extends Player {

    public Forwards(String name) {
        this.name = name;
    }

    @Override
    public void attack() {
        System.out.println("前锋" + getName() + "进攻");
    }

    @Override
    public void defense() {
        System.out.println("前锋" + getName() + "防守");

    }
}
