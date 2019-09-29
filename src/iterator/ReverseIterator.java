package iterator;

/**
 * @author CarterChou at 2019/4/22 12:22
 * @description  反向遍历迭代器
 */
public class ReverseIterator implements Iterator {
    private Aggregate aggregate;
    
    private int current ;

    public ReverseIterator(Aggregate aggregate) {
        this.aggregate = aggregate;
        current = aggregate.count() - 1;
    }

    @Override
    public Object first() {
        return aggregate.get(aggregate.count() - 1);
    }

    @Override
    public Object next() {
        current --;
        if (current >=0 ){
            return aggregate.get(current);
        }
        return null;
    }

    @Override
    public boolean isDone() {
        if (current >=0 ){
            return false;
        }
        return true;
    }

    @Override
    public Object current() {
        return aggregate.get(current);
    }
}
