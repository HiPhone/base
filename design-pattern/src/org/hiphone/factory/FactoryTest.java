package org.hiphone.factory;

import org.hiphone.factory.factory.AbstractFactory;
import org.hiphone.factory.factory.ConcreteFactory1;
import org.hiphone.factory.product.Product;

/**
 * 简单工厂模式测试
 * 缺点： 需要实现多个工厂类, 只考虑同等级产品的生成
 */
public class FactoryTest {

    public static void main(String[] args) {
        Product product;
        AbstractFactory factory;
        factory = new ConcreteFactory1();
        product = factory.newProduct();
        product.show();
    }
}
