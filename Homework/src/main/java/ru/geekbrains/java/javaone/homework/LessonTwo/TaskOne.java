package ru.geekbrains.java.javaone.homework.LessonTwo;

import java.util.Arrays;

// 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
public class TaskOne {
    public static void main(String[] args) {
        int[] array = {1, 0, 0, 1, 1, 1, 0, 1, 0, 0 };
        System.out.println("Оригинальный массив:\t" + Arrays.toString(array)); //Выводим для референса
            for (int i = 0; i < array.length; i++) {
                if (array[i] == 1) {
                    array[i] = 0;
                } else
                    array[i] = 1;
                }
        System.out.println("Измененный массив:\t\t" + Arrays.toString(array)); //Выводим для сравнения с референциальным массивом
   }
}/*
Ожидаемые значения массива
[ 1, 0, 0, 1, 1, 1, 0, 1, 0, 0  ]
[ 0, 1, 1, 0, 0, 0, 1, 0, 1, 1  ]
*/


//То же самое через тернарный оператор (если требует стайлгайд.)


//public class TaskOne {
//    public static void main(String[] args) {
//        // Задаем целочисленный массив.
//        int[] array = {1, 0, 0, 1, 1, 1, 0, 1, 0, 0 };
//        System.out.println("Оригинальный массив:\t" + Arrays.toString(array)); //Выводим для референса
//
//        // Задаем цикл и условие
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (array[i] == 1) ? 0 : 1;
//        }
//        System.out.println("Измененный массив:\t\t" + Arrays.toString(array)); //Выводим для сравнения с референциальным массивом
//}
//
//}