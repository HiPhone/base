package org.hiphone.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体聚合类
 */
public class ConcreteAggregate implements Aggregate {

    private List<Object> list = new ArrayList<>();

    public void add(Object obj) {
        list.add(obj);
    }

    public void remove(Object object) {
        list.remove(object);
    }

    public Iterator getIterator() {
        return new ConcreteIterator(list);
    }
}
