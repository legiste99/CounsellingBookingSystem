package za.ac.cput.factory;

import za.ac.cput.Util.GenericHelper;
import za.ac.cput.entity.Booking;
import za.ac.cput.entity.Booking;

/**BookingFactory.java
 * Factory for BookingStatus
 * Author: Lindokuhle Nini (218196504)
 * Date: 11 June 2021
 */
public class BookingFactory {

    public static Booking createBooking(String bookingId, String bookingType, String bookingTime, String bookingDate, String location, String duration){
        String userId = GenericHelper.generateId();
        Booking booking = new Booking.Builder()
                .setUserId(userId)
                .setBookingId(bookingId)
                .setBookingDate(bookingDate)
                .setBookingTime(bookingTime)
                .setBookingType(bookingType)
                .setDuration(duration)
                .setLocation(location)
                .build();
        return booking;

    }
}
