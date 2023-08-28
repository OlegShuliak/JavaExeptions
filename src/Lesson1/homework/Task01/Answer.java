/*
Реализуйте 3 метода, чтобы в каждом из них получить разные исключения.
Метод arrayOutOfBoundsException - Ошибка, связанная с выходом за пределы массива
Метод divisionByZero - Деление на 0
Метод numberFormatException - Ошибка преобразования строки в число
Важно: они не должны принимать никаких аргументов
 */

package Lesson1.homework.Task01;

public class Answer {
    public static void arrayOutOfBoundsException() {
        // Напишите свое решение ниже
        int [] array = new int[] {2, 3, 5};
        int numInArray = array[5];
    }

    public static void divisionByZero() {
        // Напишите свое решение ниже
        int num = 5/0;
    }

    public static void numberFormatException() {
        // Напишите свое решение ниже
        String text = "Hello";
        Integer textInNum = Integer.parseInt(text);
    }
}
