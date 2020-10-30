package ru.geekbrains.java.javaone.homework.LessonTwo;

import java.util.Arrays;

//4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
public class TaskFour {
    public static void main(String[] args) {
        int[][] array = new int[10][10]; //декларируем и инициализируем массив
        // Создаем цикл
        for (int i = 0; i < array.length ; i++) {
            //Cоздаем вложенный цикл
            for (int j = 0; j < array.length; j++) {
                //Задаем условие выбора элемента массива
                if ((i == j) || (i == array.length - 1 - j))
                    //Заполняем элемент массива значением
                    array[i][j] = 1;
                System.out.print(array[i][j] + " "); //Выводим массив
            }
            System.out.println();//Для возврата каретки
        }
    }
}
