package org.hiphone.iterator;

public class IteratorPattern {

    public static void main(String[] args) {
        Aggregate ag = new ConcreteAggregate();
        ag.add("中山大学");
        ag.add("华南理工大学");
        ag.add("韶关学院");
        System.out.println("聚合的内容有： ");
        Iterator it = ag.getIterator();
        while (it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj.toString() + "\t");
        }
        Object obj = it.first();
        System.out.println("\nFirst: " + obj.toString());
    }
}
