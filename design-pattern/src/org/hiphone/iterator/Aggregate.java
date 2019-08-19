package org.hiphone.iterator;

/**
 * 抽象聚合类
 */
public interface Aggregate {

    void add(Object obj);

    void remove(Object obj);

    Iterator getIterator();
}
