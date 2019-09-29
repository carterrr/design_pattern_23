package memorandum;

/**
 * @author CarterChou at 2019/4/16 13:57
 * @description
 */
public class RoleStateMemento {
    private int vit;
    private int ack;
    private int def;

    public RoleStateMemento(int vit, int ack, int def) {
        this.vit = vit;
        this.ack = ack;
        this.def = def;
    }

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
}
