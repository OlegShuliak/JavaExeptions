package Lesson3.homework;

import java.util.Objects;

public class Gender {
    private String gender;

    public Gender(String gender) {
        try {
            if (gender.equalsIgnoreCase("f") || gender.equalsIgnoreCase("m")) {
                this.gender = gender.toLowerCase();
            } else {
                throw new RuntimeException();
            }
        } catch (RuntimeException e) {
            e.printStackTrace();
            System.out.println("Некорректно введен пол (f или m). Повторите попытку ввода данных:");
        }
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    @Override
    public String toString() {
        return "<" + gender + ">";
    }
}
