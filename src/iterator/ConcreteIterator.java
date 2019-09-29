package iterator;

/**
 * @author CarterChou at 2019/4/20 22:32
 * @description
 */
public class ConcreteIterator implements Iterator{

    private Aggregate aggregate;

    private int current = 0;

    public ConcreteIterator(Aggregate aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public Object first() {
        return aggregate.get(0);
    }

    @Override
    public Object next() {
        current ++;
        if (current < aggregate.count()) {
            return aggregate.get(current);
        }
        return null;
    }

    @Override
    public boolean isDone() {
        // 注意这种简化写法  将if - else 简化直接return
        return current >= aggregate.count();

    }

    @Override
    public Object current() {
        return aggregate.get(current);
    }
}
