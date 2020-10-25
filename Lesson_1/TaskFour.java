//4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;

package ru.geekbrains.java.javaone.homework.LessonOne;

public class TaskFour {
    public static void main(String[] args) {
        System.out.println("Результат " + check(7,1));
    }

    static boolean check(int a, int b) {
        return (a + b) >= 10 & (a + b) <= 20;

    }
}
