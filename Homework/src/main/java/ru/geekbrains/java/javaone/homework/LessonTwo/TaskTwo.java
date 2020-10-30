package ru.geekbrains.java.javaone.homework.LessonTwo;

import java.util.Arrays;

// 2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
public class TaskTwo {
    public static void main(String[] args) {
        int[] array = new int[8];
        for (int i = 0, j = 0; i < array.length; i++, j += 3)
            array[i] = j;
            System.out.println("Заполненный массив: " + Arrays.toString(array));
    }}










//Вариант 1. Непрактичный.
//public class TaskTwo {
//public static void main(String[] args) {
//    int[] array = new int[8];
//    for (int i = 0; i < array.length; i++) {
//        array[i] += 3 * i;
//    }
//    System.out.println("Заполненный массив: " + Arrays.toString(array));
//}
//}
