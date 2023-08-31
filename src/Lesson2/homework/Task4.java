/*
Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */

package Lesson2.homework;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        enterString();
    }

    private static void enterString (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сообщение:");
        String msg = scanner.nextLine();
        if (msg.isEmpty()) {
            throw new  RuntimeException ("Введено пустое сообщение, пустые сообщения вводить нельзя.");
        }
        else {
            System.out.println(msg);
        }
    }
}
