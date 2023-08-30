package Lesson2.seminar;

import java.io.*;

public class ex4 {

    public static void main(String[] args) {
        ex();
    }

    private static void ex(){
    try (InputStream inputStream = new FileInputStream("dfgdg")) {
        String[] strings = {"abc", "agg"};
        String strings1 = strings[1];
        test();
        int a = 1 / 0;
    }
    catch (ArithmeticException exception) {
        System.out.println("Ошибка в арифметическом выражении");
        exception.printStackTrace();
    }
    catch (IndexOutOfBoundsException exception) {
        System.out.println("Выход за границу массива");
        exception.printStackTrace();
    }
    catch (Exception e) {
        e.printStackTrace();
    }
    finally {
        System.out.println("Я все равно выполнился!");
    }
     System.out.println("Я жив!");
    }

    private static void test() throws IOException {
    File file = new File("file");
    file.createNewFile();
        FileReader reader = new FileReader(file);
        reader.read();
        //test();
    }
}
