package org.hiphone.chain;

/**
 * 具体处理者角色2
 */
public class ConcreteHandler2 extends Handler {

    @Override
    public void handleRequest(String request) {
        if (request.equals("two")) {
            System.out.println("具体处理者2负责处理该请求！");
        } else {
            if (this.getNext() != null) {
                this.getNext().handleRequest(request);
            } else {
                System.out.println("没有人处理该请求！");
            }
        }
    }
}
