package adapter;

/**
 * @author CarterChou at 2019/4/16 12:36
 * @description  需要适配的类 不用继承Player
 */
public class ForginCenter {
    private String name;

    public ForginCenter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void 进攻(){
        System.out.println("外籍中锋" + name + "进攻");
    }

    public void 防守(){
        System.out.println("外籍中锋" + name + "防守");
    }

}
