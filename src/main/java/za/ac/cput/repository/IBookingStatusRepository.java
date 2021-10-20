package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.entity.BookingStatus;
import za.ac.cput.entity.Student;

@Repository
public interface IBookingStatusRepository extends JpaRepository<BookingStatus, String> {

}
