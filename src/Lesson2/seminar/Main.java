package Lesson2.seminar;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Main {
    static  String fileName = "src\\Lesson2\\seminar\\list.txt";
    static  String fileName2 = "src\\Lesson2\\seminar\\listNew.txt";
    private static LinkedHashMap<String, Integer> hashMap;

    public static void main(String[] args) {
        String line;
        hashMap = new LinkedHashMap<>();
        readFile(fileName);
        saveFile(fileName2);
    }

    private static void readFile(String fileName) {
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))){
            while ((line = br.readLine()) != null){
                String[] temp = line.split("=");
                checkLength(temp);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void checkLength(String[] str){
       try {
           if (str[1].equals("?")) {
               hashMap.put(str[0], str[0].length());
               ;
           } else {
               hashMap.put(str[0], Integer.parseInt(str[1]));
           }
       } catch (NumberFormatException ex){
           System.err.printf("Неверный формат данных в строке со значением %s.", str[0]);
       }
    }

    private static void saveFile (String fileName) {
      try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
          for (String key : hashMap.keySet()) {
              bw.write(String.format("%s=%s\n", key, hashMap.get(key)));
          }
      }
      catch (IOException exception){
          exception.printStackTrace();
      }
    }
}
