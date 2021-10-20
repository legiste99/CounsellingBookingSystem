package za.ac.cput.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.entity.Student;
import za.ac.cput.repository.IStudentRepository;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class StudentService implements IStudentService{

    @Autowired
    private IStudentRepository studentRepository;

    @Override
    public Student create(Student s) {
        return this.studentRepository.save(s);
    }

    @Override
    public Student read(String str) {
        return this.studentRepository.findById(str).orElseGet(null);
    }

    @Override
    public Student update(Student room) {
        return this.studentRepository.save(room);
    }

    @Override
    public boolean delete(String str) {
        this.studentRepository.deleteById(str);
        return !this.studentRepository.existsById(str);
    }

    @Override
    public Set<Student> getAll() {
        return this.studentRepository.findAll().stream().collect(Collectors.toSet());
    }
}