package org.hiphone.chain;

/**
 * 具体处理角色1
 */
public class ConcreteHandler1 extends Handler {

    @Override
    public void handleRequest(String request) {
        if (request.equals("one")) {
            System.out.println("具体处理者1扶着处理该请求!");
        } else {
            if(this.getNext() != null) {
                this.getNext().handleRequest(request);
            } else {
                System.out.println("没有人处理该请求!");
            }
        }
    }
}
