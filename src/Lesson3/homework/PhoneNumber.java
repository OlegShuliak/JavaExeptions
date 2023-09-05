package Lesson3.homework;

import java.text.ParseException;
import java.util.Objects;

public class PhoneNumber {
    private int phoneNumber;

    public PhoneNumber(String stringNumber) {
        try {
            if (stringNumber.length() != 7) {
                throw new RuntimeException();
            } else {
                phoneNumber = Integer.parseInt(stringNumber);
            }

        } catch (RuntimeException e) {
            e.printStackTrace();
            System.out.println("Введен некорректный номер телефона (семизначный номер телефона). Повторите попытку ввода данных:");
        }
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    @Override
    public String toString() {
        return "<" + phoneNumber + ">";
    }
}
