//7. Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;


package ru.geekbrains.java.javaone.homework.LessonOne;
h
public class TaskSeven {
    public static void main(String[] args) {
    greetings("Венедикт");
    }
    static void greetings(String name) {
        System.out.println("Привет, " + name + "!");

    }
}
