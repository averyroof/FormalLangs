package utils;

import java.util.Objects;

public class Pair<K, V> {

    private K element0;
    private V element1;

    public static <K, V> Pair<K, V> createPair(K element0, V element1) {
        return new Pair<K, V>(element0, element1);
    }

    public Pair(K element0, V element1) {
        this.element0 = element0;
        this.element1 = element1;
    }

    public K getElement0() {
        return element0;
    }

    public V getElement1() {
        return element1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(element0, pair.element0) &&
                Objects.equals(element1, pair.element1);
    }

    @Override
    public int hashCode() {
        return Objects.hash(element0, element1);
    }

    @Override
    public String toString() {
        return " {" +
                "допуск автоматом = " + element0 +
                ", количество символов = " + element1 +
                '}';
    }

}