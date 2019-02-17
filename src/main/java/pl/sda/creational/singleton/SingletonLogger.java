package pl.sda.creational.singleton;

public class SingletonLogger {

//    INSTANCE;

    private SingletonLogger() {

    }

    private static SingletonLogger instance;

    public static SingletonLogger getInstance() {
        if (instance == null) {
            instance = new SingletonLogger();
        }
        return instance;
//        return INSTANCE;
    }


    public void log(String text) {
        System.out.println(text);
    }
}
