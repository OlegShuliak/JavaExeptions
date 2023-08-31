package Lesson2.homework;

public class Task3 {

    /*
    В методе main не следует пробрасывать Exeption, поскольку программа вылетит без обработки исключения.
     */
    public static void main(String[] args) /*throws Exception*/ {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[3] = 9; // Здесь выход за пределы массива, макс индекс 1, необходимо либо переинициальзировать массив, либо довольствоваться тем, что есть)

            /* Целесообразнее удалить Throwable, так как NullPointerException и IndexOutOfBoundsException
            наследуются от него.
             */
        } /*catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        } */ catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        }
    }

    /*
    Пробрасывать FileNotFoundException не нужно, т.к. мы не работаем с файлами.
     */
    public static void printSum(Integer a, Integer b) /*throws FileNotFoundException*/ {
        System.out.println(a + b);
    }

}
