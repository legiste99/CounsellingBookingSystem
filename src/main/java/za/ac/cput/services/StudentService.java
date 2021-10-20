package za.ac.cput.services;

import org.springframework.stereotype.Service;
import za.ac.cput.entity.Student;
import za.ac.cput.repository.StudentRepository;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

@Service
public class StudentService implements IStudentService{

    private static StudentService service = null;
    private StudentRepository repository = null;

    private StudentService(){
        this.repository = StudentRepository.getRepository();
    }

    public static StudentService getService() {
        if(service == null){
            service = new StudentService();
        }
        return service;
    }

    @Override
    public Student create(Student student) {
        return this.repository.create(student);
    }

    @Override
    public Student read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Student update(Student student) {
        return this.repository.update(student);
    }

    @Override
    public boolean delete(String s) {
        return this.repository.delete(s);
    }

    @Override
    public Set<Student> getAll() {
        return this.repository.getAll();
    }

    public Set<Student> getAllWithA(){
        Set<Student> studentWithA = new HashSet<Student>();
        Set<Student> student = getAll();
        for(Student s : student){
            if(s.getFirstName().trim().toLowerCase().startsWith("a")){
                studentWithA.add(s);
            }
        }
        return studentWithA;
    }
}
