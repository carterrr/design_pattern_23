package iterator;

import java.util.List;

/**
 * @author CarterChou at 2019/4/20 22:43
 * @description
 */
public class ConcreteAggregate implements Aggregate {
    private List<String> items;

    public ConcreteAggregate(List <String> items) {
        this.items = items;
    }

    /**
     * todo 有待改进 iterator必须与具体迭代器对象耦合  如何只与接口耦合？  --> 将抽象Aggregate 上移到Iterator中  也不可
     * @return
     */
    @Override
    public Iterator createIterator() {
        // return new Iterator();
        return new ConcreteIterator(this);
    }

    @Override
    public Iterator createReverseIterator() {
        // return new Iterator();
        return new ReverseIterator(this);
    }

    @Override
    public Object get(int i) {
        return items.get(i);
    }

    @Override
    public int count() {
        return items.size();
    }
}
