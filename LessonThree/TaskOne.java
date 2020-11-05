package ru.geekbrains.java.javaone.homework.LessonThree;

import java.util.Random;
import java.util.Scanner;

//1. Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3 попытки угадать это число.
// При каждой попытке компьютер должен сообщить больше ли указанное пользователем число чем загаданное, или меньше.
// После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
public class TaskOne {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        do {
        for (int i = 10; i <= 10; i++)
                guessNumber(i);}
        while (accept());
            System.out.println("Спасибо за игру!");
            scanner.close();
        }


    public static void guessNumber(int range) {
        Random random = new Random();
        int number = random.nextInt(range);
        int tries = 3;
        System.out.printf("Угадайте число от 0 до %d\nУ вас есть попыток: %d\n", range, tries);
        while (tries != 0) {
            int inputNumber = scanner.nextInt();
                if (inputNumber == number) {
                    System.out.println("Верно!");
                    break;
                } else if (inputNumber < number) {
                    tries--;
                    System.out.println("Загаданное число больше.\nУ вас осталось попыток: " + tries + " ");

                } else {
                    tries--;
                    if (tries != 0) {
                    System.out.println("Загаданное число меньше.\n У вас осталось попыток: " + tries + " ");}
                    else {System.out.println("Вы проиграли :(\n");}
            }
        }

    }

    public static boolean accept() {
        System.out.println("Хотите сыграть еще раз?");
        System.out.println("Введите:\n 1 - да.\n 0 - чтобы сдаться");
        int answer = scanner.nextInt();
        return answer == 1;
    }
}
