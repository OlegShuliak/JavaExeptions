package Lesson3.homework;

import java.util.Objects;

public class PersonInfo {
    private FIO fio;
    private DateOfBirth date;
    private PhoneNumber number;
    private Gender gender;

    public PersonInfo(FIO fio, DateOfBirth date, PhoneNumber number, Gender gender) {
        this.fio = fio;
        this.date = date;
        this.number = number;
        this.gender = gender;
    }

    public PersonInfo() {
    }

    public void create(String[] info) {
        try {
            if (info.length != 6) {
                throw new RuntimeException("Повторите попытку ввода данных:");
            } else {
                this.fio = new FIO(info[0], info[1], info[2]);
                this.date = new DateOfBirth(info[3]);
                this.number = new PhoneNumber(info[4]);
                this.gender = new Gender(info[5]);
            }
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    public FIO getFio() {
        return fio;
    }

    public void setFio(FIO fio) {
        this.fio = fio;
    }

    public DateOfBirth getDate() {
        return date;
    }

    public void setDate(DateOfBirth date) {
        this.date = date;
    }

    public PhoneNumber getNumber() {
        return number;
    }

    public void setNumber(PhoneNumber number) {
        this.number = number;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }


    @Override
    public String toString() {
        return String.format("%s %s %s %s", fio, date, number, gender);
    }
}
