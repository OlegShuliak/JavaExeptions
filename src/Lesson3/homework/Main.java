package Lesson3.homework;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        PersonInfo person = new PersonInfo();
        FileWorker fileWorker = new FileWorker();

        System.out.println("Введите данные пользователя (Фамилия, Имя, Отчество, Дата рождения, Номер телефона, пол) через пробел в формате:");
        System.out.println("Иванов Иван Иванович 01.01.1990 1234567 m");

        while (true) {
            String[] infoArray = scanner.nextLine().split(" ");
            person.create(infoArray);
            try {
                if (!person.getDate().toString().equals("<null>") & !person.getNumber().toString().equals("<0>") & !person.getGender().toString().equals("<null>")) {
                    break;
                }
            } catch (NullPointerException e) {
                System.out.println("Повторите попытку ввода данных:");
            }
        }

        fileWorker.writeInFile(person);
    }
}
