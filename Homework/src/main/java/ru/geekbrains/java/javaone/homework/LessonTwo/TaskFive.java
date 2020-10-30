package ru.geekbrains.java.javaone.homework.LessonTwo;

import java.lang.reflect.Array;

//5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
public class TaskFive {
    public static void main(String[] args) {
        int[] array = {13, -14000, 584, 0, 499, 4, -42, 666, 999};
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] < min)
                min = array[i];


            if (array[i] > max)
                max = array[i];

            
        }
        System.out.println("Минимальное элемент в цикле: \t" + min);
        System.out.println("Максимальный элемент в цикле: \t" + max);
    }

    }


