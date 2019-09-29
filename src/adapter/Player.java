package adapter;

/**
 * @author CarterChou at 2019/4/16 12:26
 * @description
 */
public abstract class Player {

    public  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void attack();

    public abstract void defense();

}

