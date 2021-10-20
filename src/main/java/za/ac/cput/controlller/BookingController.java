package za.ac.cput.controlller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import za.ac.cput.entity.Booking;
import za.ac.cput.entity.Student;
import za.ac.cput.factory.BookingFactory;
import za.ac.cput.factory.StudentFactory;
import za.ac.cput.services.BookingService;
import za.ac.cput.services.StudentService;

import java.util.Set;

@RestController
@RequestMapping("/author")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @PostMapping("/create")
    public Booking create(@RequestBody Booking booking){
        Booking newBooking = BookingFactory.createBooking(booking.getBookingId(), booking.getDuration(), booking.getBookingTime(),
                booking.getBookingDate(), booking.getBookingType(), booking.getLocation());
        return bookingService.create(newBooking);
    }

    @GetMapping("/read")
    public Booking read(@RequestBody Booking booking){
        return bookingService.read(booking.getBookingId());
    }

    @PostMapping("/update")
    public Booking update(@RequestBody Booking booking){
        return bookingService.update(booking);
    }

    @PostMapping("/delete/{id}")
    public String delete(@RequestBody Booking booking){
        if (bookingService.delete(booking.getBookingId())){
            return "Deleted successfully";
        }
        else
            return "Not deleted";
    }

    @GetMapping("/getall")
    public Set<Booking> getAll(){
        return bookingService.getAll();
    }

//    @GetMapping("/getallwitha")
//    public Set<Student> getallwitha(){
//        return studentService.getAllWithA("a");
//    }
}
