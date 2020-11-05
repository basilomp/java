//1. Полностью разобраться с кодом, попробовать переписать с нуля, стараясь не подглядывать в методичку;
//2. Переделать проверку победы, чтобы она не была реализована просто набором условий, например, с использованием циклов.


package ru.geekbrains.java.javaone.classes.LessonFour;

import java.util.Random;
import java.util.Scanner;

public class TaskOneAndTwo {
    //Переменные параметры
    public static final int SIZE = 3;
    public static final int WIN_CELLS = 3;
    public static final int INDENT = 5;

    //Переменные поля
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();
    public static char[][] board;




    //Константы X O
        public static final char EMPTY = '•';
        public static final char CROSS = 'x';
        public static final char NOUGHT = 'O';



    //Основной метод
    public static void main(String[] args) {

        //Инициализируем игровое поле
        initBoard();
        printBoard();


        //Главный цикл
        while (true) {
            //Ход игрока
            player();

            //Вывод поля после игрока
            printBoard();

            //Проверка победителя
            if (checkWin(NOUGHT)) {
                System.out.println("Поздравляем! Вы выиграли.");
                break;}

            //Проверка полностью заполненного поля
            if (checkDraw()) {
                System.out.println("Ничья! Неn свободных ячеек.");
                break; }


            //Ход бота
            bot();

            //Вывод поля после бота
            printBoard();

            //Проверка победителя
            if (checkWin(CROSS)) {
                System.out.println("Победа бота.");
                break;}

            //Проверка полностью заполненного поля
            if (checkDraw()) {
                System.out.println("Ничья! Не свободных ячеек.");
                break; }
        }
        //Игра закончена
        System.out.println("Игра завершена.");
    }
    //Метод проверки ничьей
    private static boolean checkDraw() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] == EMPTY)
                return false;
                
            }

        }
        return true;
    }

    //Метод заполнения ячеек ботом
    private static void bot() {
        int x, y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isValid(x, y));
        board[y][x] = NOUGHT;
    }

    //Метод проверки победы
    private static boolean checkWin(char oppositeTurn) {
        boolean win = false;
        if (checkLeftRightDiagonal(oppositeTurn) || checkRows(oppositeTurn) || checkColumn(oppositeTurn) || checkRightLeftDiagonal(oppositeTurn))
        { win = true;
            System.out.println("Игрок одержал победу.");}
        return win;}

    //Метод проверки диагонали (левый нижний - правы верхний)
    private static boolean checkRightLeftDiagonal(char oppositeTurn) {
    for (int i = 0; i < board.length; i++) {
        boolean rightLeftDiagonal = true;
            for (int j = board.length - 1; j >= 0 ; j--) {
                if (board[i][j] == EMPTY || board[i][j] == oppositeTurn) {
                    rightLeftDiagonal = false;
                    break; }}
             if(rightLeftDiagonal)
                return true;
            } return false;
    }

    //Метод проверки диагонали (левый верхний - правы нижний)
    private static boolean checkLeftRightDiagonal(char oppositeTurn) {
        boolean leftRightDiagonal = true;
        for (int i = 0; i < board.length; i++) {
            //            for (int j = i; j < board.length; j++) {
            if (board[i][i] == EMPTY || board[i][i] == oppositeTurn) {
                leftRightDiagonal = false;
                }

             } return leftRightDiagonal;
    }

    //Метод проверки колонок
    private static boolean checkColumn(char oppositeTurn) {
        //Проходимся по рядам
        for (int i = 0; i < board.length; i++) {

            boolean column = true;
            //Проходимся по колонкам
            for (int j = 0; j < board[i].length ; j++) {
                if (board[j][i] == EMPTY || board[j][i] == oppositeTurn) {
                    column = false;
                    break; }}
                   if (column)
                       return true;
        } return false;
    }

    //Метод проверки рядов
    private static boolean checkRows(char oppositeTurn) {
        for (int i = 0; i < board.length; i++) {
            //Проходимся по рядам
            boolean row = true;
            for (int j = 0; j < board[i].length; j++) {
                //Проходимся по колонкам
                if (board[i][j] == EMPTY || board[i][j] == oppositeTurn) {
                    row = false;
                    break; }}
    if (row)
        return true;
    }
        return false;
    }

    //Метод пользовательского ввода
    private static void player() {
        int x, y;
        do {
            System.out.println("Введите координаты ячейки (x, y)");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isValid(x, y));
        board[y][x] = CROSS;

    }

    //Метод проверки валидности ячейки
    private static boolean isValid(int x, int y) {
        if (x < 0 || x >= SIZE)
            return false;
        if (y < 0 || y >= SIZE)
            return false;
        if (board[y][x] != EMPTY) return false;
        return true;
    }

    //Метод вывода доски
    private static void printBoard() {
        //Индент перед выводом следующего поля
        for (int i = 0; i < INDENT; i++) {
            System.out.println();
        }
        //Вывод верхних индексов игрового поля
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        //Вывод поля
        for (int y = 0; y < SIZE; y++) {
            System.out.print((y + 1) + " ");
            for (int x = 0; x < SIZE; x++) {
                System.out.print(board[y][x] + " ");
            }
            System.out.println();
        }
        //+ indent
        System.out.println();
    }

    //Метод инициализации доски
    private static void initBoard() {
        board = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
             board[i][j] = EMPTY;

            }

        }
    }
}
