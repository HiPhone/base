package org.hiphone.singleton;

/**
 * 类一旦加载就创建一个单例，保证调用的getInstance方法之前,单例就已经存在
 */
public class HungrySingleton {

    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {}

    public static HungrySingleton getInstance() {
        return instance;
    }
}
