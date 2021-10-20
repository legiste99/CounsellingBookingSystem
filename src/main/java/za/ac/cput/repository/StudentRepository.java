package za.ac.cput.repository;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import za.ac.cput.entity.Student;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
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

    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public List<Student> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Student> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Student> findAllById(Iterable<String> strings) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(String s) {

    }

    @Override
    public void delete(Student entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends String> strings) {

    }

    @Override
    public void deleteAll(Iterable<? extends Student> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Student> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Student> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Student> findById(String s) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String s) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Student> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Student> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Student> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<String> strings) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Student getOne(String s) {
        return null;
    }

    @Override
    public Student getById(String s) {
        return null;
    }

    @Override
    public <S extends Student> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Student> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Student> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Student> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Student> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Student> boolean exists(Example<S> example) {
        return false;
    }
}
