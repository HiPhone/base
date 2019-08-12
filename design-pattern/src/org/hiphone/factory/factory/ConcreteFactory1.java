package org.hiphone.factory.factory;

import org.hiphone.factory.product.ConcreteProduct1;
import org.hiphone.factory.product.Product;

/**
 * 具体实现工厂
 */
public class ConcreteFactory1 implements AbstractFactory {

    @Override
    public Product newProduct() {
        System.out.println("具体工厂1生成 -> 具体产品1");
        return new ConcreteProduct1();
    }
}
