package main.java.com.andreyDelay.javacore.chapter14.override;

public class Gen<T> {
    T object;

    Gen(T object) {
        this.object = object;
    }

    T getObject() {
        return object;
    }

}
