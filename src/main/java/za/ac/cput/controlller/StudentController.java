package za.ac.cput.controlller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import za.ac.cput.entity.Student;
import za.ac.cput.factory.StudentFactory;
import za.ac.cput.services.StudentService;

import java.util.Set;

@RestController
@RequestMapping("/author")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/create")
    public Student create(@RequestBody Student student){
        Student newStudent = StudentFactory.createStudent(student.getStudentNumber(), student.getFirstName(),
                student.getLastName(), student.getGender(), student.getDob());
        return studentService.create(newStudent);
    }

    @GetMapping("/read")
    public Student read(@RequestBody Student student){
        return studentService.read(student.getStudentId());
    }

    @PostMapping("/update")
    public Student update(@RequestBody Student student){
        return studentService.update(student);
    }

    @PostMapping("/delete/{id}")
    public String delete(@RequestBody Student student){
        if (studentService.delete(student.getStudentId())){
            return "Deleted successfully";
        }
        else
            return "Not deleted";
    }

    @GetMapping("/getall")
    public Set<Student> getAll(){
        return studentService.getAll();
    }

//    @GetMapping("/getallwitha")
//    public Set<Student> getallwitha(){
//        return studentService.getAllWithA("a");
//    }
}
