package za.ac.cput.services;

import za.ac.cput.entity.Student;

import java.util.Set;

public interface IStudentService extends IService<Student, String> {
    public Set<Student> getAll();
}
