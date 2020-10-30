//8. * Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.

package ru.geekbrains.java.javaone.homework.LessonOne;

public class TaskEight {
    public static void main(String[] args) {
    int a = 100;
    leapYear(a);
    }
    static void leapYear(int a) {
        if ((a % 4 == 0) || (a % 400 == 0) && !(a % 100 == 0)) {
            System.out.println(a + " - високосный год.");
        } else {
            System.out.println(a + " - невисокосный год.");
        }
    }
}