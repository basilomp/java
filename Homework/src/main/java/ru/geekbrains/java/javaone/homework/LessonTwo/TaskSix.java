package ru.geekbrains.java.javaone.homework.LessonTwo;
//** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место,
// в котором сумма левой и правой части массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||,
// эти символы в массив не входят.
public class TaskSix {
    public static void main(String[] args) {
        balanceCheck();
        System.out.println(balanceCheck());

    }
    private static boolean balanceCheck() {
        int[] balance = {13, 12, 20, 200, 100, 14, 31, 63, 37};
        int sumLeft = 0;
        int sumRight = 0;
        for (int i = 0; i < 4; i++) {
            sumLeft += balance[i];
        }
        for (int j = 4; j < 9; j++) {
            sumRight += balance[j];
        }
        if (sumLeft == sumRight)
            return true;
        else return false;
    }
}




//{13, 12, 20, 200, || 100, 14, 31, 63, 37};
//{0,   1,  2,   3, ||   4,  5,  6,  7,  8};
