package org.hiphone.share;

/**
 * 具体享元橘色
 */
public class ConcreteFlyweight implements Flyweight {

    private String key;

    ConcreteFlyweight(String key) {
        this.key = key;
        System.out.println("具体享元" + key + "被创建");
    }

    @Override
    public void operation(UnsharedConcreteFlyweight outState) {
        System.out.println("具体享元" + key + "被调用");
        System.out.println("非享元信息是：" + outState.getInfo());
    }
}
