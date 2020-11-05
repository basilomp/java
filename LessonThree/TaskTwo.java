package ru.geekbrains.java.javaone.homework.LessonThree;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//* Создать массив из слов
// String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
//При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
//сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь. Если слово не угадано, компьютер показывает буквы которые стоят на своих местах.
//apple – загаданное
//apricot - ответ игрока
//ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
//Для сравнения двух слов посимвольно, можно пользоваться:
//String str = "apple";
//str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
//Играем до тех пор, пока игрок не отгадает слово
//Используем только маленькие буквы
public class TaskTwo {
    public static Scanner scanner = new Scanner(System.in);
        public static void main(String[] args) {
            do {
            String[] wordList = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
            guess(wordList); }
        while (accept());
            System.out.println("Спасибо за игру!");
        scanner.close();}

        public static void guess (String[] wordArray) {
            int random = new Random().nextInt(wordArray.length);
            boolean victory = false;
            boolean flag;
            char[] stringComp;
            char[] inputComp;
            String input;
            StringBuilder tag = new StringBuilder("###############");
            String string;
            System.out.println("Угадайте слово: " + tag);
            while (!victory) {
                string = wordArray[random];
                stringComp = string.toCharArray();
//                System.out.println("Угадайте слово");
                input = scanner.nextLine();
                inputComp = input.toCharArray();
                for (char c : stringComp) {
                    flag = false;
                    String stringLow = String.valueOf(c).toLowerCase();
                    for (char value : inputComp) {
                        String inputLow = String.valueOf(value).toLowerCase();
                        if (stringLow.equals(inputLow)) {
                            flag = true;
                            break;
                        }

                    }
                    if (!flag) string = string.replace(stringLow, "#");

                }
                if (Arrays.equals(stringComp, inputComp))
                    victory = true;
                else {
                    System.out.println("Вы не угадали. Попробуйте еще раз\n" + string + tag);
                }


            }
            System.out.println("Поздравляем! Вы угадали слово.");

        }
        public static boolean accept() {
            System.out.println("Хотите сыграть еще раз?");
            System.out.println("Введите:\n 1 - да.\n 0 - чтобы сдаться");
            int answer = scanner.nextInt();
            return answer == 1;
        }
     }