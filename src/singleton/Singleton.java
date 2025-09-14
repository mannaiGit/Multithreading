package singleton;
class Singleton {
    private static volatile Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) { // 1er check
            synchronized (Singleton.class) {
                if (instance == null) { // 2e check
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
