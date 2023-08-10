package sem7.patterns.singleton;

public class Singleton {
    private static Singleton instance;
    private String data;

    // Приватный конструктор, чтобы предотвратить создание экземпляров извне
    private Singleton() {
        data = "Initial data";
    }

    // Метод для получения единственного экземпляра класса
    // Singleton instance = new Singleton

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Метод для получения данных
    public String getData() {
        return data;
    }

    // Метод для изменения данных
    public void setData(String newData) {
        data = newData;
    }
}

