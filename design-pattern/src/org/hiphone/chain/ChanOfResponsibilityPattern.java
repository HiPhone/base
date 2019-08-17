package org.hiphone.chain;

public class ChanOfResponsibilityPattern {

    public static void main(String[] args) {
        //组装责任链
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        handler1.setNext(handler2);
        handler1.handleRequest("two");
    }
}
