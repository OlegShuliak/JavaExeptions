/*
Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить
у пользователя ввод данных.
 */

package Lesson2.homework;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        float num = enterFloat();
        System.out.printf("Вы ввели дробное число %.2f", num);
    }

    private static float enterFloat (){
        boolean f = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дробное число:");
        while (true) {
            try {
                float numFloat = Float.parseFloat(scanner.nextLine());
                f = false;
                return numFloat;
            }
           catch (NumberFormatException e){
               System.out.println("Некорректный ввод данных, повторите попытку:");
           }
        }
    }
}
