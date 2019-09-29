package memorandum;

/**
 * @author CarterChou at 2019/4/16 13:48
 * @description 备忘录模式
 */
public class GameRole {

    // 生命值  攻击力 防御力

    private int vit;
    private int ack;
    private int def;

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getAck() {
        return ack;
    }

    public void setAck(int ack) {
        this.ack = ack;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public GameRole() {
        this.vit = 100;
        this.ack = 100;
        this.def = 100;
    }

    // 打boss
    public void fight () {
        this.vit = 0;
        this.ack = 0;
        this.def = 0;
    }
    //展示

    public void roleStateShow() {
        System.out.println("游戏角色 当前状态：");
        System.out.println("生命值：" + vit);
        System.out.println("攻击力：" + ack);
        System.out.println("防御力" + def);
    }

    // 保存角色状态

    public RoleStateMemento saveState () {
        return new RoleStateMemento(vit, ack, def);
    }

    public void recoveryState(RoleStateMemento roleStateMemento) {
        this.vit = roleStateMemento.getVit();
        this.ack = roleStateMemento.getAck();
        this.def = roleStateMemento.getDef();
    }
}
