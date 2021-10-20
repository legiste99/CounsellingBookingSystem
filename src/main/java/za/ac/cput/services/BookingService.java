package za.ac.cput.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.entity.Booking;
import za.ac.cput.entity.Student;
import za.ac.cput.repository.IBookingRepository;
import za.ac.cput.repository.IStudentRepository;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class BookingService implements IBookingService{

    @Autowired
    private IBookingRepository bookingRepository;

    @Override
    public Booking create(Booking b) {
        return this.bookingRepository.save(b);
    }

    @Override
    public Booking read(String str) {
        return this.bookingRepository.findById(str).orElseGet(null);
    }

    @Override
    public Booking update(Booking booking) {
        return this.bookingRepository.save(booking);
    }

    @Override
    public boolean delete(String str) {
        this.bookingRepository.deleteById(str);
        return !this.bookingRepository.existsById(str);
    }

    @Override
    public Set<Booking> getAll() {
        return this.bookingRepository.findAll().stream().collect(Collectors.toSet());
    }
}