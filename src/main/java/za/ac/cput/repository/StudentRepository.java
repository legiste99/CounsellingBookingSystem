package za.ac.cput.repository;

import za.ac.cput.entity.Student;

import java.util.HashSet;
import java.util.Set;

public class StudentRepository implements IStudentRepository {

    private static StudentRepository repository = null;
    private Set<Student> studentDB = null;

    public StudentRepository() {
        studentDB = new HashSet<Student>();
    }

    public static StudentRepository getRepository(){
        if(repository == null)
        {
            repository = new StudentRepository();
        }
        return repository;
    }

    @Override
    public Student create(Student student) {
        boolean success = studentDB.add(student);
        if(!success){
            return null;
        }
        return student;
    }

    @Override
    public Student read(String studentId) {
        for(Student s : studentDB){
            if(s.getStudentId().equals(studentId)){
                return s;
            }
        }
        return null;
    }

    @Override
    public Student update(Student student) {
        Student oldStudent = read(student.getStudentId());
        if(oldStudent != null){
            studentDB.remove(oldStudent);
            studentDB.add(student);
            return student;
        }

        return null;
    }

    @Override
    public boolean delete(String studentId) {
        Student studentToDelete = read(studentId);
        if(studentToDelete == null){
            return false;
        }
        return true;
    }

    @Override
    public Set<Student> getAll() {
        return studentDB;
    }
}
