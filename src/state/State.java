package state;

/**
 * @author CarterChou at 2019/4/10 13:36
 * @description   抽象状态  具体状态会含有切换逻辑
 */
public interface State {
    void stateDeal(Work work);
}
