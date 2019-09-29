package iterator;

import java.util.Arrays;
import java.util.List;

/**
 * @author CarterChou at 2019/4/20 21:59
 * @description  迭代器模式
 *               分离了集合对象的遍历行为
 *               抽离出迭代器使得既不暴露集合的内部结构
 *               又可以让外部代码透明的访问集合的内部数据
 *
 *              多数java迭代器是现成的 也可以针对具体的业务实现独特的遍历方式 如反向遍历
 */
public class IteratorClient {
    public static void main(String[] args) {
        String[] str={"AAA","BBB","CCC"};
        List<String> itemList = Arrays.asList(str);

        Aggregate aggregate = new ConcreteAggregate(itemList);

        Iterator iterator = aggregate.createReverseIterator();

        while (!iterator.isDone()) {
            System.out.println(iterator.current());
            iterator.next();
        }
    }
}
