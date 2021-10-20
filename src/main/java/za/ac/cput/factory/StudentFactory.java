package za.ac.cput.factory;

import za.ac.cput.Util.GenericHelper;
import za.ac.cput.entity.Booking;
import za.ac.cput.entity.Student;

import java.util.Date;

public class StudentFactory {

    public static Student createStudent(String studentNumber, String firstName, String lastName, String gender, Date dob){
        String studentId = GenericHelper.generateId();
        Student student = new Student.Builder()
                .setStudentId(studentId)
                .setStudentNumber(studentNumber)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setGender(gender)
                .setDob(dob)
                .build();
        return student;

    }

}
