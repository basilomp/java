//3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода;

package ru.geekbrains.java.javaone.homework.LessonOne;

public class TaskThree {
    public static void main(String[] args) {
        int a = 7;
        int b = 4;
        int c = 6;
        int d = 3;
        result(a, b, c, d);
    }
    public static void result(int a, int b, int c, int d) {
        System.out.println(a * (b + (c / d)));

    }
}
