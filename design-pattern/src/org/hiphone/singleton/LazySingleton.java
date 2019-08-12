package org.hiphone.singleton;

/**
 * 懒汉式单例模式, 类加载时没有生成单例, 只有第一次调用getInstance犯法时才会创建单例
 * 需要使用volatile和synchronized确保 加上了双重校验
 */
public class LazySingleton {

    private static volatile LazySingleton instance = null;
    private LazySingleton() {}
    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
