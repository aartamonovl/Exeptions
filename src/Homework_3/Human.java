package Homework_3;


public class Human {
    private String firstName;
    private String lastName;
    private String patronymic;
    private String birthday;
    private String phoneNumber;
    private String gender;

    public Human(String firstName, String lastName, String patronymic, String birthday, String phoneNumber, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public Human(String[] humanDataArray) {
        this(humanDataArray[0], humanDataArray[1], humanDataArray[2], humanDataArray[3], humanDataArray[4], humanDataArray[5]);
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return lastName + " " + firstName + " " + patronymic + " " + birthday + " " + phoneNumber + " " + gender;
    }
}
