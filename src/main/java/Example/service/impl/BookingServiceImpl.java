package Example.service.impl;

import Example.Dto.BookingDto;
import Example.model.Booking;
import Example.model.Bus;
import Example.model.User;
import Example.repository.BookingRepository;
import Example.repository.BusRepository;
import Example.repository.UserRepository;
import Example.service.BookingService;
import org.springframework.stereotype.Service;

@Service
public class BookingServiceImpl implements BookingService {

    private BookingRepository bookingRepository;
    private UserRepository userRepository;
    private BusRepository busRepository;

    public BookingServiceImpl(BookingRepository bookingRepository,UserRepository userRepository,BusRepository busRepository)
    {
        super();
        this.bookingRepository=bookingRepository;
        this.userRepository=userRepository;
        this.busRepository=busRepository;
    }
    @Override
    public Booking addBooking(Long userId, Long busId, BookingDto booking) {

        User existingUser = userRepository.findById(userId).orElse(null);
        Bus busdetail = busRepository.findById(busId).orElse(null);
        Booking userbooking = new Booking();
        userbooking.setDate(booking.getDate());
        userbooking.setDeparture(booking.getDeparture());
        userbooking.setUser(existingUser);
        userbooking.setBus(busdetail);
        bookingRepository.save(userbooking);
        return  userbooking;


    }
}
