package iterator;

/**
 * @author CarterChou at 2019/4/20 22:20
 * @description 聚集抽象类
 */
public interface Aggregate {
    /**
     * 创建迭代器
     * @return Iterator
     */
    Iterator createIterator();

    /**
     * 创建反向迭代器
     */
    Iterator createReverseIterator();
    /**
     * 获取聚集对象的第i个元素
     * @param i
     * @return
     */
    Object get(int i);

    /**
     * @return 聚集元素总个数
     */
    int count();

}
