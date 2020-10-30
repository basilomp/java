//5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.

package ru.geekbrains.java.javaone.homework.LessonOne;

public class TaskFive {
    public static void main(String[] args) {
        int a = 2;
        check(a);
    }


    private static void check(int a) {
        if (a >= 0) {
            System.out.println("Передано положительное число");
        } else {
            System.out.println("Передано отрицательное число");
        }
    }
}
