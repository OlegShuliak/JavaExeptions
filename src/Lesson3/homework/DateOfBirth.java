package Lesson3.homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class DateOfBirth {
    private String stringDate;

    public DateOfBirth(String stringDate) {
        try {
            Date date = new SimpleDateFormat("dd.MM.yyyy").parse(stringDate);
            if (stringDate.length() != 10) {
                throw new RuntimeException();
            }
            this.stringDate = stringDate;
        } catch (RuntimeException | ParseException e) {
            e.printStackTrace();
            System.out.println("Некорректный ввод даты рождения (dd.MM.yyyy). Повторите попытку ввода данных:");
        }
    }

    public String getStringDate() {
        return stringDate;
    }

    public void setStringDate(String stringDate) {
        this.stringDate = stringDate;
    }


    @Override
    public String toString() {
        return "<" + stringDate + ">";
    }
}
