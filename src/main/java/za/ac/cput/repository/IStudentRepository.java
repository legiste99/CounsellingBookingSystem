package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.entity.Booking;
import za.ac.cput.entity.Student;

import java.util.Set;

@Repository
public interface IStudentRepository extends JpaRepository<Student, String> {

}
