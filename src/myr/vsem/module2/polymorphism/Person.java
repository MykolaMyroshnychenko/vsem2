package myr.vsem.module2.polymorphism;

import java.util.Objects;

/**
 * @author Mykola Myroshnychenko
 * @version 1.0.0
 * @project myr.vsem
 * @class Person
 * @since 22.03.2021 - 06.02
 */
public class Person {
    private String firstName;
    private String lastName;
    private String patronynicName;
    private String address;
    private double age;
    private double height;
    private double wight;
    private String passportID;
    private String eyeColor;
    private String phoneNumber;
    private String hobby;
    private String profession;
    private boolean married;

    public Person() {
    }

    public Person(String firstName, String lastName, String patronynicName,
                  String address, double age, double height, double wight,
                  String passportID, String eyeColor, String phoneNumber,
                  String hobby, String profession, boolean married) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronynicName = patronynicName;
        this.address = address;
        this.age = age;
        this.height = height;
        this.wight = wight;
        this.passportID = passportID;
        this.eyeColor = eyeColor;
        this.phoneNumber = phoneNumber;
        this.hobby = hobby;
        this.profession = profession;
        this.married = married;
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

    public String getPatronynicName() {
        return patronynicName;
    }

    public void setPatronynicName(String patronynicName) {
        this.patronynicName = patronynicName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWight() {
        return wight;
    }

    public void setWight(double wight) {
        this.wight = wight;
    }

    public String getPassportID() {
        return passportID;
    }

    public void setPassportID(String passportID) {
        this.passportID = passportID;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", patronynicName='" + patronynicName + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", wight=" + wight +
                ", passportID='" + passportID + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", hobby='" + hobby + '\'' +
                ", profession='" + profession + '\'' +
                ", married=" + married +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Double.compare(person.getAge(), getAge()) == 0 &&
                Double.compare(person.getHeight(), getHeight()) == 0 &&
                Double.compare(person.getWight(), getWight()) == 0 &&
                isMarried() == person.isMarried() && Objects.equals(getFirstName(), person.getFirstName()) &&
                Objects.equals(getLastName(), person.getLastName()) &&
                Objects.equals(getPatronynicName(), person.getPatronynicName()) &&
                Objects.equals(getAddress(), person.getAddress()) &&
                Objects.equals(getPassportID(), person.getPassportID()) &&
                Objects.equals(getEyeColor(), person.getEyeColor()) &&
                Objects.equals(getPhoneNumber(), person.getPhoneNumber()) &&
                Objects.equals(getHobby(), person.getHobby()) &&
                Objects.equals(getProfession(), person.getProfession());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getPatronynicName(),
                getAddress(), getAge(), getHeight(), getWight(), getPassportID(),
                getEyeColor(), getPhoneNumber(), getHobby(), getProfession(), isMarried());
    }
}


