package org.hiphone.visitor;

/**
 * 具体元素类A
 */
public class ConcreteElementB implements Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operationB() {
        return "具体元素A的操作";
    }
}
