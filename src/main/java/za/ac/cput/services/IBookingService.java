package za.ac.cput.services;

import za.ac.cput.entity.Booking;
import za.ac.cput.entity.Student;

import java.util.Set;

public interface IBookingService extends IService<Booking, String> {
    public Set<Booking> getAll();
}
