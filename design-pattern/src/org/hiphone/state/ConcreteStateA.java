package org.hiphone.state;

/**
 * 具体状态A类
 */
public class ConcreteStateA extends State {

    @Override
    public void handle(Context context) {
        System.out.println("当前状态是A.");
        context.setState(new ConcreteStateB());
    }
}
