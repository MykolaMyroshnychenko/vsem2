package myr.vsem.module2.builder;

import myr.vsem.module2.Person;

import java.util.Objects;

/**
 * @author Mykola Myroshnychenko
 * @version 1.0.0
 * @project myr.vsem
 * @class Student
 * @since 22.03.2021 - 06.28
 */
public class Student1 extends Person {
    private String groupCode;
    private String numberOfStudents;
    private String chair;
    private String department;
    private String deansSurname;
    private String studentNumberID;
    private double averageScore;
    private String englishLevel;
    private String favoriteSubject;
    private String sportSection;
    private String socialNetworks;
    private String bestFriend;

    public Student1() {
    }

    public Student1(String groupCode, String numberOfStudents, String chair,
                    String department, String deansSurname, String studentNumberID,
                    double averageScore, String englishLevel, String favoriteSubject,
                    String sportSection, String socialNetworks, String bestFriend) {
        this.groupCode = groupCode;
        this.numberOfStudents = numberOfStudents;
        this.chair = chair;
        this.department = department;
        this.deansSurname = deansSurname;
        this.studentNumberID = studentNumberID;
        this.averageScore = averageScore;
        this.englishLevel = englishLevel;
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

    public String getEnglishLevel() {
        return englishLevel;
    }

    public void setEnglishLevel(String englishLevel) {
        this.englishLevel = englishLevel;
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
        return "Student1{" +
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
                ", englishLevel='" + englishLevel + '\'' +
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
        Student1 student = (Student1) o;
        return Double.compare(student.getAverageScore(), getAverageScore()) == 0 &&
                Objects.equals(getGroupCode(), student.getGroupCode()) &&
                Objects.equals(getNumberOfStudents(), student.getNumberOfStudents()) &&
                Objects.equals(getChair(), student.getChair()) &&
                Objects.equals(getDepartment(), student.getDepartment()) &&
                Objects.equals(getDeansSurname(), student.getDeansSurname()) &&
                Objects.equals(getStudentNumberID(), student.getStudentNumberID()) &&
                Objects.equals(getEnglishLevel(), student.getEnglishLevel()) &&
                Objects.equals(getFavoriteSubject(), student.getFavoriteSubject()) &&
                Objects.equals(getSportSection(), student.getSportSection()) &&
                Objects.equals(getSocialNetworks(), student.getSocialNetworks()) &&
                Objects.equals(getBestFriend(), student.getBestFriend());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getGroupCode(), getNumberOfStudents(),
                getChair(), getDepartment(), getDeansSurname(), getStudentNumberID(),
                getAverageScore(), getEnglishLevel(), getFavoriteSubject(), getSportSection(),
                getSocialNetworks(), getBestFriend());
    }

    public static class Builder{
        private Student1 student1ToBuild;

        public Builder() {
            this.student1ToBuild = new Student1();
        }

        public Builder setFirstName(String firstName){
            student1ToBuild.setFirstName(firstName);
            return this;
        }
        public Builder setLastName(String lastName){
            student1ToBuild.setLastName(lastName);
            return this;
        }
        public Builder setPatronynicName(String patronynicName){
            student1ToBuild.setLastName(patronynicName);
            return this;
        }
        public Builder setAddress(String address){
            student1ToBuild.setLastName(address);
            return this;
        }
        public Builder setAge(double age){
            student1ToBuild.setAge(age);
            return this;
        }
        public Builder setHeight(double height){
            student1ToBuild.setHeight(height);
            return this;
        }
        public Builder setWight(double wight){
            student1ToBuild.setWight(wight);
            return this;
        }
        public Builder setPassportID(String passportID){
            student1ToBuild.setPassportID(passportID);
            return this;
        }
        public Builder setEyeColor(String eyeColor){
            student1ToBuild.setEyeColor(eyeColor);
            return this;
        }
        public Builder setPhoneNumber(String phoneNumber){
            student1ToBuild.setPhoneNumber(phoneNumber);
            return this;
        }
        public Builder setHobby(String hobby){
            student1ToBuild.setHobby(hobby);
            return this;
        }
        public Builder setProfession(String profession){
            student1ToBuild.setProfession(profession);
            return this;
        }
        public Builder setMarried(boolean married){
            student1ToBuild.setMarried(married);
            return this;
        }
        public Builder setGroupCode(String groupCode){
            student1ToBuild.setGroupCode(groupCode);
            return this;
        }
        public Builder setNumberOfStudents(String numberOfStudents){
            student1ToBuild.setNumberOfStudents(numberOfStudents);
            return this;
        }
        public Builder setChair(String chair){
            student1ToBuild.setChair(chair);
            return this;
        }
        public Builder setDepartment(String department){
            student1ToBuild.setDepartment(department);
            return this;
        }
        public Builder setDeansSurname(String deansSurname){
            student1ToBuild.setDeansSurname(deansSurname);
            return this;
        }
        public Builder setStudentNumberID(String studentNumberID){
            student1ToBuild.setStudentNumberID(studentNumberID);
            return this;
        }
        public Builder setAverageScore(double averageScore){
            student1ToBuild.setAverageScore(averageScore);
            return this;
        }
        public Builder setEnglishLevel(String englishLevel){
            student1ToBuild.setEnglishLevel(englishLevel);
            return this;
        }
        public Builder setFavoriteSubject(String favoriteSubject){
            student1ToBuild.setFavoriteSubject(favoriteSubject);
            return this;
        }
        public Builder setSportSection(String sportSection){
            student1ToBuild.setSportSection(sportSection);
            return this;
        }
        public Builder setSocialNetworks(String socialNetworks){
            student1ToBuild.setSocialNetworks(socialNetworks);
            return this;
        }
        public Builder setBestFriend(String bestFriend){
            student1ToBuild.setBestFriend(bestFriend);
            return this;
        }

        public Student1 build(){
            return student1ToBuild;
        }

    }
}
