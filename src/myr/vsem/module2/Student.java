package myr.vsem.module2;

import java.util.Objects;

/**
 * @author Mykola Myroshnychenko
 * @version 1.0.0
 * @project vsem
 * @class Student
 * @since 22.03.2021 - 06.28
 */
public class Student extends Person {
    private String groupCode;
    private String numberOfStudents;
    private String chair;
    private String department;
    private String deansSurname;
    private String studentNumberID;
    private double averageScore;
    private boolean englishSkills;
    private String favoriteSubject;
    private String sportSection;
    private String socialNetworks;
    private String bestFriend;

    public Student() {
    }

    public Student(String groupCode, String numberOfStudents, String chair,
                   String department, String deansSurname, String studentNumberID,
                   double averageScore, boolean englishSkills, String favoriteSubject,
                   String sportSection, String socialNetworks, String bestFriend) {
        this.groupCode = groupCode;
        this.numberOfStudents = numberOfStudents;
        this.chair = chair;
        this.department = department;
        this.deansSurname = deansSurname;
        this.studentNumberID = studentNumberID;
        this.averageScore = averageScore;
        this.englishSkills = englishSkills;
        this.favoriteSubject = favoriteSubject;
        this.sportSection = sportSection;
        this.socialNetworks = socialNetworks;
        this.bestFriend = bestFriend;
    }

    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }

    public String getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(String numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public String getChair() {
        return chair;
    }

    public void setChair(String chair) {
        this.chair = chair;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDeansSurname() {
        return deansSurname;
    }

    public void setDeansSurname(String deansSurname) {
        this.deansSurname = deansSurname;
    }

    public String getStudentNumberID() {
        return studentNumberID;
    }

    public void setStudentNumberID(String studentNumberID) {
        this.studentNumberID = studentNumberID;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    public boolean isEnglishSkills() {
        return englishSkills;
    }

    public void setEnglishSkills(boolean englishSkills) {
        this.englishSkills = englishSkills;
    }

    public String getFavoriteSubject() {
        return favoriteSubject;
    }

    public void setFavoriteSubject(String favoriteSubject) {
        this.favoriteSubject = favoriteSubject;
    }

    public String getSportSection() {
        return sportSection;
    }

    public void setSportSection(String sportSection) {
        this.sportSection = sportSection;
    }

    public String getSocialNetworks() {
        return socialNetworks;
    }

    public void setSocialNetworks(String socialNetworks) {
        this.socialNetworks = socialNetworks;
    }

    public String getBestFriend() {
        return bestFriend;
    }

    public void setBestFriend(String bestFriend) {
        this.bestFriend = bestFriend;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + super.getFirstName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                ", patronynicName='" + super.getPatronynicName() + '\'' +
                ", address='" + super.getAddress() + '\'' +
                ", age=" + super.getAge() +
                ", height=" + super.getHeight() +
                ", wight=" +super.getWight() +
                ", passportID='" + super.getPassportID() + '\'' +
                ", eyeColor='" + super.getEyeColor() + '\'' +
                ", phoneNumber='" + super.getPhoneNumber() + '\'' +
                ", hobby='" + super.getHobby() + '\'' +
                ", profession='" + super.getProfession() + '\'' +
                ", married='" + super.isMarried() + '\'' +
                ",groupCode='" + groupCode + '\'' +
                ", numberOfStudents='" + numberOfStudents + '\'' +
                ", chair='" + chair + '\'' +
                ", department='" + department + '\'' +
                ", deansSurname='" + deansSurname + '\'' +
                ", studentNumberID='" + studentNumberID + '\'' +
                ", averageScore=" + averageScore +
                ", englishSkills=" + englishSkills +
                ", favoriteSubject='" + favoriteSubject + '\'' +
                ", sportSection='" + sportSection + '\'' +
                ", socialNetworks='" + socialNetworks + '\'' +
                ", bestFriend='" + bestFriend + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return Double.compare(student.getAverageScore(), getAverageScore()) == 0 &&
                isEnglishSkills() == student.isEnglishSkills() &&
                Objects.equals(getGroupCode(), student.getGroupCode()) &&
                Objects.equals(getNumberOfStudents(), student.getNumberOfStudents()) &&
                Objects.equals(getChair(), student.getChair()) &&
                Objects.equals(getDepartment(), student.getDepartment()) &&
                Objects.equals(getDeansSurname(), student.getDeansSurname()) &&
                Objects.equals(getStudentNumberID(), student.getStudentNumberID()) &&
                Objects.equals(getFavoriteSubject(), student.getFavoriteSubject()) &&
                Objects.equals(getSportSection(), student.getSportSection()) &&
                Objects.equals(getSocialNetworks(), student.getSocialNetworks()) &&
                Objects.equals(getBestFriend(), student.getBestFriend());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getGroupCode(), getNumberOfStudents(),
                getChair(), getDepartment(), getDeansSurname(), getStudentNumberID(),
                getAverageScore(), isEnglishSkills(), getFavoriteSubject(), getSportSection(),
                getSocialNetworks(), getBestFriend());
    }
}

/*
Mykola
Myroshnychenko
Serhiyovych
26 Hrytsevets Street
24.0
1.88
99.5
MT4865412
Blue
+380997417176
Music
Programmer
false
8.04.122.010.20.2
5
Computer science
Information Technology
Kots
XA 13294828
93.5
true
Java programming
Table Tennis
Instagram
Ivan
*/