package homework_26.Task1;

import java.util.List;

public class Pair <T> {

    private T value1;
    private T value2;

    public Pair(T value1, T value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public T getFirst() {
        return value1;
    }

    public void setFirst(T value) {
        this.value1 = value;
    }

    public T getSecond() {
        return value2;
    }

    public void setSecond(T value) {
        this.value2 = value;
    }

    void swap(){
        T temp = value1;
        value1 = value2;
        value2 = temp;

    }

    @Override
    public String toString() {
        return "Pair: {" +
                "value1=" + value1 +
                ", value2=" + value2 +
                '}';
    }
}
