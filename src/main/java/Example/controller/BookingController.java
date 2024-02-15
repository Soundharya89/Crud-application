package Example.controller;

import Example.Dto.BookingDto;
import Example.model.Booking;
import Example.model.Bus;
import Example.service.BookingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/booking")
public class BookingController {
    private BookingService bookingService;

    public BookingController (BookingService bookingService)
    {
        super();
        this.bookingService=bookingService;
    }

    @PostMapping("/addbooking/{userid}/{busid}")
    public ResponseEntity<Booking> addBooking(@PathVariable ("userid") Long userid, @PathVariable("busid") Long busid, @RequestBody BookingDto bookingDto)
    {
        return new ResponseEntity<Booking>(bookingService.addBooking(userid,busid,bookingDto), HttpStatus.CREATED);
    }

}
