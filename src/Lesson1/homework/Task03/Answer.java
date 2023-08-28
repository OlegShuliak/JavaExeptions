/*
Реализуйте метод divArrays, принимающий в качестве аргументов два целочисленных массива a и b,
и возвращающий новый массив с, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
Если длины массивов не равны - верните нулевой массив длины 1.
Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.
Напишите свой код в методе divArrays класса Answer. Метод divArrays принимает на вход два параметра:

int[] a - первый массив
int[] b - второй массив
 */

package Lesson1.homework.Task03;

public class Answer {
    public int[] divArrays(int[] a, int[] b){
        // Введите свое решение ниже
        if (a.length != b.length) return new int[1];
        else {
            int[] c = new int[a.length];
            for (int i = 0; i < a.length; i++){
                try {
                    c[i] = a[i] / b[i];
                }
                catch (ArithmeticException e){
                    System.out.println( new RuntimeException ("Невозможно найти частное."));
                }
            }
            return c;
        }

    }
}
