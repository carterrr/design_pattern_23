package iterator;

/**
 * @author CarterChou at 2019/4/20 22:18
 * @description 迭代器抽象类
 */
public interface Iterator {

    abstract Object first();
    abstract Object next();
    abstract boolean isDone();
    abstract Object current();
}
