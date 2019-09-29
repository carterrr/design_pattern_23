package component;

/**
 * @author CarterChou at 2019/4/20 21:13
 * @description  抽象公司接口
 */
public abstract class BaseCompany {
    protected String name;

    public BaseCompany(String name) {
        this.name = name;
    }

    public abstract void add(BaseCompany c);

    public abstract void remove(BaseCompany c);

    /**
     * 展示部门结构
     */
    public abstract void display(int depth);

    /**
     * 履行部门职责
     */
    public abstract void lineOfDuty();



}
