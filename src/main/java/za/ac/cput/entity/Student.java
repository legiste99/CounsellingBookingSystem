package za.ac.cput.entity;

import java.util.Date;

public class Student {
    private String studentNumber, firstName, lastName, gender, studentId;
    private Date dob;

    private Student(){}

    private Student (Builder builder){
        this.studentNumber = builder.studentNumber;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.gender = builder.gender;
        this.studentId = builder.studentId;
        this.dob = builder.dob;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentNumber='" + studentNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", studentId='" + studentId + '\'' +
                ", dob=" + dob +
                '}';
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public String getStudentId() {
        return studentId;
    }

    public Date getDob() {
        return dob;
    }

    public static class Builder{
        private String studentNumber, firstName, lastName, gender, studentId;
        private Date dob;

        public Builder setStudentNumber(String studentNumber) {
            this.studentNumber = studentNumber;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder setStudentId(String studentId) {
            this.studentId = studentId;
            return this;
        }

        public Builder setDob(Date dob) {
            this.dob = dob;
            return this;
        }

        public Student build(){
            return new Student(this);
        }

        public Builder copy(Student student){
            this.studentNumber = student.studentNumber;
            this.firstName = student.firstName;
            this.lastName = student.lastName;
            this.gender = student.gender;
            this.studentId = student.studentId;
            this.dob = student.dob;
            return this;
        }
    }
}
