package Example.service;

import Example.Dto.BookingDto;
import Example.model.Booking;

public interface BookingService {
    Booking addBooking(Long userId, Long busId, BookingDto booking);
}
