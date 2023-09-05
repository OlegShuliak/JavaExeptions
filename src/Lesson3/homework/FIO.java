package Lesson3.homework;

public class FIO {
    private String firstName;
    private String secondName;
    private String lastName;

    public FIO(String firstName, String secondName, String lastName) throws RuntimeException {

        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "<" + firstName + "> " +
                "<" + secondName + "> " +
                "<" + lastName + ">";
    }
}
