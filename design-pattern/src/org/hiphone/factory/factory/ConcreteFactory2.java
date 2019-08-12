package org.hiphone.factory.factory;

import org.hiphone.factory.product.ConcreteProduct2;
import org.hiphone.factory.product.Product;

/**
 * 具体实现类
 */
public class ConcreteFactory2 implements AbstractFactory {

    @Override
    public Product newProduct() {
        System.out.println("具体工厂2生成 -> 具体产品2");
        return new ConcreteProduct2();
    }
}
