package ru.geekbrains.java.javaone.homework.LessonTwo;

import java.util.Arrays;

//7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
// при этом метод должен сместить все элементымассива на n позиций. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
public class TaskSeven {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6}; // Задаем первоначальный массив
        int n = 2; // Задаем параметр смещения
        System.out.println("Шаг смещения: " + n);
        System.out.println("Первоначальный массив: \t\t " + Arrays.toString(array));

        //Задаем условие для шага с положительным шагам (направо)
        if (n > 0) {
            for (int i = 0; i < n; i++) { //Пишем цикл для смещения каждого элемента массива
                int empty = array[array.length - 1]; //Декларируем и инициализируем переменную для того, чтобы хранить выпадающее значение
                for (int j = array.length - 1; j > 0 ; j--) {
                    array[j] = array[j - 1];
                }
                array[0] = empty;
            }

        }else if (n < 0) { //Задаем аналогичные условия и цикл для работы с отрицательным шагом (влево)
            for (int i = 0; i < n * (-1); i++) {
                int empty = array[0];
                for (int j = 0; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[array.length - 1] = empty;
            }
        }
        System.out.println("Массив после смещения: \t\t " + Arrays.toString(array));
        System.out.println("Референс смещения (n = 2):\t [5, 6, 1, 2, 3, 4]");
        System.out.println("Референс смещения (n = -2):\t [3, 4, 5, 6, 1, 2]");

        }
    }