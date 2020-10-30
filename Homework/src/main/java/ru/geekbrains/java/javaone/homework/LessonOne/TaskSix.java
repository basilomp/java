//6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;

package ru.geekbrains.java.javaone.homework.LessonOne;

public class TaskSix {
    public static void main(String[] args) {
        int a = -4;
        System.out.println(check(a));
    }
    static boolean check(int a) {
        return a < 0;
    }
}
