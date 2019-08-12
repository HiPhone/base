package org.hiphone.prototype;

/**
 * 实现Cloneable接口的原型模式
 */
public class RealizeType implements Cloneable {

    RealizeType() {
        System.out.println("具体原型创建成功！");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功！");
        return (RealizeType) super.clone();
    }
}

