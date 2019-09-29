package visitor;

/**
 * @author CarterChou at 2019/5/20 18:51
 * @description 可以很方便扩展的 操作类
 */
public abstract class Action {
    public abstract void getManConclusion(Man concreteElementA);
    public abstract void getWomanConclusion(Woman concreteElementB);
}
