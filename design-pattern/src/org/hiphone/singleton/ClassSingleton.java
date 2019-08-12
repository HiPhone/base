package org.hiphone.singleton;

/**
 * 内部类实现单例模式, 确保线程安全, 保证单例的唯一性，也可以延迟加载
 */
public class ClassSingleton {

    private ClassSingleton() {}

    private static class SingletonHolder {
        private static ClassSingleton instance = new ClassSingleton();
    }

    public static ClassSingleton getInstance() {
        return SingletonHolder.instance;
    }
}
