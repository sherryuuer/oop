package iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate extends Aggregate {
    private List<Object> items = new ArrayList<>();

    public int count() {
        return items.size();
    }

    public Object get(int index) {
        return items.get(index);
    }

    public void set(int index, String value) {
        items.add(index, value);
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }
}
