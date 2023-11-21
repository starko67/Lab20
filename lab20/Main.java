package lab20;
import java.io.Serializable;

// Пустой класс Animal для демонстрации ограничений
class Animal implements Serializable {}

// Обобщенный класс с тремя параметрами (T, V, K)
class TripleClass<T extends Comparable<? super T>, V extends Animal & Serializable, K> {
    private T first;
    private V second;
    private K third;

    // Конструктор, принимающий на вход параметры типа (T, V, K)
    public TripleClass(T first, V second, K third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    // Методы возвращающие значения трех переменных
    public T getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    public K getThird() {
        return third;
    }

    // Метод, выводящий на консоль имена классов для трех переменных класса
    public void displayClassNames() {
        System.out.println("Type of T: " + first.getClass().getSimpleName());
        System.out.println("Type of V: " + second.getClass().getSimpleName());
        System.out.println("Type of K: " + third.getClass().getSimpleName());
    }
}

public class Main {
    public static void main(String[] args) {
        // Создание объекта TripleClass
        TripleClass<Integer, Animal, String> triple = new TripleClass<>(10, new Animal(), "Hello");

        // Вывод имен классов переменных
        triple.displayClassNames();
    }
}


